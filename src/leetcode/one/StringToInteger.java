package leetcode.one;

public class StringToInteger {

	public static void main(String[] args) {
		System.out.println(myAtoi("+"));
	}

	public static int myAtoi(String str) {
		int max = 2147483647;
		int min = -2147483648;
		int result = 0;
		int len = str.length();
		int start = -1;
		boolean neg = false;
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (ch == '+' || ch == '-' || (ch >= '0' && ch <= '9')) {
				start = i;
				break;
			} else if (ch == ' ') {

			} else {
				break;
			}
		}
		if (start == -1) {
			return 0;
		}

		if (str.charAt(start) == '-' || str.charAt(start) == '+') {
			if (str.charAt(start) == '-') {
				neg = true;
			}
			start++;
		}

		for (int i = start; i < len; i++) {
			char ch = str.charAt(i);
			char next = 0;
			if (i + 1 < len)
				next = str.charAt(i + 1);
			if (ch < '0' || ch > '9')
				break;
			result = 10 * result + (ch - '0');

			if (next >= '0' && next <= '9') {
				if (result > max / 10) {
					if (neg) {
						return min;
					}
					return max;
				}

				if (result == max / 10) {
					if (neg) {
						if (next - '0' >= 8) {
							return min;
						}
						return -1 * (10 * result + (next - '0'));

					}
					if (next - '0' >= 7) {
						return max;
					}
					return 10 * result + (next - '0');
				}
			}

		}
		if (neg) {
			result = -result;
		}
		return result;
	}

}
