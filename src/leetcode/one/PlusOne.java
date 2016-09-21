package leetcode.one;

import java.util.ArrayList;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 2, 3 };
		int[] result = plusOne(input);
		System.out.println("1");
	}

	public static int[] plusOne(int[] digits) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		boolean carry = true;
		if (digits.length == 0) {
			return digits;
		}
		for (int i = digits.length - 1; i > -1; i--) {
			int temp = 0;
			if (carry) {
				temp = digits[i] + 1;
				if (temp > 9) {
					carry = true;
					temp = temp % 10;
				} else { 
					carry = false;
				}
			} else {
				temp = digits[i];
			}
			result.add(temp);
		}
		if (carry) {
			result.add(1);
		}
		int[] temp = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			temp[i] = result.get(result.size() - i - 1);
		}
		return temp;
	}
}
