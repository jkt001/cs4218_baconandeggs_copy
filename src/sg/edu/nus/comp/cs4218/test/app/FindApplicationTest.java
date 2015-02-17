package sg.edu.nus.comp.cs4218.test.app;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.exception.FindException;
import sg.edu.nus.comp.cs4218.impl.app.CatApplication;
import sg.edu.nus.comp.cs4218.impl.app.FindApplication;

public class FindApplicationTest {

	private FindApplication findApp;
	private String[] args;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		findApp = new FindApplication();
		args = null;
	}

	@After
	public void tearDown() throws Exception {
		findApp = null;
		args = null;
	}

	@Test
	public void testWithNoAsterisk() throws FindException {
		ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
		args = new String[]{"-name", "*.java"};
		findApp.run(args, null, myOutputStream);
		//File dir = new File("C:\\Users\\pikachu\\Desktop\\CS4218 project");
		//findApp.listAllDirectories(dir, "*.txt", myOutputStream);
		assertEquals("aa", myOutputStream.toString());
	}
}
