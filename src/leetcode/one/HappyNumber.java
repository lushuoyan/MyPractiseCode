package leetcode.one;

import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}

	public static boolean isHappy(int n) {
		if (n == 1) {
			return true;
		}
		HashSet<Integer> temp = new HashSet<Integer>();
		temp.add(n);
		while (true) {
			n = getHappyPower(n);
			if (n == 1) {
				return true;
			}
			if (temp.contains(n)) {
				return false;
			}
			temp.add(n);
		}
	}

	private static int getHappyPower(int n) {
		String s = String.valueOf(n);
		int length = s.length();
		int result = 0;
		for (int i = 0; i < length; i++) {
			result += Math.pow(Integer.parseInt(s.substring(0, 1)), 2);
			s = s.substring(1);
		}
		return result;
	}
}
