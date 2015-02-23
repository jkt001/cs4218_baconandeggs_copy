package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FindApplicationTest {
	
	FindApplication app;

	@Before
	public void setUp() throws Exception {
		app = new FindApplication();
	}

	@Test
	public void testMatchString() {
		assertTrue(app.matchString("hello1", "hello1"));
	}
	
	@Test
	public void testMatchString2() {
		assertTrue(app.matchString("hello2", "*llo2"));
	}
	
	@Test
	public void testMatchString3() {
		assertTrue(app.matchString("hello3", "hel*"));
	}
	
	@Test
	public void testMatchString4() {
		assertTrue(app.matchString("hello4", "h*o4"));
	}
	
	@Test
	public void testMatchString5() {
		assertTrue(app.matchString("hello5", "*"));
	}

}
