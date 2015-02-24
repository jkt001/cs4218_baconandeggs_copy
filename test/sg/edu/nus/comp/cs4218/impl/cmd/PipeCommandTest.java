package sg.edu.nus.comp.cs4218.impl.cmd;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.OutputStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;

public class PipeCommandTest {

	private PipeCommand pipeCmd; 
	private static InputStream stdin;
	private static OutputStream stdout;
	final static String VALID_CMD_NO_EXP = "Not supposed to throw exception for valid command.";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		stdin = System.in;
		stdout = System.out;
	}
	
	@Test
	public void testEvaluateNoSemicolon(){
		pipeCmd = new PipeCommand("ls");
		try {
			pipeCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testEvaluateValidSemicolon(){
		pipeCmd = new PipeCommand("ls; ls");
		try {
			pipeCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}
	
	@Test
	public void testEvaluateSemicolonInDoubleQuotes(){
		pipeCmd = new PipeCommand("echo \"token1; token2\"");
		try {
			pipeCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}
	
	@Test
	public void testEvaluateSemicolonInSingleQuotes(){
		pipeCmd = new PipeCommand("echo 'token1; token2'");
		try {
			pipeCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}
	
	@Test
	public void testEvaluateSemicolonInBackQuotes(){
		pipeCmd = new PipeCommand("echo `ls; ls`");
		try {
			pipeCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

}