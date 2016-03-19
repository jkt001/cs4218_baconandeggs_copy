package sg.edu.nus.comp.cs4218.impl;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader reader = new BufferedReader(inReader);
			StringBuilder mockOut = new StringBuilder();
			String line;
			if (inReader.ready()) {
			while ((line = reader.readLine()) != null) {
				mockOut.append(line);
			}
			}
			mockOut.append("Mocked Output");
			out.write(mockOut.toString().getBytes());
		} catch (IOException e) {
			throw new ShellException("Unable to write to output");
		}
	}
	
	protected String recursivelyParse(String toParse) throws ShellException, AbstractApplicationException {
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		MockParser nextInstance = new MockParser();
		nextInstance.parse(toParse, outStream);
		nextInstance.evaluate();
		String result = "";
		try {
			result = outStream.toString("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public void evaluate() throws ShellException, AbstractApplicationException {
		super.evaluate();
	}
}
