package leetcode.one;

import java.util.Arrays;

public class SingleNumberIII {

	public static void main(String[] args) {
		int[] input = { 0,0,1,2 };
		System.out.println(singleNumber(input));

	}

	public static int[] singleNumber(int[] nums) {
		if (nums.length == 2) {
			return nums;
		}
		Arrays.sort(nums);

		int[] temp = new int[2];
		int j = 0;
		for (int i = 0; i < nums.length - 1;) {
			if (nums[i] != nums[i + 1]) {
				temp[j++] = nums[i];
				i++;
			} else {
				i += 2;
			}
		}
		if(j==1){
			temp[j] = nums[nums.length - 1];
		}
		
		return temp;
	}
}
