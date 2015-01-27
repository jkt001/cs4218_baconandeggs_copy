package sg.edu.nus.comp.cs4218.impl;

import java.io.*;
import java.util.*;

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
		String[] cmdTokensArray = cmd.split(" ");
		String app = cmdTokensArray[0];
		String[] args;

		if (cmdTokensArray.length > 1)
		{
			args = Arrays.copyOfRange(cmdTokensArray, 1,
					cmdTokensArray.length);
		}
		else
		{
			args = new String[0];
		}
		// first word of command is the application
	
		switch (app) {

		case "pwd": {
			// pwd
			PwdApplication pwdApp = new PwdApplication();
			pwdApp.run(args, stdin, stdout);
			break;
		}
		case "cd": {
			// cd PATH
			CdApplication cdApp = new CdApplication();
			cdApp.run(args, stdin, stdout);
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
		case "test": {
			TestApplication testApp = new TestApplication();
			testApp.run(args, stdin, stdout);
			break;
		}
		default: {
			throw new ShellException("Invalid Command");
		}
		}
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
			} catch (IOException|AbstractApplicationException|ShellException e) {
				System.out.println(e.getMessage());
			}

		}

	}

}
