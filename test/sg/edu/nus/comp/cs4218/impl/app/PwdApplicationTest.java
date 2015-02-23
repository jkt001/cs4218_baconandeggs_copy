package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.PwdException;

public class PwdApplicationTest {
	
	private PwdApplication app;
	private ByteArrayInputStream bais;
	private ByteArrayOutputStream baos;

	@Before
	public void setUp() throws Exception {		
		app = new PwdApplication();
		bais = new ByteArrayInputStream(new byte[1]);
		baos = new ByteArrayOutputStream();
	}
	
	// Test null parameters
	@Test
	public void testNullParams() throws PwdException {
		String[] params = null;
		app.run(params, bais, baos);
	}
	
	// Test zero parameters
	@Test
	public void testZeroParams() throws PwdException {
		String[] params = {};
		app.run(params, bais, baos);
	}
	
	// Test one parameter, but null value
	@Test(expected = PwdException.class)
	public void testOneNullParams() throws PwdException {
		String[] params = {null};
		app.run(params, bais, baos);
	}

	// Test that pwd prints correct current directory
	@Test
	public void testExpectedBehavior() {
		String[] params = {};
		
		try {
			app.run(params, bais, baos);
		} catch (PwdException e) {
			fail("Unknown error occured");
		}
		
		String output = new String(baos.toByteArray());
		assertEquals(Environment.currentDirectory.trim(), output.trim());
	}

}
