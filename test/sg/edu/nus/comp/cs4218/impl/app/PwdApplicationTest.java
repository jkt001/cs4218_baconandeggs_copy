package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.io.StringReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;

public class PwdApplicationTest {

	@Test
	public void test() {
		PwdApplication app = new PwdApplication();
		String[] params = {};
		ByteArrayInputStream bais = new ByteArrayInputStream(new byte[1]);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			app.run(params, bais, baos);
		} catch (AbstractApplicationException e) {
			e.printStackTrace();
		}
		
		String output = new String(baos.toByteArray());
		assertEquals(Environment.currentDirectory.trim(), output.trim());
	}

}
