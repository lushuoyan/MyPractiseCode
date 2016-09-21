package leetcode.one;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int romanToInt(String s) {
		int result = toNumber(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (toNumber(s.charAt(i - 1)) < toNumber(s.charAt(i))) {
				result += toNumber(s.charAt(i)) - 2 * toNumber(s.charAt(i - 1));
			} else {
				result += toNumber(s.charAt(i));
			}
		}
		return result;
	}

	int toNumber(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}

}
