package sg.edu.nus.comp.cs4218;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.app.CatApplication;
import sg.edu.nus.comp.cs4218.impl.app.EchoApplication;
import sg.edu.nus.comp.cs4218.impl.app.HeadApplication;
import sg.edu.nus.comp.cs4218.impl.app.TailApplication;

/**
 * A parser handles all operations related to command parsing, which includes semicolon and quoting.
 * 
 * @author wilson
 */
public class Parser {
	
	//Parse & Evaluate shared variables
	private ArrayList<String> comds = new ArrayList<String>();
	private ArrayList<String[]> args = new ArrayList<String[]>();
	private ArrayList<InputStream> ins = new ArrayList<InputStream>();
	private ArrayList<OutputStream> outs = new ArrayList<OutputStream>();
	
	//Parse variables
	private StringBuilder currentWord;
	private ArrayList<String> currentArgs;
	private boolean isWithinQuotes;
	private char openQuotation;
	private boolean isFirstArg;
	private boolean isWrapped;
	
	public Parser() {
		comds = new ArrayList<String>();
		args = new ArrayList<String[]>();
		ins = new ArrayList<InputStream>();
		outs = new ArrayList<OutputStream>();
		currentWord = new StringBuilder();
		currentArgs = new ArrayList<String>();
		isWithinQuotes = false;
		openQuotation = ' ';
		isFirstArg = true;
		isWrapped = false;
	}
	
	/**
	 * Parses the given input and stores in class variables for evaluation
	 * 
	 * @param cmdline
	 * 				String input from user
	 *  
	 * @param stdout
	 * 				Output stream to write to 
	 *  
	 * @throws AbstractApplicationException
	 *				If application throws one
	 * 
	 * @throws ShellException
	 * 				If no such command is found
	 */
	public void parse(String cmdline, OutputStream stdout) throws ShellException, AbstractApplicationException {
		cmdline = postpendSemicolon(cmdline);
		
		for (int i = 0; i<cmdline.length(); i++) {
			char thisChar = cmdline.charAt(i);
			if (thisChar == '"' || thisChar == '\'' || thisChar == '`') {
				if (isWithinQuotes) {
					possibleClosureOfQuotation(thisChar);
				} else {
					openQuotation = thisChar;
					isWithinQuotes = true;
				}
			} else {
				if (isWithinQuotes) {
					currentWord.append(thisChar);
				} else {
					if (thisChar == ';') {
						endOfLineParse(stdout);
						currentArgs = new ArrayList<String>();
						currentWord = new StringBuilder();
						isFirstArg = true;
					} else if (thisChar == ' ') {
						if (currentWord.length() > 0) {
							if (isFirstArg) {
								isFirstArg = !isFirstArg;
								comds.add(currentWord.toString());
							} else {
								currentArgs.add(currentWord.toString());	
							}
							currentWord = new StringBuilder();	
						}
					} else {
						currentWord.append(thisChar);
					}
				}
			}
		}
	}
	
	/**
	 * Postpends the command line with a semicolon
	 * 
	 * @param cmdline
	 * 				command line to postpend semicolon to
	 * @return
	 * 				command line with a semicolon all the time
	 */
	private String postpendSemicolon(String cmdline) {
		if (!cmdline.endsWith(";")) {
			cmdline = cmdline + ";";
		}
		return cmdline;
	}
	
	/**
	 * Handles parsing when there is an open quotation in the string the preceeds the current character.
	 * Actions depend on the type of quotation there was, as well as what is the current character.
	 * 
	 * @param thisChar
	 * 				the current character that we have a possible closure on
	 * @throws AbstractApplicationException
	 * 				if the recursive parse encounters one
	 * @throws ShellException
	 * 				if the recursive parse encounters one
	 */
	private void possibleClosureOfQuotation(char thisChar) throws ShellException, AbstractApplicationException {
		if (thisChar == openQuotation) {
			if (thisChar =='`') {
				String nextWord = recursivelyParse(currentWord.toString());
				currentArgs.add(nextWord);
				if (isWrapped) {
					openQuotation = '"';
					isWrapped = false;
					isWithinQuotes = true;
				} else {
					isWithinQuotes = false;
				}
			} else {
				if (isFirstArg) {
					isFirstArg = !isFirstArg;
					comds.add(currentWord.toString());
				} else {
					currentArgs.add(currentWord.toString());
				}
				isWithinQuotes = false;
			}
			currentWord = new StringBuilder();
		} else if (thisChar == '`' && openQuotation == '"') {
			openQuotation = '`';
			isWrapped = true;
			isWithinQuotes = true;
		} else {
			currentWord.append(thisChar);
			isWithinQuotes = true;
		}
	}
	
