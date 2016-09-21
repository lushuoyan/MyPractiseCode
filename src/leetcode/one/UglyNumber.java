package leetcode.one;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUgly(5));
	}

	public static boolean isUgly(int num) {
		if (num < 1) {
			return false;
		}
		while (true) {
			if (num % 2 == 1) {
				break;
			}
			num = num / 2;
		}
		while (true) {
			if (num % 3 != 0) {
				break;
			}
			num = num / 3;
		}
		while (true) {
			if (num % 5 != 0) {
				break;
			}
			num = num / 5;
		}
		if (num != 1) {
			return false;
		}
		return true;
	}
}
