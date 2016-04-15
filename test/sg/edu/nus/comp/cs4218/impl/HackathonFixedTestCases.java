package sg.edu.nus.comp.cs4218.impl;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import org.junit.Test;

import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.BcException;
import sg.edu.nus.comp.cs4218.exception.ShellException;
import sg.edu.nus.comp.cs4218.impl.app.BcApplication;

public class HackathonFixedTestCases {

    private ByteArrayOutputStream outStream;

    public HackathonFixedTestCases() {
        outStream = new ByteArrayOutputStream();
    }

    /**
     * Fixes bug #4 as reported in hackathon. 
     */
    @Test
    public void testNegativePowers() throws BcException{
    	outStream = new ByteArrayOutputStream();
    	BcApplication bc = new BcApplication();
    	String[] input = {"10 ^ -2"};
    	bc.run(input, null, outStream);
    	assertEquals(Double.valueOf(0.01), Double.valueOf(outStream.toString()), 0.00001);
    }


    /**
     * Fixes bug #6 as reported in hackathon. 
     */
    @Test
    public void testExtremeNumbers() throws BcException{
    	outStream = new ByteArrayOutputStream();
    	BcApplication bc = new BcApplication();
    	String[] input = {"(1 / 9999999999999999) * 9999999999999999"};
    	bc.run(input, null, outStream);
    	assertEquals(Double.valueOf(1), Double.valueOf(outStream.toString()), 0.00001);
    }
    
    /**
     * Fixes bug #18 as reported in hackathon. Testing is at an integration level and is reliant on 
     * EchoApplication. Behaviour is expected as the .evalate() function will extract the date from
     * args and inject into comds
     */
    @Test
    public void testParserOnlyBQ() throws ShellException, AbstractApplicationException {
    	Parser mp = new Parser();
    	outStream = new ByteArrayOutputStream();
		mp.parse("`echo date`", outStream);
		String[] expected = {"date"};
		ArrayList<String> comds = mp.getCommands();
		ArrayList<String[]> args = mp.getArguments();
		int numberComds = comds.size();
		assertEquals(1, numberComds);
		assertEquals("", comds.get(0));
		assertEquals(1, args.get(0).length);
		for (int j = 0; j <expected.length; j++) {
			assertEquals(expected[j], args.get(0)[j]);
		}
    }
}
