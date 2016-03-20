package sg.edu.nus.comp.cs4218.impl.app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.math.BigDecimal;

import java.util.HashMap;
import java.util.Stack;
import sg.edu.nus.comp.cs4218.app.Bc;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.BcException;

public class BcApplication implements Bc {

	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout) throws BcException {
		// TODO Auto-generated method stub
		
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
	public String divide(String[] args) {
		BigDecimal firstOperand = new BigDecimal(args[0]);
		BigDecimal secondOperand = new BigDecimal(args[1]);

		BigDecimal result = firstOperand.divide(secondOperand);

		return result.toString();
	}

	@Override
	public String pow(String[] args) {
		BigDecimal firstOperand = new BigDecimal(args[0]);
		int exponent = Integer.parseInt(args[1]);

		BigDecimal result = firstOperand.pow(exponent);

		return result.toString();
	}

	@Override
	public String bracket(String[] args) {
		String[] split = args[0].split("");
		return split[2];
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
		return (args[0].equals("0")) ? "1" : "0";
	}

}
