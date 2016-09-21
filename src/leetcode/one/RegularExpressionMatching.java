package leetcode.one;

public class RegularExpressionMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("abce".indexOf("ce"));
	}

	public boolean isMatch(String s, String p) {
//		s.matches(p);
		if (p.equals(".*")) {
			return true;
		}
		if (p.equals("")) {
			return false;
		}

		while (true) {
			if (s.equals("") && p.equals("")) {
				return true;
			}
			if (s.equals("") || p.equals("")) {
				return false;
			}
			if (p.contains(".") && p.contains("*")) {
				if (p.indexOf(".") > p.indexOf("*")) {
					if (p.indexOf(".") == 0) {
						s.substring(1);
						p.substring(1);
						continue;
					}
					String temp = p.substring(0, p.indexOf("."));
					int tempIndex = s.indexOf(temp);
					if (tempIndex == -1) {
						return false;
					}

				}
			} else if (p.contains(".")) {
				if (p.indexOf(".") == 0) {
					s.substring(1);
					continue;
				}

			} else if (p.contains("*")) {

			} else if (p.equals(s)) {
				return true;
			}
		}

	}
}
