package leetcode.one;

import java.util.Stack;

public class LongestValidParentheses {

	public static void main(String[] args) {
		System.out.println(longestValidParentheses(")()())"));
	}

	public static int longestValidParentheses(String s) {
		Stack<Integer> stk = new Stack<Integer>();
		int res = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '(')
				stk.push(i);
			else {
				if (!stk.isEmpty() && ch[stk.peek()] == '(') {
					stk.pop();
					res = Math.max(stk.isEmpty() ? i + 1 : i - stk.peek(), res);
				} else
					stk.push(i);
			}
		}
		return res;
	}
}
