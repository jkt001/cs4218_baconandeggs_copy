package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FindApplicationTest {
	
	FindApplication app;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		app = new FindApplication();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMatchString() {
		assertTrue(app.matchString("hello", "hello"));
	}
	
	@Test
	public void testMatchString2() {
		assertTrue(app.matchString("hello", "*llo"));
	}
	
	@Test
	public void testMatchString3() {
		assertTrue(app.matchString("hello", "hel*"));
	}
	
	@Test
	public void testMatchString4() {
		assertTrue(app.matchString("hello", "h*o"));
	}
	
	@Test
	public void testMatchString5() {
		assertTrue(app.matchString("hello", "*"));
	}

}
