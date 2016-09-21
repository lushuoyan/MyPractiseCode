package leetcode.one;

public class LargestRectangleinHistogram {
	public int largestRectangleArea(int[] heights) {
		int area = 0;
		java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
		for (int i = 0; i < heights.length; i++) {
			if (stack.empty() || heights[stack.peek()] < heights[i]) {
				stack.push(i);
			} else {
				int start = stack.pop();
				int width = stack.empty() ? i : i - stack.peek() - 1;
				area = Math.max(area, heights[start] * width);
				i--;
			}
		}
		while (!stack.empty()) {
			int start = stack.pop();
			int width = stack.empty() ? heights.length : heights.length
					- stack.peek() - 1;
			area = Math.max(area, heights[start] * width);
		}
		return area;

	}
}
