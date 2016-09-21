package leetcode.one;

public class MultiplyStrings {

	public static void main(String[] args) {
	}

	public String multiply(String num1, String num2) {
		if (num1 == null || num1.length() == 0 || num2 == null
				|| num2.length() == 0)
			return "";
		int[] number1 = toIntegerArray(num1);
		int[] number2 = toIntegerArray(num2);
		int[] result = new int[num1.length() + num2.length()];

		int startIndex = 0;
		for (int i = num1.length() - 1; i >= 0; i--) {
			int extra = 0;
			for (int j = num2.length() - 1; j >= 0; j--) {
				int value = number1[i]
						* number2[j]
						+ result[(result.length - 1) - startIndex + j
								- (num2.length() - 1)] + extra;
				extra = value / 10;
				value = value % 10;
				result[(result.length - 1) - startIndex + j
						- (num2.length() - 1)] = value;
			}
			result[(result.length - 1) - startIndex - 1 - (num2.length() - 1)] = extra;
			startIndex++;
		}
		String str = "";
		boolean isBeginningZero = true;
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 0 && isBeginningZero == true) {

			} else {
				isBeginningZero = false;
				str += result[i];
			}
		}
		return str == "" ? "0" : str;
	}

	public int[] toIntegerArray(String num) {
		if (num == null || num.length() == 0)
			return null;
		int length = num.length();
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = num.charAt(i) - '0';
		}
		return arr;
	}
}
