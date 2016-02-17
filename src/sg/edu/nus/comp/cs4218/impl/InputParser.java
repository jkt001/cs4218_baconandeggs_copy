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

	ArrayList<Application> toRun;
	ArrayList<String[]> args;
	ArrayList<InputStream> ins;
	ArrayList<OutputStream> outs;
	
	public InputParser() {
		toRun = new ArrayList<Application>();
		args = new ArrayList<String[]>();
		ins = new ArrayList<InputStream>();
		outs = new ArrayList<OutputStream>();
	}
	
	public void parse(String cmdline, OutputStream out) throws ShellException{
		ArrayList<String> args = null;
		StringBuilder cmd = new StringBuilder();
		boolean foundCmd = false;
		boolean openQuotes = false;
		for (int i = 0; i<cmdline.length(); i++) {
			char thisChar = cmdline.charAt(i);
			if (!openQuotes) {
				if (thisChar == ';') {
					
				}
			if (!foundCmd) {
				if (thisChar == ' ') {
					foundCmd = true;
				} else {
					cmd.append(thisChar);
				}
			} else {
				
			}
			}
		}
	}
	
	public void evaluate() throws AbstractApplicationException {
		for (int i = 0; i<toRun.size(); i++) {
			toRun.get(i).run(args.get(i), ins.get(i), outs.get(i));
		}
	}
	
	private Application getApplication(String cmd) throws ShellException {
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
