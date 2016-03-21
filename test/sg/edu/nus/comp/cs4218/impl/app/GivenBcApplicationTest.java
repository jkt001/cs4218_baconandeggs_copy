package sg.edu.nus.comp.cs4218.impl.app;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import sg.edu.nus.comp.cs4218.exception.BcException;

public class GivenBcApplicationTest {
	private BcApplication bcApp;
	private OutputStream outStream;
	private static final int EPSILON = 15;
	
	@Before
	public void setUp() throws Exception {
		bcApp = new BcApplication();
		outStream = new ByteArrayOutputStream();
	}

	@After
	public void tearDown() throws Exception {
		outStream.close();
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testRunAddition() throws BcException {
		String[] args = {"1+2"};
		bcApp.run(args, null, outStream);
		String expected = "3\n";
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testRunUnnestedBrackets() throws BcException {
		String[] args = {"1+(2+3)"};
		bcApp.run(args, null, outStream);
		String expected = "6\n";
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testRunNestedBrackets() throws BcException {
		String[] args = {"5*(1+(2+3))"};
		bcApp.run(args, null, outStream);
		String expected = "30\n";
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testRunInvalidExpressions() {
		String[] args = {"4*(5/(3+2)"};
		try {
			bcApp.run(args, null, outStream);
		} catch (BcException e) {
			
		} catch (Exception e) {
			fail("BcApplication should throw BcException!");
		}
	}

	@Test
	public void testNumber() {
		String[] args = {"1"};
		String result = bcApp.number(args);
		String expected = "1";
		
		assertEquals(expected, result);
	}

	@Test
	public void testNegatePositive() {
		String[] args = {"123"};
		String result = bcApp.negate(args);
		String expected = "-123";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testNegateNegative() {
		String[] args = {"-123"};
		String result = bcApp.negate(args);
		String expected = "123";
		
		assertEquals(expected, result);
	}

	@Test
	public void testAdd() {
		String[] args = {"1", "2"};
		String result = bcApp.add(args);
		String expected = "3";
		
		assertEquals(expected, result);
	}

	@Test
	public void testSubtract() {
		String[] args = {"1", "2"};
		String result = bcApp.subtract(args);
		String expected = "-1";
		
		assertEquals(expected, result);
	}

	@Test
	public void testMultiply() {
		String[] args = {"1", "2"};
		String result = bcApp.multiply(args);
		String expected = "2";
		
		assertEquals(expected, result);
	}

	@Test
	public void testDivide() throws BcException {
		String[] args = {"1", "2"};
		String result = bcApp.divide(args);
		String expected = "0.5";
		
		assertEquals(expected, result);
	}

	@Test
	public void testPow() throws BcException {
		String[] args = {"2", "3"};
		String result = bcApp.pow(args);
		String expected = "8";
		
		assertEquals(expected, result);
	}

	@Test
	public void testBracket() {
		String[] args = {"(1)"};
		String result = bcApp.bracket(args);
		String expected = "1";
		
		assertEquals(expected, result);
	}

	@Test
	public void testGreaterThanTrue() {
		String[] args = {"2", "1"};
		String result = bcApp.greaterThan(args);
		String expected = "1";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testGreaterThanTFalse() {
		String[] args = {"1", "2"};
		String result = bcApp.greaterThan(args);
		String expected = "0";
		
		assertEquals(expected, result);
	}

	@Test
	public void testGreaterThanOrEqualTrue1() {
		String[] args = {"2", "1"};
		String result = bcApp.greaterThanOrEqual(args);
		String expected = "1";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testGreaterThanOrEqualTrue2() {
		String[] args = {"1", "1"};
		String result = bcApp.greaterThanOrEqual(args);
		String expected = "1";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testGreaterThanOrEqualFalse() {
		String[] args = {"1", "2"};
		String result = bcApp.greaterThanOrEqual(args);
		String expected = "0";
		
		assertEquals(expected, result);
	}

	@Test
	public void testLessThanTrue() {
		String[] args = {"1", "2"};
		String result = bcApp.lessThan(args);
		String expected = "1";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testLessThanFalse() {
		String[] args = {"2", "1"};
		String result = bcApp.lessThan(args);
		String expected = "0";
		
		assertEquals(expected, result);
	}

	@Test
	public void testLessThanOrEqualTrue1() {
		String[] args = {"1", "2"};
		String result = bcApp.lessThanOrEqual(args);
		String expected = "1";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testLessThanOrEqualTrue2() {
		String[] args = {"1", "1"};
		String result = bcApp.lessThanOrEqual(args);
		String expected = "1";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testLessThanOrEqualFalse() {
		String[] args = {"2", "1"};
		String result = bcApp.lessThanOrEqual(args);
		String expected = "0";
		
		assertEquals(expected, result);
	}

	@Test
	public void testEqualEqualTrue() {
		String[] args = {"2", "2"};
		String result = bcApp.equalEqual(args);
		String expected = "1";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testEqualEqualFalse() {
		String[] args = {"1", "2"};
		String result = bcApp.equalEqual(args);
		String expected = "0";
		
		assertEquals(expected, result);
	}

	@Test
	public void testNotEqualTrue() {
		String[] args = {"1", "2"};
		String result = bcApp.notEqual(args);
		String expected = "1";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testNotEqualFalse() {
		String[] args = {"2", "2"};
		String result = bcApp.notEqual(args);
		String expected = "0";
		
		assertEquals(expected, result);
	}

	@Test
	public void testAndTT() {
		String[] args = {"123", "123"};
		String result = bcApp.and(args);
		String expected = "1";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testAndTF() {
		String[] args = {"123", "0"};
		String result = bcApp.and(args);
		String expected = "0";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testAndFT() {
		String[] args = {"0", "123"};
		String result = bcApp.and(args);
		String expected = "0";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testAndFF() {
		String[] args = {"0", "0"};
		String result = bcApp.and(args);
		String expected = "0";
		
		assertEquals(expected, result);
	}

	@Test
	public void testOrTT() {
		String[] args = {"123", "123"};
		String result = bcApp.or(args);
		String expected = "1";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testOrTF() {
		String[] args = {"123", "0"};
		String result = bcApp.or(args);
		String expected = "1";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testOrFT() {
		String[] args = {"0", "123"};
		String result = bcApp.or(args);
		String expected = "1";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testOrFF() {
		String[] args = {"0", "0"};
		String result = bcApp.or(args);
		String expected = "0";
		
		assertEquals(expected, result);
	}

	@Test
	public void testNotF() {
		String[] args = {"0"};
		String result = bcApp.not(args);
		String expected = "1";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testNotT() {
		String[] args = {"123"};
		String result = bcApp.not(args);
		String expected = "0";
		
		assertEquals(expected, result);
	}

	// new tests added
	
	@Test
	public void testRunWithSubtractionAndNoNegation() throws BcException {
		String[] args = {"10-1-1-1-1-1"};
		bcApp.run(args, null, outStream);
		String expected = "5" + System.lineSeparator();
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testRunWithSubtractionAndNegation() throws BcException {
		String[] args = {"-10-1-1-1-1-1"};
		bcApp.run(args, null, outStream);
		String expected = "-15" + System.lineSeparator();
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testRunWithNegationsAndSubtractionsAndOtherOperators() throws BcException {
		String[] args = {"2*3*4-(-5-5-5)"};
		bcApp.run(args, null, outStream);
		String expected = "39" + System.lineSeparator();
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void testManyNegationAndNoSubtraction() throws BcException {
		String[] args = {"-10+(-10)*(-1)*-1"};
		bcApp.run(args, null, outStream);
		String expected = "-20" + System.lineSeparator();
		assertEquals(expected, outStream.toString());
	}
	
	@Test
	public void shouldThrowExceptionForNegationWithoutNumber() throws BcException {
		thrown.expect(BcException.class);
		thrown.expectMessage("Invalid expression");
		
		String[] args = {"-2+3+9-"};
		bcApp.run(args, null, outStream);
	}
	
	@Test
	public void shouldThrowExceptionForOperatorWithoutOperand() throws BcException {
		thrown.expect(BcException.class);
		thrown.expectMessage("Invalid expression");
		
		String[] args = {"9+9+9+9+"};
		bcApp.run(args, null, outStream);
	}
	
	@Test
	public void testValidBracketMatchingOne() {
		String exp = "(((2)) + 3)";

		assertTrue(bcApp.isValidBracketMatching(exp));
	}

	@Test
	public void testValidBracketMatchingTwo() {
		String exp = "(2+(3*7*(9+2)+(2-3))+3*(2-(9*(2+3))))";

		assertTrue(bcApp.isValidBracketMatching(exp));
	}

	@Test
	public void testPrecedingClosingBracket() {
		String exp = ")((2)) + 3)";

		assertFalse(bcApp.isValidBracketMatching(exp));
	}
	
	@Test
	public void testMissingOneClosingBracket() {
		String exp = "((2+(3*7*(9+2)+(2-3))+3*(2-(9*(2+3))))";
		assertFalse(bcApp.isValidBracketMatching(exp));
	}
	
	@Test
	public void testExtraClosingBrackets() {
		String exp = "(2+(3*7*(9+2)+(2-3))+3*(2-(9*(2+3)))))";
		assertFalse(bcApp.isValidBracketMatching(exp));
	}
	
	@Test
	public void testPostfixBulderOne() throws BcException {
		String exp = "2*(33+44.5)";
		assertEquals("2 33 44.5 + *", bcApp.getPostfixExpression(exp));
	}
	
	@Test
	public void testCalculateOne() throws BcException {
		String res = bcApp.calculate("2 3 4 + *");
		assertEquals("14", res);
	}
	
	@Test
	public void testPostfixBulderTwo() throws BcException {
		String exp = "2>=33+44.5";
		assertEquals("2 33 >= 44.5 +", bcApp.getPostfixExpression(exp));
	}
	
	@Test
	public void testCalculateTwo() throws BcException {
		String res = bcApp.calculate("2 33 >= 44.5 +");
		assertEquals("44.5", res);
	}
	
	@Test
	public void testPostfixBulderThree() throws BcException {
		String exp = "1-(6+2*4.5)/5";
		assertEquals("1 6 2 4.5 * + 5 / -", bcApp.getPostfixExpression(exp));
	}
	
	@Test
	public void testCalculateThree() throws BcException {
		String res = bcApp.calculate("1 6 2 4.5 * + 5 / -");
		assertTrue(Math.abs(Double.parseDouble(res) - (-2)) <= EPSILON);
	}
	
	// tests from previous MS (MS1)
	
	@Test
	public void testRunValidInput() throws BcException {
		String[] args = {"3+3"};
		bcApp.run(args, null, outStream);
		assertEquals("6" + System.lineSeparator(), outStream.toString());
	}
	
	@Test
	public void testRunValidInputMultiple() throws BcException {
		String[] args = {"(100+100)*10+5"};
		bcApp.run(args, null, outStream);
		assertEquals("2005" + System.lineSeparator(), outStream.toString());
	}
	
	@Test
	public void testRunValidInputLargeNumber() throws BcException {
		String[] args = {"1180591620717411303424+1"};
		bcApp.run(args, null, outStream);
		assertEquals("1180591620717411303425" + System.lineSeparator(), outStream.toString());
	}
	
	
	@Test
	public void testRunValidInputGreaterThan() throws BcException {
		String[] args = {"(2^31-1)+1*2>0"};
		bcApp.run(args, null, outStream);
		assertEquals("2147483648"+System.lineSeparator(), outStream.toString());
	}
	
	@Test
	public void testRunValidInputFloatingNumberMultiple() throws BcException {
		String[] args = {"(2.5^2)+0.005"};
		bcApp.run(args, null, outStream);
		assertEquals(new Double(6.255), Double.parseDouble(outStream.toString()), EPSILON);
	}
	
	@Test
	public void testRunForNumber() throws BcException {
		String[] args = {"99999"};
		bcApp.run(args, null, outStream);
		assertEquals("99999" + System.lineSeparator(), outStream.toString());
	}
	
	@Test
	public void testExtreme() throws BcException {
		String[] args = {"(2^(2^(2^(2))))*((9+9-3)-(2^100)+(2^101))/((10+10)/10)"};
		bcApp.run(args, null, outStream);
		assertEquals("41538374868278621028243970634252288" + System.lineSeparator(), outStream.toString());
	}
	
	@Test
	public void shouldThrowExceptionForNumber() throws BcException {
		thrown.expect(BcException.class);
		thrown.expectMessage("Invalid operator");
		
		String[] args = {"text"};
		bcApp.run(args, null, outStream);
	}
	
	@Test
	public void shouldThrowExceptionForInvalidExpression() throws BcException {
		thrown.expect(BcException.class);
		thrown.expectMessage("Invalid operator");
		
		String[] args = {"2#3"};
		bcApp.run(args, null, outStream);
	}
	
	@Test
	public void testRunForNegativeNumber() throws BcException {
		String[] args = {"-4"};
		bcApp.run(args, null, outStream);
		assertEquals("-4" + System.lineSeparator(), outStream.toString());
	}
	
	@Test
	public void shouldThrowExceptionForTooManyArguments() throws BcException {
		thrown.expect(BcException.class);
		thrown.expectMessage("Too many arguments specified");
		
		String[] args = {"2+3", "another argument"};
		bcApp.run(args, null, outStream);
	}
	
	@Test
	public void testNumberSmall() {
		String[] args = {"42"};
		String result = bcApp.number(args);
		assertEquals("42", result);
	}
	
	@Test
	public void testNumberSmallDecimal() {
		String[] args = {"-22.0195"};
		String result = bcApp.number(args);
		assertEquals("-22.0195", result);
	}
	
	@Test
	public void testNumberLargeOne() {
		String[] args = {"1267650600228229401496703205376"};
		String result = bcApp.number(args);
		assertEquals("1267650600228229401496703205376", result);
	}
	
	@Test
	public void testNumberLargeTwo() {
		String[] args = {"-1267650600228229401496703205376.55"};
		String result = bcApp.number(args);
		assertEquals("-1267650600228229401496703205376.55", result);
	}
	
	@Test
	public void testNegateSmall() {
		String[] args = {"42"};
		String result = bcApp.negate(args);
		assertEquals("-42", result);
	}
	
	@Test
	public void testNegateSmallDecimal() {
		String[] args = {"-22.0195"};
		String result = bcApp.negate(args);
		assertEquals("22.0195", result);
	}
	
	@Test
	public void testNegateLargeOne() {
		String[] args = {"1267650600228229401496703205376"};
		String result = bcApp.negate(args);
		assertEquals("-1267650600228229401496703205376", result);
	}
	
	@Test
	public void testNegateLargeTwo() {
		String[] args = {"-1267650600228229401496703205376.55"};
		String result = bcApp.negate(args);
		assertEquals("1267650600228229401496703205376.55", result);
	}
	
	@Test
	public void testAddSmallNumber() {
		String leftExpression = "22";
		String rightExpression = "20";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.add(args);
		assertEquals("42", result);
	}
	
	@Test
	public void testAddFloatingNumber() {
		String leftExpression = "3.5";
		String rightExpression = "2";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.add(args);
		assertEquals(Double.parseDouble("5.5"), Double.parseDouble(result), EPSILON);
	}

	@Test
	public void testAddLargeNumberOne() {
		String leftExpression = "1180591620717411303424";
		String rightExpression = "1180591620717411303424";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.add(args);
		assertEquals("2361183241434822606848", result);
	}
	
	@Test
	public void testAddLargeNumberTwo() {
		String leftExpression = "2147483647";
		String rightExpression = "1";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.add(args);
		assertEquals("2147483648", result);
	}
	
	@Test
	public void testSubtractSmallNumber() {
		String leftExpression = "22";
		String rightExpression = "20";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.subtract(args);
		assertEquals("2", result);
	}
	
	@Test
	public void testSubtractFloatingNumber() {
		String leftExpression = "3.5";
		String rightExpression = "2";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.subtract(args);
		assertEquals(Double.parseDouble("1.5"), Double.parseDouble(result), EPSILON);
	}
	
	@Test
	public void testSubtractLargeNumberOne() {
		String leftExpression = "-2147483648";
		String rightExpression = "1";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.subtract(args);
		assertEquals("-2147483649", result);
	}
	
	@Test
	public void testSubtractLargeNumberTwo() {
		String leftExpression = "-1180591620717411303424";
		String rightExpression = "1180591620717411303424";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.subtract(args);
		assertEquals("-2361183241434822606848", result);
	}
	
	@Test
	public void testMultiplySmallNumber() {
		String leftExpression = "22";
		String rightExpression = "20";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.multiply(args);
		assertEquals("440", result);
	}
	
	@Test
	public void testMultiplyLargeNumber() {
		String leftExpression = "1180591620717411303424";
		String rightExpression = "1180591620717411303424";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.multiply(args);
		assertEquals("1393796574908163946345982392040522594123776", result);
	}
	
	@Test
	public void testMultiplyFloatingNumber() {
		String leftExpression = "-2.5";
		String rightExpression = "3";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.multiply(args);
		assertEquals(Double.parseDouble("-7.5"), Double.parseDouble(result), EPSILON);
	}
	
	@Test
	public void testMultiplyFloatingLargeNumber() {
		String leftExpression = "1180591620717411303424.33";
		String rightExpression = "1180591620717411303424";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.multiply(args);
		assertEquals(Double.parseDouble("1393796574908163946346371987275359339853905.92"), 
				Double.parseDouble(result), EPSILON);

	}
	
	@Test
	public void testDivideSmallNumber() throws BcException {
		String leftExpression = "22";
		String rightExpression = "20";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.divide(args);
		assertEquals("1.1", result);
	}
	
	@Test
	public void testDivideLargeNumber() throws BcException {
		String leftExpression = "1208925819614629174706176";
		String rightExpression = "32";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.divide(args);
		assertEquals("37778931862957161709568", result);
	}
	
	@Test
	public void testDivideFloatingNumber() throws BcException {
		String leftExpression = "22.2";
		String rightExpression = "3.1";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.divide(args);
		assertEquals(Double.parseDouble("7.16129032258"), Double.parseDouble(result), EPSILON);
	}
	
	@Test
	public void testDivideFloatingLargeNumber() throws BcException {
		String leftExpression = "1180591620717411303424.33";
		String rightExpression = "1";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.divide(args);
		assertEquals(Double.parseDouble("1180591620717411303424.33"), Double.parseDouble(result), EPSILON);
	}
	
	@Test
	public void shouldThrowExceptionDivisionByZero() throws BcException {

		thrown.expect(BcException.class);
		thrown.expectMessage("Division by zero");

		String leftExpression = "5";
		String rightExpression = "0";
		String[] args = createArgument(leftExpression, rightExpression);
		bcApp.divide(args);
	}
	
	@Test
	public void testPowSmallNumber() throws BcException {
		String leftExpression = "2";
		String rightExpression = "5";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.pow(args);
		assertEquals("32", result);
	}
	
	@Test
	public void testPowLargeNumber() throws BcException {
		String leftExpression = "2";
		String rightExpression = "100";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.pow(args);
		assertEquals("1267650600228229401496703205376", result);
	}
	
	@Test
	public void testPowFloatingNumber() throws BcException {
		String leftExpression = "2.5";
		String rightExpression = "2";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.pow(args);
		assertEquals(Double.parseDouble("6.25"), Double.parseDouble(result), EPSILON);
	}
	
	@Test
	public void testPowByZero() throws BcException {
		String leftExpression = "5";
		String rightExpression = "0";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.pow(args);
		assertEquals("1", result);
	}
	
	
	@Test
	public void shouldThrowExceptionFloatingExponent() throws BcException {
		thrown.expect(BcException.class);
		thrown.expectMessage("Exponent is not an integer");

		String leftExpression = "2";
		String rightExpression = "4.5";
		String[] args = createArgument(leftExpression, rightExpression);
		bcApp.pow(args);
	}
	
	
	@Test
	public void testGreaterThanSmallNumber() {
		String leftExpression = "5";
		String rightExpression = "5";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.greaterThan(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testGreaterThanFloatingNumber() {
		String leftExpression = "5.555555555";
		String rightExpression = "5.555555550";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.greaterThan(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testGreaterThanOrEqualSmallNumber() {
		String leftExpression = "5";
		String rightExpression = "5";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.greaterThanOrEqual(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testGreaterThanOrEqualFloatingNumber() {
		String leftExpression = "5.55555555";
		String rightExpression = "5.555555550";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.greaterThanOrEqual(args);
		assertEquals("1", result);
	}
	
	
	@Test
	public void testLessThanSmallNumber() {
		String leftExpression = "5";
		String rightExpression = "5";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.lessThan(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testLessThanFloatingNumber() {
		String leftExpression = "5.555555555";
		String rightExpression = "5.555555550";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.lessThan(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testLessThanOrEqualSmallNumber() {
		String leftExpression = "5";
		String rightExpression = "5";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.lessThanOrEqual(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testLessThanOrEqualFloatingNumber() {
		String leftExpression = "5.55555555";
		String rightExpression = "5.555555550";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.lessThanOrEqual(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testEqualEqualSmallNumber() {
		String leftExpression = "5";
		String rightExpression = "5";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.equalEqual(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testEqualEqualFloatingNumber() {
		String leftExpression = "5.555555555";
		String rightExpression = "5.555555550";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.equalEqual(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testNotEqualSmallNumber() {
		String leftExpression = "5";
		String rightExpression = "5";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.notEqual(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testNotEqualFloatingNumber() {
		String leftExpression = "5.55555555";
		String rightExpression = "5.555555550";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.greaterThan(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testAndTrue() {
		String leftExpression = "111";
		String rightExpression = "123";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.and(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testAndFalse() {
		String leftExpression = "1";
		String rightExpression = "0";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.and(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testOrTrue() {
		String leftExpression = "1";
		String rightExpression = "0";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.or(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testOrFalse() {
		String leftExpression = "0";
		String rightExpression = "0";
		String[] args = createArgument(leftExpression, rightExpression);
		String result = bcApp.or(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testNotOne() {
		String[] args = {"0"};
		String result = bcApp.not(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testNotTwo() {
		String[] args = {"1"};
		String result = bcApp.not(args);
		assertEquals("0", result);
	}
	
	@Test
	public void testNotThree() {
		String[] args = {"-0"};
		String result = bcApp.not(args);
		assertEquals("1", result);
	}
	
	@Test
	public void testNotFour() {
		String[] args = {"-19"};
		String result = bcApp.not(args);
		assertEquals("0", result);
	}
	

	private String[] createArgument(String left, String right) {
		return new String[] {left, right};
	}
	
}
