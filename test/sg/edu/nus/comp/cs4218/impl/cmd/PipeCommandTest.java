package sg.edu.nus.comp.cs4218.impl.cmd;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.OutputStream;

import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;

public class PipeCommandTest {

	private PipeCommand pipeCmd;
	private static InputStream stdin;
	private static OutputStream stdout;
	final static String VALID_CMD_NO_EXP = "Not supposed to throw exception "
			+ "for valid command.";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		stdin = System.in;
		stdout = System.out;
	}

	@Test
	public void testParseNoSemicolon() {
		pipeCmd = new PipeCommand("ls");
		try {
			pipeCmd.parse();
		} catch (ShellException e) {
			fail(VALID_CMD_NO_EXP);
		}
		assertEquals(pipeCmd.getCallCommandList().size(), 1);
	}

	@Test
	public void testParseValidSemicolon() {
		pipeCmd = new PipeCommand("ls; ls");
		try {
			pipeCmd.parse();
		} catch (ShellException e) {
			fail(VALID_CMD_NO_EXP);
		}
		assertEquals(pipeCmd.getCallCommandList().size(), 2);
	}

	@Test
	public void testParseSemicolonInDoubleQuotes() {
		pipeCmd = new PipeCommand("echo \"token1; token2\"");
		try {
			pipeCmd.parse();
		} catch (ShellException e) {
			fail(VALID_CMD_NO_EXP);
		}
		assertEquals(pipeCmd.getCallCommandList().size(), 1);
	}

	@Test
	public void testParseSemicolonInSingleQuotes() {
		pipeCmd = new PipeCommand("echo 'token1; token2'");
		try {
			pipeCmd.parse();
		} catch (ShellException e) {
			fail(VALID_CMD_NO_EXP);
		}
		assertEquals(pipeCmd.getCallCommandList().size(), 1);
	}

	@Test
	public void testParseSemicolonInBackQuotes() {
		pipeCmd = new PipeCommand("echo `ls; ls`");
		try {
			pipeCmd.parse();
		} catch (ShellException e) {
			fail(VALID_CMD_NO_EXP);
		}
		assertEquals(pipeCmd.getCallCommandList().size(), 1);
	}

	@Test
	public void testEvaluateNoSemicolon() {
		pipeCmd = new PipeCommand("ls");
		try {
			pipeCmd.parse();
			pipeCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test(expected = ShellException.class)
	public void testParseInValidSemiColon() throws ShellException {
		pipeCmd = new PipeCommand("echo \" token1; ");
		pipeCmd.parse();
	}

	@Test
	public void testEvaluateValidSemicolon() {
		pipeCmd = new PipeCommand("ls; ls");
		try {
			pipeCmd.parse();
			pipeCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testEvaluateSemicolonInDoubleQuotes() {
		pipeCmd = new PipeCommand("echo \"token1; token2\"");
		try {
			pipeCmd.parse();
			pipeCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testEvaluateSemicolonInSingleQuotes() {
		pipeCmd = new PipeCommand("echo 'token1; token2'");
		try {
			pipeCmd.parse();
			pipeCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testEvaluateSemicolonInBackQuotes() {
		pipeCmd = new PipeCommand("echo `ls; ls`");
		try {
			pipeCmd.parse();
			pipeCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test(expected = ShellException.class)
	public void testEvaluateInValidSemiColon() throws ShellException,
			AbstractApplicationException {
		pipeCmd = new PipeCommand("echo \" token1; ");
		pipeCmd.parse();
		pipeCmd.evaluate(stdin, stdout);
	}

	@Test(expected = ShellException.class)
	public void testEvaluateInValidSemiColons() throws ShellException,
			AbstractApplicationException {
		pipeCmd = new PipeCommand("echo token1; ;");
		pipeCmd.parse();
		pipeCmd.evaluate(stdin, stdout);
	}

	@Test(expected = ShellException.class)
	public void testEvaluateInValidApp() throws ShellException,
			AbstractApplicationException {
		pipeCmd = new PipeCommand("invalidApp token1;");
		pipeCmd.parse();
		pipeCmd.evaluate(stdin, stdout);
	}

	@Test(expected = ShellException.class)
	public void testEvaluateInvalidPipe() throws ShellException,
			AbstractApplicationException {
		pipeCmd = new PipeCommand("echo token1 | cat");
		pipeCmd.parse();
		pipeCmd.evaluate(stdin, stdout);
	}

	@Test(expected = AbstractApplicationException.class)
	public void testEvaluateInValidArgs() throws ShellException,
			AbstractApplicationException {
		pipeCmd = new PipeCommand("ls token1;");
		pipeCmd.parse();
		pipeCmd.evaluate(stdin, stdout);
	}
}
