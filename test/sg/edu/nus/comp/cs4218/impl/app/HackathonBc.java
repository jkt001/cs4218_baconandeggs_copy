package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import sg.edu.nus.comp.cs4218.Application;

/**
 * Tests BcApplication
 */
@RunWith(value = Parameterized.class)
public class HackathonBc {

    private Application absApp;
    private String expected;
    private ByteArrayOutputStream output;

    /**
     * @param input
     * @param expected
     * @throws Exception
     */
    public HackathonBc(String input, String expected)
            throws Exception {
        String[] args = { input };
        this.output = new ByteArrayOutputStream();
        this.absApp = new BcApplication();
        this.absApp.run(args, null, this.output);
        this.expected = expected;
    }

    /**
     * @return input and expected data
     */
    @Parameters(name = "{index}: calculate {0} = {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {

            //@formatter:off

            // power with negative values, <expr> ::= <number> | ..., <number> ::= any natural number or floating point number
            { "10 ^ -2", "0.01" },


            // extreme numbers
            { "(1 / 9999999999999999) * 9999999999999999", "1"},

            //@formatter:on

        });
    }

    /**
     * test BcApplication, epsilon: 10^(-6)
     */
    @Test
    public void test() {
        assertEquals(Double.valueOf(this.expected),
                Double.valueOf(this.output.toString()), 0.000001);
    }
}
