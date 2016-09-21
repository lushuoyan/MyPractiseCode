package leetcode.one;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String intToRoman(int num) {
		String[][] roman = {
				{ "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" },
				{ "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" },
				{ "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" },
				{ "", "M", "MM", "MMM" } };

		String reslut = "";
		int digit = 0;
		while (num != 0) {
			int remain = num % 10;
			reslut = roman[digit++][remain] + reslut;
			num /= 10;
		}
		return reslut;
	}

}
