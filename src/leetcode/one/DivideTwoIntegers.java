package leetcode.one;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(-1010369383, -2147483648));
	}

	public static int divide(int dividend, int divisor) {
		if (divisor == 0||divisor==Integer.MIN_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (dividend == 0) {
			return 0;
		}
		int result = 0;
		boolean negative = false;
		if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
			negative = true;
		}
		if (dividend < 0) {
			dividend = -1 * dividend;
		}
		if (divisor < 0) {
			divisor = -1 * divisor;
		}
		if (divisor == 1) {
			if (negative) {
				return -1 * dividend;
			}
			return dividend;
		}
		while (dividend >= divisor) {
			int product = 1;
			int temp = divisor;
			while (dividend - temp >= temp) {
				product = product << 1;
				temp = temp << 1;
			}
			result += product;
			dividend -= temp;
		}
		if (negative) {
			return -1 * result;
		}
		return result;
	}

}
