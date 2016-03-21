package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import sg.edu.nus.comp.cs4218.exception.BcException;

public class BcApplicationTest {
	
	private static BcApplication bcApplication;
	private static OutputStream outStream;
	private static final int EPSILON = 15;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		bcApplication = new BcApplication();
	}
	
	@Before
	public void setup() throws IOException {
		outStream = new ByteArrayOutputStream();
	}
	
	@Test
	public void testRunValidInput() throws BcException {
		String[] args = {"3+3"};
		bcApplication.run(args, null, outStream);
		assertEquals("6" + System.lineSeparator(), outStream.toString());
	}
	
	@Test
	public void testRunValidInputMultiple() throws BcException {
		String[] args = {"(100+100)*10+5"};
		bcApplication.run(args, null, outStream);
		assertEquals("2005" + System.lineSeparator(), outStream.toString());
	}
	
	@Test
	public void testRunValidInputLargeNumber() throws BcException {
		String[] args = {"1180591620717411303424+1"};
		bcApplication.run(args, null, outStream);
		assertEquals("1180591620717411303425" + System.lineSeparator(), outStream.toString());
	}
	
	
	@Test
	public void testRunValidInputGreaterThan() throws BcException {
		String[] args = {"(2^31-1)+1*2>0"};
		bcApplication.run(args, null, outStream);
		assertEquals("2147483648"+System.lineSeparator(), outStream.toString());
	}
	
	@Test
	public void testRunValidInputFloatingNumberMultiple() throws BcException {
		String[] args = {"(2.5^2)+0.005"};
		bcApplication.run(args, null, outStream);
		assertEquals(new Double(6.255), Double.parseDouble(outStream.toString()), EPSILON);
	}
	
	@Test
	public void testRunForNumber() throws BcException {
		String[] args = {"99999"};
		bcApplication.run(args, null, outStream);
		assertEquals("99999" + System.lineSeparator(), outStream.toString());
	}
	
	@Test
	public void testExtreme() throws BcException {
		String[] args = {"(2^(2^(2^(2))))*((9+9-3)-(2^100)+(2^101))/((10+10)/10)"};
		bcApplication.run(args, null, outStream);
		assertEquals("41538374868278621028243970634252288\n", outStream.toString());
	}
	
	@Test
	public void shouldThrowExceptionForNumber() throws BcException {
		thrown.expect(BcException.class);
		thrown.expectMessage("Invalid operator");
		
		String[] args = {"text"};
		bcApplication.run(args, null, outStream);
	}
	
	@Test
	public void shouldThrowExceptionForInvalidExpression() throws BcException {
		thrown.expect(BcException.class);
		thrown.expectMessage("Invalid operator");
		
		String[] args = {"2#3"};
		bcApplication.run(args, null, outStream);
	}
	
	@Test
	public void shouldThrowExceptionForTooManyArguments() throws BcException {
		thrown.expect(BcException.class);
		thrown.expectMessage("Too many arguments specified");
		
		String[] args = {"2 + 3", "another argument"};
		bcApplication.run(args, null, outStream);
	}
	
	@Test
	public void testNumberSmall() {
		String[] args = {"42"};
		String result = bcApplication.number(args);
		assertEquals("42", result);
	}
	
	@Test
	public void testNumberSmallDecimal() {
		String[] args = {"-22.0195"};
		String result = bcApplication.number(args);
		assertEquals("-22.0195", result);
	}
	
	@Test
	public void testNumberLargeOne() {
		String[] args = {"1267650600228229401496703205376"};
		String result = bcApplication.number(args);
		assertEquals("1267650600228229401496703205376", result);
	}
	
	@Test
	public void testNumberLargeTwo() {
		String[] args = {"-1267650600228229401496703205376.55"};
		String result = bcApplication.number(args);
		assertEquals("-1267650600228229401496703205376.55", result);
	}
	
	@Test
	public void testNegateSmall() {
		String[] args = {"42"};
		String result = bcApplication.negate(args);
		assertEquals("-42", result);
	}
	
	@Test
	public void testNegateSmallDecimal() {
		String[] args = {"-22.0195"};
		String result = bcApplication.negate(args);
		assertEquals("22.0195", result);
	}
	
	@Test
	public void testNegateLargeOne() {
		String[] args = {"1267650600228229401496703205376"};
		String result = bcApplication.negate(args);
		assertEquals("-1267650600228229401496703205376", result);
	}
	
	@Test
	public void testNegateLargeTwo() {
		String[] args = {"-1267650600228229401496703205376.55"};
		String result = bcApplication.negate(args);
		assertEquals("1267650600228229401496703205376.55", result);
	}
	
	@Test
	public void testAddSmallNumber() {
		String leftExpression = "22";
		String rightExpression = "20";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.add(args);
		assertEquals("42", result);
	}
	
	@Test
	public void testAddFloatingNumber() {
		String leftExpression = "3.5";
		String rightExpression = "2";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.add(args);
		assertEquals(Double.parseDouble("5.5"), Double.parseDouble(result), EPSILON);
	}

	@Test
	public void testAddLargeNumberOne() {
		String leftExpression = "1180591620717411303424";
		String rightExpression = "1180591620717411303424";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.add(args);
		assertEquals("2361183241434822606848", result);
	}
	
	@Test
	public void testAddLargeNumberTwo() {
		String leftExpression = "2147483647";
		String rightExpression = "1";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.add(args);
		assertEquals("2147483648", result);
	}
	
	@Test
	public void testSubtractSmallNumber() {
		String leftExpression = "22";
		String rightExpression = "20";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.subtract(args);
		assertEquals("2", result);
	}
	
	@Test
	public void testSubtractFloatingNumber() {
		String leftExpression = "3.5";
		String rightExpression = "2";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.subtract(args);
		assertEquals(Double.parseDouble("1.5"), Double.parseDouble(result), EPSILON);
	}
	
	@Test
	public void testSubtractLargeNumberOne() {
		String leftExpression = "-2147483648";
		String rightExpression = "1";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.subtract(args);
		assertEquals("-2147483649", result);
	}
	
	@Test
	public void testSubtractLargeNumberTwo() {
		String leftExpression = "-1180591620717411303424";
		String rightExpression = "1180591620717411303424";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.subtract(args);
		assertEquals("-2361183241434822606848", result);
	}
	
	@Test
	public void testMultiplySmallNumber() {
		String leftExpression = "22";
		String rightExpression = "20";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.multiply(args);
		assertEquals("440", result);
	}
	
	@Test
	public void testMultiplyLargeNumber() {
		String leftExpression = "1180591620717411303424";
		String rightExpression = "1180591620717411303424";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.multiply(args);
		assertEquals("1393796574908163946345982392040522594123776", result);
	}
	
	@Test
	public void testMultiplyFloatingNumber() {
		String leftExpression = "-2.5";
		String rightExpression = "3";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.multiply(args);
		assertEquals(Double.parseDouble("-7.5"), Double.parseDouble(result), EPSILON);
	}
	
	@Test
	public void testMultiplyFloatingLargeNumber() {
		String leftExpression = "1180591620717411303424.33";
		String rightExpression = "1180591620717411303424";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.multiply(args);
		assertEquals(Double.parseDouble("1393796574908163946346371987275359339853905.92"), 
				Double.parseDouble(result), EPSILON);

	}
	
	@Test
	public void testDivideSmallNumber() throws BcException {
		String leftExpression = "22";
		String rightExpression = "20";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.divide(args);
		assertEquals("1.1", result);
	}
	
	@Test
	public void testDivideLargeNumber() throws BcException {
		String leftExpression = "1208925819614629174706176";
		String rightExpression = "32";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.divide(args);
		assertEquals("37778931862957161709568", result);
	}
	
	@Test
	public void testDivideFloatingNumber() throws BcException {
		String leftExpression = "22.2";
		String rightExpression = "3.1";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.divide(args);
		assertEquals(Double.parseDouble("7.16129032258"), Double.parseDouble(result), EPSILON);
	}
	
	@Test
	public void testDivideFloatingLargeNumber() throws BcException {
		String leftExpression = "1180591620717411303424.33";
		String rightExpression = "1";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.divide(args);
		assertEquals(Double.parseDouble("1180591620717411303424.33"), Double.parseDouble(result), EPSILON);
	}
	
	@Test
	public void shouldThrowExceptionDivisionByZero() throws BcException {

		thrown.expect(BcException.class);
		thrown.expectMessage("Division by zero");

		String leftExpression = "5";
		String rightExpression = "0";
		String[] args = createArgument(leftExpression, rightExpression);
		bcApplication.divide(args);
	}
	
	@Test
	public void testPowSmallNumber() throws BcException {
		String leftExpression = "2";
		String rightExpression = "5";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.pow(args);
		assertEquals("32", result);
	}
	
	@Test
	public void testPowLargeNumber() {
		String leftExpression = "2";
		String rightExpression = "100";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.pow(args);
		assertEquals("1267650600228229401496703205376", result);
	}
	
	@Test
	public void testPowFloatingNumber() {
		String leftExpression = "2.5";
		String rightExpression = "2";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.pow(args);
		assertEquals(Double.parseDouble("6.25"), Double.parseDouble(result), EPSILON);
	}
	
	@Test
	public void testPowByZero() {
		String leftExpression = "5";
		String rightExpression = "0";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.pow(args);
		assertEquals("1", result);
	}
	
	
	@Test
	public void shouldThrowExceptionFloatingExponent() throws BcException {
		thrown.expect(BcException.class);
		thrown.expectMessage("Floating number as exponent");

		String leftExpression = "2";
		String rightExpression = "4.5";
		String[] args = createArgument(leftExpression, rightExpression);
		bcApplication.pow(args);
	}
	
	
	@Test
	public void testGreaterThanSmallNumber() {
		String leftExpression = "5";
		String rightExpression = "5";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.greaterThan(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testGreaterThanFloatingNumber() {
		String leftExpression = "5.555555555";
		String rightExpression = "5.555555550";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.greaterThan(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testGreaterThanOrEqualSmallNumber() {
		String leftExpression = "5";
		String rightExpression = "5";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.greaterThanOrEqual(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testGreaterThanOrEqualFloatingNumber() {
		String leftExpression = "5.55555555";
		String rightExpression = "5.555555550";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.greaterThanOrEqual(args);
		assertEquals("1", result);
	}
	
	
	@Test
	public void testLessThanSmallNumber() {
		String leftExpression = "5";
		String rightExpression = "5";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.lessThan(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testLessThanFloatingNumber() {
		String leftExpression = "5.555555555";
		String rightExpression = "5.555555550";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.lessThan(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testLessThanOrEqualSmallNumber() {
		String leftExpression = "5";
		String rightExpression = "5";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.lessThanOrEqual(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testLessThanOrEqualFloatingNumber() {
		String leftExpression = "5.55555555";
		String rightExpression = "5.555555550";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.lessThanOrEqual(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testEqualEqualSmallNumber() {
		String leftExpression = "5";
		String rightExpression = "5";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.equalEqual(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testEqualEqualFloatingNumber() {
		String leftExpression = "5.555555555";
		String rightExpression = "5.555555550";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.equalEqual(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testNotEqualSmallNumber() {
		String leftExpression = "5";
		String rightExpression = "5";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.notEqual(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testNotEqualFloatingNumber() {
		String leftExpression = "5.55555555";
		String rightExpression = "5.555555550";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.greaterThan(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testAndTrue() {
		String leftExpression = "111";
		String rightExpression = "123";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.and(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testAndFalse() {
		String leftExpression = "1";
		String rightExpression = "0";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.and(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testOrTrue() {
		String leftExpression = "1";
		String rightExpression = "0";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.or(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testOrFalse() {
		String leftExpression = "0";
		String rightExpression = "0";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApplication.or(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testNotOne() {
		String[] args = {"0"};
		String result = bcApplication.not(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testNotTwo() {
		String[] args = {"1"};
		String result = bcApplication.not(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testNotThree() {
		String[] args = {"-0"};
		String result = bcApplication.not(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testNotFour() {
		String[] args = {"-19"};
		String result = bcApplication.not(args);
		assertEquals("0", result);
	}
	
	
	private String[] createArgument(String left, String right) {
		return new String[] {left, right};
	}
	
}
