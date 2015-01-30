package sg.edu.nus.comp.cs4218.impl;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.Shell;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.app.*;
import sg.edu.nus.comp.cs4218.impl.cmd.PipeCommand;

public class ShellImpl implements Shell {

	@Override
	public void parseAndEvaluate(String cmdline, OutputStream stdout)
			throws AbstractApplicationException, ShellException {

		String[] cmdArray = cmdline.split(";");

		for (int i = 0; i < cmdArray.length; i++) {
			String cmd = cmdArray[i].trim(); // trim leading and trailing spaces
			
			//look for | 
			if(cmd.contains("|")) {
				evaluatePipe(cmd);			
			}
			else {
				evaluateCall(cmd, System.in, stdout);
			}

		}
	}

	public void evaluateCall(String cmd, InputStream stdin, OutputStream stdout) 
			throws AbstractApplicationException, ShellException{
		
		// process command
		String[] cmdTokensArray = splitString(cmd);
		String app = cmdTokensArray[0];
		String[] argsArray;

		if (cmdTokensArray.length > 1)
		{
			argsArray = Arrays.copyOfRange(cmdTokensArray, 1,
					cmdTokensArray.length);
		}
		else
		{
			argsArray = new String[0];
		}
		// first word of command is the application
	
		switch (app) {

		case "pwd": {
			// pwd
			PwdApplication pwdApp = new PwdApplication();
			pwdApp.run(argsArray, stdin, stdout);
			break;
		}
		case "cd": {
			// cd PATH
			CdApplication cdApp = new CdApplication();
			cdApp.run(argsArray, stdin, stdout);
			break;
		}
		case "ls": {
			// ls PATH
			break;
		}
		case "cat": {
			// cat [FILE]...
			break;
		}
		case "echo": {
			// echo [ARG]...
			break;
		}
		case "head": {
			// head [OPTIONS] [FILE]
			break;
		}
		case "tail": {
			// tail [OPTIONS] [FILE]
			break;
		}
		case "grep": {
			// grep PATTERN [FILE]...
			break;
		}
		case "sed": {
			// sed REPLACEMENT [FILE]
			break;
		}
		case "find": {
			// find [PATH] ­name PATTERN
			break;
		}
		case "wc": {
			// wc [OPTIONS] [FILE]...
			break;
		}
		case "exit": {
			System.out.println("Thank you for using CS4218 Shell!");
			System.exit(0); 
		}
		case "test": {
			TestApplication testApp = new TestApplication();
			testApp.run(argsArray, stdin, stdout);
			break;
		}
		default: {
			throw new ShellException("Invalid Command");
		}
		}
	}
	
	
	// splits string using delimiters
	public String[] splitString(String str)
	{
		Vector<String> cmdVector = new Vector<String>();
		int endIndx = 0;
		
		Pattern appWordP = Pattern.compile( "([A-Za-z]*)");
		Matcher appWordM = appWordP.matcher(str);
		if(appWordM.find()) //should be got
		{
			String s = appWordM.group(1);		    
		    cmdVector.add(s);
		    endIndx = endIndx + appWordM.end();
		}
		
		//for wc -l
		Pattern optionsP = Pattern.compile( "[\\s]*(-[A-Za-z])[\\s]" );
		Matcher optionsM = optionsP.matcher(str.substring(endIndx));
		if(optionsM.find()) 
		{
			String s = optionsM.group(1);		    
		    cmdVector.add(s);
		    endIndx = endIndx + optionsM.end();
		}
		
		Pattern fileNameP = Pattern.compile( "[\\s]*([\\s]*[A-Za-z0-9\\-\\.\\\\/]*[\\*])" );
		Matcher fileNameM = fileNameP.matcher(str.substring(endIndx));
		if(fileNameM.find()) 
		{
			String s = fileNameM.group(1);		    
		    cmdVector.add(s);
		    endIndx = endIndx + fileNameM.end();
		}
		
		//for find -name
		Pattern dashNameP = Pattern.compile( "[\\s]*(-name)" );
		Matcher dashNameM = dashNameP.matcher(str.substring(endIndx));
		if(dashNameM.find()) 
		{
			String s = dashNameM.group(1);		    
		    cmdVector.add(s);
		    endIndx = endIndx + dashNameM.end();
		}
		
	
		Pattern inputStreamP = Pattern.compile(  "[\\s]*(<[\\s]*[A-Za-z0-9\\-.\\\\/]*)" );
		Matcher inputStreamM = inputStreamP.matcher(str.substring(endIndx));
		if(inputStreamM.find())
		{
			String s = inputStreamM.group(1);		    
		    cmdVector.add(s);
		    endIndx = endIndx + inputStreamM.end();
		}
		
		Pattern outputStreamP = Pattern.compile(  "[\\s]*(>[\\s]*[A-Za-z0-9\\-.\\\\/]*)" );
		Matcher outputStreamM = outputStreamP.matcher(str.substring(endIndx));
		if(outputStreamM.find())
		{
			String s = outputStreamM.group(1);		    
		    cmdVector.add(s);
		    endIndx = endIndx + outputStreamM.end();
		}
		
		Pattern doubleQuotesP =  Pattern.compile(  "[\\s]*(\"[\\s]*[\\sA-Za-z0-9\\-.\\\\/]*[\\s]*\")" );
		Matcher doubleQuotesM = doubleQuotesP.matcher(str.substring(endIndx));
		if(doubleQuotesM.find())
		{
			String s = doubleQuotesM.group(1);		    
		    cmdVector.add(s);
		    endIndx = endIndx + doubleQuotesM.end();
		}
		
		Pattern singleQuotesP = Pattern.compile(  "[\\s]*(\'[\\s]*[\\sA-Za-z0-9\\-.\\\\/]*[\\s]*\') " );
		Matcher singleQuotesM = singleQuotesP.matcher(str.substring(endIndx));
		if(singleQuotesM.find())
		{
			String s = singleQuotesM.group(1);		    
		    cmdVector.add(s);
		    endIndx = endIndx + singleQuotesM.end();
		}
		
		Pattern backQuotesP = Pattern.compile(  "[\\s]*(`[\\s]*[\\sA-Za-z0-9\\-.\\\\/]*[\\s]*`)" );
		Matcher backQuotesM = backQuotesP.matcher(str.substring(endIndx));
		if(backQuotesM.find())
		{
			String s = backQuotesM.group(1);		    
		    cmdVector.add(s);
		    endIndx = endIndx + backQuotesM.end();
		}
		  
		 //System.out.println(cmdVector.toString());
		
		return cmdVector.toArray(new String[cmdVector.size()]);
	}
	
	
	
	public void evaluatePipe(String cmd) throws AbstractApplicationException, ShellException{
		String[] pipeCmdArray = cmd.split("\\|");
		
		byte[] buffer = new byte[1024];
		InputStream stdin = new ByteArrayInputStream(buffer);
		OutputStream stdout = new ByteArrayOutputStream();
		
		for(int i = 0; i < pipeCmdArray.length; i++)
		{
			evaluateCall(pipeCmdArray[i].trim(), stdin, stdout);
			stdin = new ByteArrayInputStream(((ByteArrayOutputStream) stdout).toByteArray()); 
			stdout = new ByteArrayOutputStream();
			
/*			PipeCommand pc = new PipeCommand();
			try {
				pc.evaluate(stdin, stdout);
			} catch (AbstractApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ShellException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShellImpl shell = new ShellImpl();

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String readLine = null;
		String currentDir;
		
		while (true) {
			try {
				currentDir = Environment.currentDirectory; 
				System.out.print(currentDir + ">");
				readLine = bReader.readLine();
				shell.parseAndEvaluate(readLine, System.out);
			} catch (Exception e) {
				System.out.println("Error: "+e.getMessage());
			}

		}

	}

}
