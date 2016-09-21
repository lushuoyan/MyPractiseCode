package leetcode.one;

public class ContainerWithMostWater {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 2, 1 };
		System.out.println(maxArea(input));
	}

	public static int maxArea(int[] height) {
		int n = height.length;
		int maxArea = 0;
		int i = 0;
		int j = n - 1;
		while (i < j) {
			int temp = (j - i)
					* (height[i] > height[j] ? height[j] : height[i]);
			if (height[i] < height[j]) {
				i++;
			} else {
				j--;
			}
			if (maxArea < temp) {
				maxArea = temp;
			}
		}
		return maxArea;
	}
}
