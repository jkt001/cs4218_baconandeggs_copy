package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.CatException;
import sg.edu.nus.comp.cs4218.exception.EchoException;

public class EchoApplicationTest {
	
	private EchoApplication echoApp;
	private InputStream inStream;

	private OutputStream outStream;
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Before
	public void setup() {
		echoApp = new EchoApplication();
		byte[] dummy = {};
		inStream = new ByteArrayInputStream(dummy); 
		outStream = new ByteArrayOutputStream();
	}
	
	@Test
	public void shouldPrintEmptyLine() throws EchoException {
		String [] args = {};
		echoApp.run(args, inStream, outStream);
		
		assertEquals("\n", outStream.toString());
	}

	@Test
	public void shouldPrintLine() throws EchoException {
		String [] args = {"arg1", "arg2"};
		echoApp.run(args, inStream, outStream);
		
		assertEquals("arg1 arg2\n", outStream.toString());
	}

	@Test
	public void shouldThrowExceptionForNullArgs() throws EchoException {
		thrown.expect(EchoException.class);
		thrown.expectMessage("Null arguments");

		echoApp.run(null, inStream, outStream);
	}

	@Test
	public void shouldThrowExceptionForNullStdOut() throws EchoException {
		thrown.expect(EchoException.class);
		thrown.expectMessage("OutputStream not provided");

		String [] args = {"arg1", "arg2"};

		echoApp.run(args, inStream, null);
	}
}
