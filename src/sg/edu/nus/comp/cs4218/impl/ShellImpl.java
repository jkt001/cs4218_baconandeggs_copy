package sg.edu.nus.comp.cs4218.impl;

import java.io.*;
import java.util.*;

import sg.edu.nus.comp.cs4218.Shell;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.app.*;

public class ShellImpl implements Shell {

	@Override
	public void parseAndEvaluate(String cmdline, OutputStream stdout)
			throws AbstractApplicationException, ShellException {

		String[] cmdArray = cmdline.split(";");

		for (int i = 0; i < cmdArray.length; i++) {
			String cmd = cmdArray[i].trim(); // trim leading and trailing spaces
			
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
				pwdApp.run(args, System.in, stdout);
				break;
			}
			case "cd": {
				// cd PATH
				CdApplication cdApp = new CdApplication();
				cdApp.run(args, System.in, stdout);
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
			default: {
				throw new ShellException("Invalid Command");
			}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShellImpl shell = new ShellImpl();

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String readLine = null;
		while (true) {
			try {
				readLine = bReader.readLine();
				shell.parseAndEvaluate(readLine, System.out);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (AbstractApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ShellException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
