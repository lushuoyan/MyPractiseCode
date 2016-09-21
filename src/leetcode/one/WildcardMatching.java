package leetcode.one;

public class WildcardMatching {

	public static void main(String[] args) {
		System.out.println(isMatch("aa", "*"));

	}

	// aaaabaaaabbbbaabbbaabbaababbabbaaaababaaabbbbbbaabbbabababbaaabaabaaaaaabbaabbbbaababbababaabbbaababbbba
	// *****b*aba***babaa*bbaba***a*aaba*b*aa**a*b**ba***a*a*
	public static boolean isMatch(String s, String p) {
		p = p.replace("?", ".");
		p = p.replace("*", "(.){0,}");
		return s.matches(p);
		// if (p.equals("*")) {
		// return true;
		// }
		//
		// while (true) {
		// if (s.equals("") && p.equals("")) {
		// return true;
		// }
		// if (s.equals("") || p.equals("")) {
		// return false;
		// }
		// if (!p.contains("?") && !p.contains("*")) {
		// if (p.equals(s)) {
		// return true;
		// }
		// return false;
		// }
		// while (p.indexOf("?") == 0) {
		// if (s.equals("")) {
		// return false;
		// }
		// s = s.substring(1);
		// p = p.substring(1);
		// }
		// if (p.contains("?") && p.contains("*")) {
		//
		// }
		//
		// }
	}
}
