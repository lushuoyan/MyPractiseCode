package leetcode.one;

public class AddDigits {

	public static void main(String[] args) {
		System.out.println(addDigits(99));
	}

	public static int addDigits(int num) {
		while (num > 9) {
			num = getDigit(num);
		}
		return num;
	}

	private static int getDigit(int m) {
		String s = String.valueOf(m);
		int result = 0;
		int length = s.length();
		for (int i = 0; i < length; i++) {
			int temp = Integer.parseInt(s.substring(0, 1));
			result += temp;
			s = s.substring(1);
		}
		return result;
	}
}
