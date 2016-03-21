package sg.edu.nus.comp.cs4218.impl.app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Stack;

import sg.edu.nus.comp.cs4218.app.Bc;
import sg.edu.nus.comp.cs4218.exception.BcException;

public class BcApplication implements Bc {

	HashMap<String, Integer> precedenceMapping;
	private final String[][] OPERATORS = { { "+", "-" }, { "*", "/" }, { "^" }, { "<", ">", "<=", ">=", "!=", "==" },
			{ "&&" }, { "||" }, { "!" } };
	
	int start;

	public BcApplication() {
		precedenceMapping = new HashMap<String, Integer>();

		for (int i = 0; i < OPERATORS.length; i++) {
			for (String op : OPERATORS[i]) {
				precedenceMapping.put(op, i);
			}
		}
	}

	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout) throws BcException {
		if (args == null || args.length == 0) {
			throw new BcException("No expressions specified");
		} else if (stdout == null) {
			throw new BcException("No output stream specified");
		} else if (args.length == 1) {
			String expression = args[0];

			if (isValidBracketMatching(expression)) {
				String postfixExpression = getPostfixExpression(expression);
				String result = calculate(postfixExpression);
				printResult(result, stdout);
			} else {
				throw new BcException("Invalid expression");
			}

		} else {
			throw new BcException("Too many arguments specified");
		}

	}

	private void printResult(String result, OutputStream stdout) throws BcException {
		try {
			result += System.lineSeparator();
			stdout.write(result.getBytes("UTF-8"));
		} catch (IOException e) {
			throw new BcException("IOException");
		}
	}

	public String getPostfixExpression(String toBeProcessed) throws BcException {
		
		Stack<String> postfixStack = new Stack<String>();

		StringBuilder postFixBuilder = new StringBuilder();

		String[] expression = toBeProcessed.split("");
		
		
		
		if (expression[0].equals("")) {
			start = 1;
		} else {
			start = 0;
		}

		for (int i = start; i < expression.length; i++) {
			String exp = expression[i];

			if (exp.equals("(")) {
				postfixStack.push(exp);
			} else if (exp.equals(")")) {

				while (!postfixStack.peek().equals("(")) {
					postFixBuilder.append(postfixStack.pop());
					postFixBuilder.append(" ");
				}
				postfixStack.pop();
			} else if (exp.equals("!")) {
				i = processOperandWithNot(postFixBuilder, expression, i, exp);
			} else if (isValidOperator(exp) && !exp.equals("-")) {

				i = processOperator(postfixStack, postFixBuilder, expression, i, exp);
			} else if (exp.equals("-")) {
				if (isNegationAndNotSubtraction(expression, i)) {
					i = processOperand(postFixBuilder, expression, i, exp);
				} else {
					i = processOperator(postfixStack, postFixBuilder, expression, i, exp);
				}
			} else {
				i = processOperand(postFixBuilder, expression, i, exp);
			}
		}

		while (!postfixStack.isEmpty()) {
			postFixBuilder.append(postfixStack.pop());
			postFixBuilder.append(" ");
		}

		return postFixBuilder.toString().trim();
	}

	private boolean isNegationAndNotSubtraction(String[] expression, int i) {
		return i == start || isValidOperator(expression[i-1]) || expression[i-1].equals("(");
	}

	private int processOperand(StringBuilder postFixBuilder, String[] expression, int i, String exp)
			throws BcException {
		if (!Character.isDigit(exp.toCharArray()[0]) && !exp.equals(".") && !exp.equals("-")) {
			throw new BcException("Invalid operator");
		}
		StringBuilder number = new StringBuilder();
		
		if (exp.equals("-")) {
			number.append(exp);
			if (i < expression.length - 1) {
				exp = expression[++i];
			} else {
				throw new BcException("Invalid Expression");
			}
		}

		while ((Character.isDigit(exp.toCharArray()[0]) || exp.equals(".")) && i < expression.length) {
			number.append(exp);
			if (i < expression.length - 1) {
				exp = expression[++i];
			} else {
				++i;
			}
		}
		--i;

		postFixBuilder.append(number.toString());
		postFixBuilder.append(" ");
		return i;
	}
	
	private int processOperandWithNot(StringBuilder postfixBuilder, String[] expression, int i, String exp)
			throws BcException {
		if (!Character.isDigit(exp.toCharArray()[0]) && !exp.equals("!")) {
			throw new BcException("Invalid operator");
		}
		StringBuilder number = new StringBuilder();
		
	
		if (i < expression.length - 1) {
			exp = expression[++i];
		} else {
			throw new BcException("Invalid Expression");
		}
		
		while ((Character.isDigit(exp.toCharArray()[0]) || exp.equals(".")) && i < expression.length) {
			number.append(exp);
			if (i < expression.length - 1) {
				exp = expression[++i];
			} else {
				++i;
			}
		}
		--i;
		
		String[] arg = new String[]{number.toString()};
		String res = this.not(arg);

		postfixBuilder.append(res);
		postfixBuilder.append(" ");
		return i;
	}

	private int processOperator(Stack<String> postfixStack, StringBuilder postFixBuilder, String[] expression, int i,
			String exp) throws BcException {
		if (i == expression.length - 1) {
			throw new BcException("Invalid expression");
		} else {
			// check next
			if (isValidOperator(exp + expression[i + 1])) {
				exp = exp + expression[++i];
			}

			int currentPrecedenceLevel = precedenceMapping.get(exp);
			while (!postfixStack.isEmpty() && !postfixStack.peek().equals("(")
					&& currentPrecedenceLevel <= precedenceMapping.get(postfixStack.peek())) {
				postFixBuilder.append(postfixStack.pop());
				postFixBuilder.append(" ");
			}
			postfixStack.push(exp);
		}
		return i;
	}

	public String calculate(String postFixExpression) throws BcException {
		Stack<String> myStack = new Stack<String>();

		for (String s : postFixExpression.split(" ")) {
			if (isValidOperator(s)) {
				String arg2 = myStack.pop();
				String arg1 = myStack.pop();
				String op = s;
				String result = performOperation(arg1, arg2, op);
				myStack.push(result);
			} else {
				myStack.push(s);
			}
		}

		return myStack.pop();
	}

	private String performOperation(String arg1, String arg2, String op) throws BcException {
		String result = "";
		switch (op) {
		case "+":
			return add(createArgument(arg1, arg2));
		case "-":
			return subtract(createArgument(arg1, arg2));
		case "*":
			return multiply(createArgument(arg1, arg2));
		case "/":
			return divide(createArgument(arg1, arg2));
		case "^":
			return pow(createArgument(arg1, arg2));
		case ">":
			return greaterThan(createArgument(arg1, arg2));
		case ">=":
			return greaterThanOrEqual(createArgument(arg1, arg2));
		case "<":
			return lessThan(createArgument(arg1, arg2));
		case "<=":
			return lessThanOrEqual(createArgument(arg1, arg2));
		case "==":
			return equalEqual(createArgument(arg1, arg2));
		case "!=":
			return notEqual(createArgument(arg1, arg2));
		case "&&":
			return and(createArgument(arg1, arg2));
		case "||":
			return or(createArgument(arg1, arg2));
		}

		return result;
	}

	private String[] createArgument(String... args) {
		String[] arguments = new String[args.length];

		for (int i = 0; i < args.length; i++) {
			arguments[i] = args[i];
		}

		return arguments;
	}

	public boolean isValidOperator(String operator) {
		for (String[] ops : OPERATORS) {
			for (String op : ops) {
				if (op.equals(operator)) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean isValidBracketMatching(String expression) {
		Stack<Character> brackets = new Stack<Character>();

		for (char c : expression.toCharArray()) {
			if (c == '(') {
				brackets.push(c);
			} else if (c == ')') {
				if (brackets.isEmpty() || brackets.pop() != '(') {
					return false;
				}
			}
		}

		return brackets.isEmpty();
	}

	@Override
	public String number(String[] args) {
		return args[0];
	}

	@Override
	public String negate(String[] args) {
		StringBuilder myStringBuilder = new StringBuilder();

		String num = args[0];
		if (num.charAt(0) == '-') {
			myStringBuilder.append(num.substring(1));
		} else {
			myStringBuilder.append("-");
			myStringBuilder.append(num);
		}

		return myStringBuilder.toString();
	}

	@Override
	public String add(String[] args) {
		BigDecimal firstOperand = new BigDecimal(args[0]);
		BigDecimal secondOperand = new BigDecimal(args[1]);

		BigDecimal sum = firstOperand.add(secondOperand);

		return sum.toString();
	}

	@Override
	public String subtract(String[] args) {
		BigDecimal firstOperand = new BigDecimal(args[0]);
		BigDecimal secondOperand = new BigDecimal(args[1]);

		BigDecimal result = firstOperand.subtract(secondOperand);

		return result.toString();
	}

	@Override
	public String multiply(String[] args) {
		BigDecimal firstOperand = new BigDecimal(args[0]);
		BigDecimal secondOperand = new BigDecimal(args[1]);

		BigDecimal result = firstOperand.multiply(secondOperand);

		return result.toString();
	}

	@Override
	public String divide(String[] args) throws BcException {
		if (args[1].equals("0")) {
			throw new BcException("Division by zero");
		}
		try {

			BigDecimal firstOperand = new BigDecimal(args[0]);
			BigDecimal secondOperand = new BigDecimal(args[1]);

			BigDecimal result = firstOperand.divide(secondOperand);
			return result.toString();

		} catch (Exception e) {
			MathContext mc = new MathContext(9, RoundingMode.CEILING);

			BigDecimal firstOperand = new BigDecimal(args[0]);
			BigDecimal secondOperand = new BigDecimal(args[1]);

			BigDecimal result = firstOperand.divide(secondOperand, mc).setScale(10, RoundingMode.CEILING);
			return result.toString();
		}

	}

	@Override
	public String pow(String[] args) throws BcException {
		int exponent = 0;
		
		try {
			exponent = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			throw new BcException("Exponent is not an integer");
		}
		
		BigDecimal firstOperand = new BigDecimal(args[0]);
		BigDecimal result = firstOperand.pow(exponent);
		return result.toString();

	}

	@Override
	public String bracket(String[] args) {
		StringBuilder res = new StringBuilder();
		for (char c : args[0].toCharArray()) {
			if (c != '(' && c != ')') {
				res.append(c);
			}
		}
		
		return res.toString();
	}

	@Override
	public String greaterThan(String[] args) {
		BigDecimal firstOperand = new BigDecimal(args[0]);
		BigDecimal secondOperand = new BigDecimal(args[1]);

		int compare = firstOperand.compareTo(secondOperand);

		return (compare > 0) ? "1" : "0";
	}

	@Override
	public String greaterThanOrEqual(String[] args) {
		BigDecimal firstOperand = new BigDecimal(args[0]);
		BigDecimal secondOperand = new BigDecimal(args[1]);

		int compare = firstOperand.compareTo(secondOperand);

		return (compare >= 0) ? "1" : "0";
	}

	@Override
	public String lessThan(String[] args) {
		BigDecimal firstOperand = new BigDecimal(args[0]);
		BigDecimal secondOperand = new BigDecimal(args[1]);

		int compare = firstOperand.compareTo(secondOperand);

		return (compare < 0) ? "1" : "0";
	}

	@Override
	public String lessThanOrEqual(String[] args) {
		BigDecimal firstOperand = new BigDecimal(args[0]);
		BigDecimal secondOperand = new BigDecimal(args[1]);

		int compare = firstOperand.compareTo(secondOperand);

		return (compare <= 0) ? "1" : "0";
	}

	@Override
	public String equalEqual(String[] args) {
		BigDecimal firstOperand = new BigDecimal(args[0]);
		BigDecimal secondOperand = new BigDecimal(args[1]);

		int compare = firstOperand.compareTo(secondOperand);

		return (compare == 0) ? "1" : "0";
	}

	@Override
	public String notEqual(String[] args) {
		BigDecimal firstOperand = new BigDecimal(args[0]);
		BigDecimal secondOperand = new BigDecimal(args[1]);

		int compare = firstOperand.compareTo(secondOperand);

		return (compare != 0) ? "1" : "0";
	}

	@Override
	public String and(String[] args) {
		long first = Long.parseLong(args[0]);
		long second = Long.parseLong(args[1]);

		boolean res = (first != 0) && (second != 0);

		return res ? "1" : "0";
	}

	@Override
	public String or(String[] args) {
		long first = Long.parseLong(args[0]);
		long second = Long.parseLong(args[1]);

		Boolean res = (first != 0) || (second != 0);

		return res ? "1" : "0";
	}

	@Override
	public String not(String[] args) {
		return (args[0].equals("0") || args[0].equals("-0")) ? "1" : "0";
	}

}
