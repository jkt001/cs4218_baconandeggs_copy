package sg.edu.nus.comp.cs4218.impl.cmd;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.OutputStream;

import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;

public class SeqCommandTest {

	private SeqCommand seqCmd; 
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
		seqCmd = new SeqCommand("ls");
		try {
			seqCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}
	
	@Test
	public void testEvaluateValidSemicolon(){
		seqCmd = new SeqCommand("ls; ls");
		try {
			seqCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}
	
	@Test
	public void testEvaluateValidDivider(){
		seqCmd = new SeqCommand("ls | cat;");
		try {
			seqCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}
	
	@Test
	public void testEvaluateValidDividerInDoubleQuote(){
		seqCmd = new SeqCommand("echo \"token1| token 2 \" | cat;");
		try {
			seqCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}
	
	@Test
	public void testEvaluateValidSemiColonInDoubleQuote(){
		seqCmd = new SeqCommand("echo \"token1; token 2 \" | cat;");
		try {
			seqCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}
	
	@Test
	public void testEvaluateValidDoubleQuote(){
		seqCmd = new SeqCommand("echo \"token1 | token2; token3\" | cat;");
		try {
			seqCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

}
