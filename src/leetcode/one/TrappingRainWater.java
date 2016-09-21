package leetcode.one;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] input = {4,4,4,7,1,0};
		System.out.println(trap(input));
	}

	public static int trap(int[] height) {
		int nextHighIndex = getNextHighIndex(height, 0, 0);
		if (height.length == 0) {
			return 0;
		}
		int tempHeight = height[nextHighIndex];
		int result = 0;
		for (int i = nextHighIndex; i < height.length; i++) {
			if (i != nextHighIndex) {
				result += (tempHeight - height[i]);
				continue;
			}
			nextHighIndex = getNextHighIndex(height, height[i], i);
			int high = height[nextHighIndex];
			tempHeight = high > height[i] ? height[i] : high;
			if(nextHighIndex==0){
				break;
			}
		}
		return result;
	}

	public static int getNextHighIndex(int[] height, int high, int i) {
		int index = 0;
		int temp = i;
		for (; temp < height.length; temp++) {
			if (high < height[temp]) {
				return temp;
			}
		}
		int tempHigh = 0;
		temp = i + 1;
		for (; temp < height.length; temp++) {
			if (tempHigh < height[temp]) {
				tempHigh = height[temp];
				index = temp;
			}
		}
		return index;
	}
}
