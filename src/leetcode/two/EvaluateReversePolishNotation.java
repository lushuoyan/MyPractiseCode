package leetcode.two;

import java.util.Stack;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��7��5��
 */
public class EvaluateReversePolishNotation{
	/*
	 * Evaluate the value of an arithmetic expression in Reverse Polish
	 * Notation. Valid operators are +, -, *, /. Each operand may be an integer
	 * or another expression. Some examples: ["2", "1", "+", "3", "*"] -> ((2 +
	 * 1) * 3) -> 9 ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6 Subscribe
	 * to see which companies asked this question
	 */
	public int evalRPN(String[] tokens) {
		Stack<String> stack = new Stack<String>();
		for (String t : tokens) {
			if (!"+-*/".contains(t)) {
				stack.push(t);
				continue;
			}
			int a = Integer.valueOf(stack.pop());
			int b = Integer.valueOf(stack.pop());
			switch (t) {
				case "+":
					stack.push(String.valueOf(a + b));
					break;
				case "-":
					stack.push(String.valueOf(b - a));
					break;
				case "*":
					stack.push(String.valueOf(a * b));
					break;
				case "/":
					stack.push(String.valueOf(b / a));
					break;
			}
		}
		return Integer.valueOf(stack.pop());
	}
}
