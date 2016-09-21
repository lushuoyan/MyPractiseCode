package leetcode.one;

public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("a b "));
	}

	public static int lengthOfLastWord(String s) {
		while (s.indexOf(" ") == 0) {
			if (s.equals("")) {
				return 0;
			}
			s = s.substring(1);
		}
		while (s.lastIndexOf(" ") == (s.length() - 1)) {
			if (s.equals("")) {
				return 0;
			}
			s = s.substring(0, s.length() - 1);
		}
		if (s.equals("")) {
			return 0;
		}
		if (s.lastIndexOf(" ") == -1) {
			return s.length();
		} else {
			return s.length() - s.lastIndexOf(" ") - 1;
		}

	}
}
