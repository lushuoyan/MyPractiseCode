package newcoder.leetcode;

import java.util.Stack;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月11日
 */
public class EvaluateReversePolishNotation{
	// 逆波兰算法
	public int evalRPN(String[] tokens) {
		int res = 0;
		if (tokens.length == 0) {
			return res;
		}
		if (tokens.length == 1) {
			return Integer.valueOf(tokens[0]);
		}
		Stack<Integer> stack = new Stack<Integer>();
		for (String cur : tokens) {
			if ("-".equals(cur)) {
				int sec = stack.pop();
				int fir = stack.pop();
				stack.push(fir - sec);
			} else if ("+".equals(cur)) {
				int sec = stack.pop();
				int fir = stack.pop();
				stack.push(fir + sec);
			} else if ("*".equals(cur)) {
				int sec = stack.pop();
				int fir = stack.pop();
				stack.push(fir * sec);
			} else if ("/".equals(cur)) {
				int sec = stack.pop();
				int fir = stack.pop();
				stack.push(fir / sec);
			} else {
				stack.push(Integer.valueOf(cur));
			}
		}
		return stack.pop();
	}
}
