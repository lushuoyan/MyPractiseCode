package leetcode.one;

public class ValidNumber {

	public static void main(String[] args) {
		
		System.out.println(isNumber(".1"));

	}

	public static boolean isNumber(String s) {
		String str = s;
		if (str == null || str.equals("")) {
			return false;
		}
		while (str.indexOf(" ") == 0) {
			str = str.substring(1);
		}
		while (str.lastIndexOf(" ") == str.length() - 1
				&& str.lastIndexOf(" ") != -1) {
			str = str.substring(0, str.length() - 1);
		}
		if (str == null || str.equals("")) {
			return false;
		}
		if(str.endsWith("f")){
			return false;
		}
		if(str.toLowerCase().endsWith("d")){
			return false;
		}
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
