package leetcode.one;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToTitle(26));
	}

	public static String convertToTitle(int n) {
		StringBuffer result = new StringBuffer();
		while (n > 0) {
			if (n % 26 == 0) {
				result.append(Character.toChars(n % 26 + 26 - 1 + 65));
				n = n / 26 - 1;
			} else {
				result.append(Character.toChars(n % 26 - 1 + 65));
				n = n / 26;
			}
		}
		return result.reverse().toString();
	}
}
