package sg.edu.nus.comp.cs4218.impl.cmd;

import java.io.InputStream;
import java.io.OutputStream;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Command;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.app.CatApplication;
import sg.edu.nus.comp.cs4218.impl.app.CdApplication;
import sg.edu.nus.comp.cs4218.impl.app.EchoApplication;
import sg.edu.nus.comp.cs4218.impl.app.FindApplication;
import sg.edu.nus.comp.cs4218.impl.app.HeadApplication;
import sg.edu.nus.comp.cs4218.impl.app.LsApplication;
import sg.edu.nus.comp.cs4218.impl.app.PwdApplication;
import sg.edu.nus.comp.cs4218.impl.app.WcApplication;

public class CallCommand implements Command {
	
	public static final String INVALID_CMD = "Invalid command.";
	
	String app;
	String[] argsArray;
	
	public CallCommand(String app, String[] args){
		this.app = app;
		this.argsArray = args;
	}

	@Override
	public void evaluate(InputStream stdin, OutputStream stdout)
			throws AbstractApplicationException, ShellException {
		Application absApp = null;
		if (("pwd".equals(app))) {
			absApp = new PwdApplication();
		} else if (("cd").equals(app)) {// cd PATH
			absApp = new CdApplication();
		} else if (("ls").equals(app)) {// ls
			absApp = new LsApplication();
		} else if (("cat").equals(app)) {// cat [FILE]...
			absApp = new CatApplication();
		} else if (("echo").equals(app)) {// echo [args]...
			absApp = new EchoApplication();
		} else if (("head").equals(app)) {// head [OPTIONS] [FILE]
			absApp = new HeadApplication();
		} else if (("tail").equals(app)) {// tail [OPTIONS] [FILE]
			// absApp = new TailApplication();
		} else if (("grep").equals(app)) {// grep PATTERN [FILE]...
			// absApp = new GrepApplication();
		} else if (("sed").equals(app)) {// sed REPLACEMENT [FILE]
			// absApp = new SedApplication();
		} else if (("find").equals(app)) {// find [PATH] ­name PATTERN
			absApp = new FindApplication();
		} else if (("wc").equals(app)) {// wc [OPTIONS] [FILE]...
			absApp = new WcApplication();
		} else { // invalid command
			throw new ShellException(INVALID_CMD);
		}
		if (absApp == null) {
			throw new ShellException(INVALID_CMD);
		} else {
			absApp.run(argsArray, stdin, stdout);
		}

	}

	@Override
	public void terminate() {
		// TODO Auto-generated method stub

	}

}
