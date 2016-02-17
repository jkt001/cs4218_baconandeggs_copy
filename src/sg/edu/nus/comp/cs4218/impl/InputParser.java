package sg.edu.nus.comp.cs4218.impl;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.app.*;

public class InputParser {

	ArrayList<String> comds;
	ArrayList<String[]> args;
	ArrayList<InputStream> ins;
	ArrayList<OutputStream> outs;
	
	public InputParser() {
		comds = new ArrayList<String>();
		args = new ArrayList<String[]>();
		ins = new ArrayList<InputStream>();
		outs = new ArrayList<OutputStream>();
	}
	
//	public void parse(String cmdline, OutputStream out) throws ShellException{
//		ArrayList<String> comdArgs = new ArrayList<String>();
//		StringBuilder cmd = new StringBuilder();
//		StringBuilder thisArg = new StringBuilder();
//		boolean foundCmd = false;
//		boolean disableSpecial = false;
//		boolean disableBackQuotes = false;										//Unimplemented at this point
//		for (int i = 0; i<cmdline.length(); i++) {
//			char thisChar = cmdline.charAt(i);
//			if (!disableSpecial) {
//				if (thisChar == ';') {
//					String[] arguments = new String[comdArgs.size()];
//					arguments = comdArgs.toArray(arguments);
//					args.add(arguments);
//					ins.add(System.in); 										//Unfinalized at this point
//					outs.add(out);
//					//Reinitialized variables
//					cmd = new StringBuilder();
//					comdArgs = new ArrayList<String>();
//				} else {
//					if (!foundCmd) {
//						if (thisChar == ' ') {
//							comds.add(cmd.toString());
//							foundCmd = true;
//						} else {
//							cmd.append(thisChar);
//						}
//					} else {
//						if (thisChar == ' ') {
//							comdArgs.add(thisArg.toString());
//							thisArg = new StringBuilder();
//						} else {
//							thisArg.append(thisChar);
//						}
//					}
//				}
//			} else {
//				//if need to close disabledbackquotes
//			}
//		}
//	}
	
	public void parse(String cmdline, OutputStream out) throws ShellException {
		StringBuilder currentWord = new StringBuilder();
		ArrayList<String> currentArgs = new ArrayList<String>();
		boolean isWithinQuotes = false;
		char openQuotation = ' ';
		boolean isFirstArg = true;
		boolean isWrapped = false;
		System.out.println("enter parse");
		if (!cmdline.endsWith(";")) {
			cmdline = cmdline + ";";
		}
		
		for (int i = 0; i<cmdline.length(); i++) {
			char thisChar = cmdline.charAt(i);
			if (thisChar == '"' || thisChar == '\'' || thisChar == '`') {
				if (isWithinQuotes) {
					if (thisChar == openQuotation) {
						if (thisChar =='`') {
							//parse the current word since it is a command
							//may wanna use bytearrayoutputstream
							//using the output stream, convert it to a string and add to current args
							if (isWrapped) {										//Sets the condition to pre-backquote which is double quote
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
							currentWord = new StringBuilder();
							isWithinQuotes = false;
						}
					} else if (thisChar == '`' && openQuotation == '"') {			//Only need to handle this case as ' ignores special chars
						openQuotation = '`';
						isWrapped = true;
						isWithinQuotes = true;
					} else {
						currentWord.append(thisChar);
						isWithinQuotes = true;
					}
				} else {
					openQuotation = thisChar;
					isWithinQuotes = true;
				}
			} else {
				if (isWithinQuotes) {
					currentWord.append(thisChar);
				} else {
					if (thisChar == ';') {
						currentArgs.add(currentWord.toString());
						String[] arguments = new String[currentArgs.size()];
						arguments = currentArgs.toArray(arguments);
						args.add(arguments);
						outs.add(out);
						ins.add(System.in);
						currentArgs = new ArrayList<String>();
						currentWord = new StringBuilder();
					} else if (thisChar == ' ') {
						if (isFirstArg) {
							isFirstArg = !isFirstArg;
							comds.add(currentWord.toString());
						} else {
							currentArgs.add(currentWord.toString());	
						}
						currentWord = new StringBuilder();
					} else {
						currentWord.append(thisChar);
					}
				}
			}
		}
		
		System.out.println(comds.size());
		System.out.println(args.size());
		System.out.println(ins.size());
		System.out.println(outs.size());
		
		for(int i = 0; i<comds.size(); i++) {
			System.out.println(comds.get(i));
			System.out.print("args = ");
			for(int j = 0; j<args.get(i).length; j++) {
				System.out.println(args.get(i)[j]);
			}
			
		}
	}
	
	public void evaluate() throws AbstractApplicationException {
//		for (int i = 0; i<toRun.size(); i++) {
//			toRun.get(i).run(args.get(i), ins.get(i), outs.get(i));
//		}
	}
	
	private Application runApplication(String cmd) throws ShellException {
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
			break;
		case "date":
			break;
		default:
			throw new ShellException("Unrecognized command");
		}
		return result;
	}
}
