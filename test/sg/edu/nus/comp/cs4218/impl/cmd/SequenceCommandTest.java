package sg.edu.nus.comp.cs4218.impl.cmd;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.OutputStream;

import org.junit.BeforeClass;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;

public class SequenceCommandTest {

	private SequenceCommand seqCmd;
	private static InputStream stdin;
	private static OutputStream stdout;
	final static String VALID_CMD_NO_EXP = "Not supposed to throw exception for valid command.";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		stdin = System.in;
		stdout = System.out;
	}

	@Test
	public void testParseNoSemicolon() {
		seqCmd = new SequenceCommand("ls");
		seqCmd.parse();
		assertEquals(seqCmd.getPipeCommandList().size(), 1);
	}

	@Test
	public void testParseValidSemicolon() {
		seqCmd = new SequenceCommand("ls; ls");
		seqCmd.parse();
		assertEquals(seqCmd.getPipeCommandList().size(), 1);
	}

	@Test
	public void testParseValidDivider() {
		seqCmd = new SequenceCommand("ls | cat;");
		seqCmd.parse();
		assertEquals(seqCmd.getPipeCommandList().size(), 2);

	}

	@Test
	public void testParseValidDividerInDoubleQuote() {
		seqCmd = new SequenceCommand("echo \"token1| token 2 \" | cat;");
		seqCmd.parse();
		assertEquals(seqCmd.getPipeCommandList().size(), 2);
	}

	@Test
	public void testParseValidSemiColonInDoubleQuote() {
		seqCmd = new SequenceCommand("echo \"token1; token 2 \" | cat;");
		seqCmd.parse();
		assertEquals(seqCmd.getPipeCommandList().size(), 2);
	}

	@Test
	public void testParseValidDoubleQuote() {
		seqCmd = new SequenceCommand("echo \"token1 | token2; token3\" | cat;");
		seqCmd.parse();
		assertEquals(seqCmd.getPipeCommandList().size(), 2);
	}

	@Test
	public void testEvaluateNoSemicolon() {
		seqCmd = new SequenceCommand("ls");
		try {
			seqCmd.parse();
			seqCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testEvaluateValidSemicolon() {
		seqCmd = new SequenceCommand("ls; ls");
		try {
			seqCmd.parse();
			seqCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testEvaluateValidDivider() {
		seqCmd = new SequenceCommand("ls | cat;");
		try {
			seqCmd.parse();
			seqCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testEvaluateValidDividerInDoubleQuote() {
		seqCmd = new SequenceCommand("echo \"token1| token 2 \" | cat;");
		try {
			seqCmd.parse();
			seqCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testEvaluateValidSemiColonInDoubleQuote() {
		seqCmd = new SequenceCommand("echo \"token1; token 2 \" | cat;");
		try {
			seqCmd.parse();
			seqCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test
	public void testEvaluateValidDoubleQuote() {
		seqCmd = new SequenceCommand("echo \"token1 | token2; token3\" | cat;");
		try {
			seqCmd.parse();
			seqCmd.evaluate(stdin, stdout);
		} catch (ShellException | AbstractApplicationException e) {
			fail(VALID_CMD_NO_EXP);
		}
	}

	@Test(expected = ShellException.class)
	public void testEvaluateInValidDoubleQuote()
			throws AbstractApplicationException, ShellException {
		seqCmd = new SequenceCommand("echo \"token1 | token2; token3 | cat;");
		seqCmd.parse();
		seqCmd.evaluate(stdin, stdout);
	}

	@Test(expected = AbstractApplicationException.class)
	public void testEvaluateInValidArgs() throws ShellException,
			AbstractApplicationException {
		seqCmd = new SequenceCommand("ls token1;");
		seqCmd.parse();
		seqCmd.evaluate(stdin, stdout);
	}

	@Test(expected = ShellException.class)
	public void testEvaluateInValidSemiColon() throws ShellException,
			AbstractApplicationException {
		seqCmd = new SequenceCommand("echo \" token1; ");
		seqCmd.parse();
		seqCmd.evaluate(stdin, stdout);
	}

	@Test(expected = ShellException.class)
	public void testEvaluateInValidSemiColons() throws ShellException,
			AbstractApplicationException {
		seqCmd = new SequenceCommand("echo token1; ;");
		seqCmd.parse();
		seqCmd.evaluate(stdin, stdout);
	}

	@Test(expected = ShellException.class)
	public void testEvaluateInValidApp() throws ShellException,
			AbstractApplicationException {
		seqCmd = new SequenceCommand("invalidApp token1;");
		seqCmd.parse();
		seqCmd.evaluate(stdin, stdout);
	}

}