	/**
	 * Parses when end of line is encountered (denoted by ";")
	 * 
	 * @param stdout
	 * 				Output stream of the current command
	 */
	private void endOfLineParse(OutputStream stdout) {
		if (isFirstArg) {
			comds.add(currentWord.toString());
		} else {
			if (currentWord.length() > 0) {
				currentArgs.add(currentWord.toString());
			}
		}
		String[] arguments = new String[currentArgs.size()];
		arguments = currentArgs.toArray(arguments);
		args.add(arguments);
		outs.add(stdout);
		ins.add(System.in);
	}

	/**
	 * Creates a byte array and recursively parses the command while extracting the output and inserting
	 * it back into the args
	 *
	 * @throws AbstractApplicationException
	 * 						if parse throws one
	 * @throws ShellException
	 * 						if parse throws one
	 */
	protected String recursivelyParse(String toParse) throws ShellException, AbstractApplicationException {
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		Parser nextInstance = new Parser();
		nextInstance.parse(toParse, bo);
		nextInstance.evaluate();
		String result = "";
		try {
			result = bo.toString("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Evaluates the results of parsing by checking the comds and giving the correct arguments
	 * and inputstreams/outputstreams
	 * 
	 * @throws ShellException
	 * 						if the applications throw one
	 * @throws AbstractApplicationException
	 * 						if the applications throw one
	 */
	public void evaluate() throws ShellException, AbstractApplicationException {
		for(int i = 0; i<comds.size(); i++) {
			runApplication(comds.get(i), args.get(i), ins.get(i), outs.get(i));
		}
	}
	
	/**
	 * Runs the application based on the arguments provided.
	 * Protected allows stubbing of the method such these applications do not actually run
	 * 
	 * @param cmd
	 * 				command to decide which application to run
	 * @param args
	 * 				arguments for this command
	 * @param in
	 * 				inputstream for this command
	 * @param out
	 * 				outputstream for this command
	 * @throws ShellException
	 * 				if the application throws one
	 * @throws AbstractApplicationException
	 * 				if the application throws one
	 */
	protected void runApplication(String cmd, String[] args, InputStream in, OutputStream out) throws ShellException, AbstractApplicationException {
		Application result = null;
		switch(cmd){
		case "cat":
			result= new CatApplication();
			break;
		case "echo":
			result = new EchoApplication();
			break;
		case "head":
			result = new HeadApplication();
			break;
		case "tail":
			result = new TailApplication();
			break;
		case "fmt":
		case "date":
		default:
			throw new ShellException("Unrecognized command");
		}
		result.run(args, in, out);
	}

	//Testing methods
	public void print() {
		System.out.println("comds = " + comds.size());
		System.out.println("args size= " + args.size());
		System.out.println("ins size =" + ins.size());
		System.out.println("outs.size = " +outs.size());
		
		for(int i = 0; i<comds.size(); i++) {
			System.out.println(comds.get(i));
			System.out.print("args = ");
			System.out.println(args.get(i).length);
			for(int j = 0; j<args.get(i).length; j++) {
				System.out.println("here" + args.get(i)[j]);
			}
		}
	}
	
	//Stubbing methods for testing
	public ArrayList<String> getCommands() {
		return comds;
	}
	
	public ArrayList<String[]> getArguments() {
		return args;
	}
	
	public ArrayList<InputStream> getInputStreams() {
		return ins;
	}
	
	public ArrayList<OutputStream> getOutputStreams() {
		return outs;
	}
}
