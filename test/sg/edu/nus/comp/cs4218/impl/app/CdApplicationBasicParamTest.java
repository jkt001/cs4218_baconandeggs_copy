package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.exception.CdException;

public class CdApplicationBasicParamTest {

	private static final String MESSAGE_FAIL = "Not supposed to succeed.";
	
	CdApplication app;

	@Before
	public void setUp() throws Exception {
		app = new CdApplication();
	}
	
	// Test null parameters
	@Test
	public void testNullParams() {
		CdApplication app = new CdApplication();
		String[] params = null;
		try {
			app.run(params, System.in, System.out);
			fail(MESSAGE_FAIL);
		} catch (CdException e) {
			
		}
	}
	
	// Test zero parameters
	@Test
	public void testZeroParams() {
		CdApplication app = new CdApplication();
		String[] params = {};
		try {
			app.run(params, System.in, System.out);
			fail(MESSAGE_FAIL);
		} catch (CdException e) {
			
		}
	}
	
	// Test one parameter, but null value
	@Test
	public void testOneNullParams() {
		CdApplication app = new CdApplication();
		String[] params = {null};
		try {
			app.run(params, System.in, System.out);
			fail(MESSAGE_FAIL);
		} catch (CdException e) {
			
		}
	}
	
	// Test two parameters
	@Test
	public void testTwoParams() {
		
		String[] params = {"a", "b"};
		try {
			app.run(params, System.in, System.out);
			fail(MESSAGE_FAIL);
		} catch (CdException e) {
			
		}
	}
}
