package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import sg.edu.nus.comp.cs4218.exception.EchoException;
import sg.edu.nus.comp.cs4218.impl.app.EchoApplication;

public class EchoApplicationTest {
	@Test
	public void testNullArgument(){
		EchoApplication myEcho = new EchoApplication();
		try{
			myEcho.run(null,null,null);
			fail("Should throw exception");
		}catch(EchoException ee){
			assertEquals(ee.getLocalizedMessage(), "echo: Null arguments");
		}
	}
	
	@Test
	public void testEmptyArgument(){
		EchoApplication myEcho = new EchoApplication();
		try{
			String str[] = {};
			ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
			myEcho.run(str,null,myOutputStream);
			assertEquals("\n",myOutputStream.toString());
		}catch(EchoException ee){
			fail("Should not throw echo exception.");
		}
	}
	
	@Test
	public void testOneArgument(){
		EchoApplication myEcho = new EchoApplication();
		try{
			String str[] = {"hello"};
			ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
			myEcho.run(str,null,myOutputStream);
			assertEquals("hello\n",myOutputStream.toString());
		}catch(EchoException ee){
			fail("Should not throw echo exception.");
		}
	}
	
	@Test
	public void testTwoArgument(){
		EchoApplication myEcho = new EchoApplication();
		try{
			String str[] = {"hello","world"};
			ByteArrayOutputStream myOutputStream = new ByteArrayOutputStream();
			myEcho.run(str,null,myOutputStream);
			assertEquals("hello world\n",myOutputStream.toString());
		}catch(EchoException ee){
			fail("Should not throw echo exception.");
		}
	}
}
