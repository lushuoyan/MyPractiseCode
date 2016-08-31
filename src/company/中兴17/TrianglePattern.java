package company.ÖÐÐË17;

import java.util.Stack;

public class TrianglePattern {
	public static void trianglePatternPrint(int n) {
		int start = 1;
		int ind = n;
		int num = 1;
		StringBuilder str = new StringBuilder();
		Stack<String> stack = new Stack<String>();
		while (ind > 0) {
			str.setLength(0);
			str.append(start++);
			for (int i = num - 1; i > 0; i--) {
				str.append("*" + start++);
			}
			ind--;
			num++;
			System.out.println(str.toString());
			stack.add(str.toString());
		}

		while (ind < n) {
			ind++;
			System.out.println(stack.pop());
		}
	}

	public static void main(String[] args) {
		trianglePatternPrint(4);
	}
}
