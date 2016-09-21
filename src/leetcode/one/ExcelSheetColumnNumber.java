package leetcode.one;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int titleToNumber(String s) {
		int sum = 0;
		int tmp = 0;
		for (int i = 0; i < s.length(); ++i) {
			tmp = s.charAt(i) - 'A' + 1;
			sum = 26 * sum + tmp;
		}
		return sum;
	}

}
