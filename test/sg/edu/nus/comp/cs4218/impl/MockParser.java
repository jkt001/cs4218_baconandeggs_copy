package sg.edu.nus.comp.cs4218.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;

public class MockParser extends Parser {
	
	public void parse(String cmdline, OutputStream stdout) throws ShellException, AbstractApplicationException {
		super.parse(cmdline, stdout);
	}
	
	protected void runApplication(String cmd, String[] args, InputStream in, OutputStream out) throws ShellException, AbstractApplicationException {
		try {
			String mockOutput = "Mocked Output";
			out.write(mockOutput.getBytes());
		} catch (IOException e) {
			throw new ShellException("Unable to write to output");
		}
	}
	
	protected String recursivelyParse(String toParse) throws ShellException, AbstractApplicationException {
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		MockParser nextInstance = new MockParser();
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
}
