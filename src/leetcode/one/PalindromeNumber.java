package leetcode.one;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-2147447412));
	}

	public static boolean isPalindrome(int x) {
        if (x < 10 && x > -1) {
			return true;
		}
		if (x < 0) {
			return false;
		}
		String input = String.valueOf(x);
		int start = 0;
		int end = input.length() - 1;
		while (input.charAt(start++) == input.charAt(end--)) {
			if (start == end) {
				return true;
			}
			if (start == end + 1) {
				return true;
			}
		}
		return false;
	}
}
