package leetcode.one;

public class RemoveDuplicateLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeDuplicateLetters("bcabc"));
	}
 
	public static String removeDuplicateLetters(String s) {
		int[] count = new int[26];
		int pos = 0;
		for (int i = 0; i < s.length(); i++){
			count[s.charAt(i) - 'a']++;
		}
			
 	for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < s.charAt(pos)){
				pos = i;	
			}
			
			if (--count[s.charAt(i) - 'a'] == 0){
				break;
			}
		}
		return s.length() == 0 ? "" : s.charAt(pos)
				+ removeDuplicateLetters(s.substring(pos + 1).replaceAll(
						"" + s.charAt(pos), ""));
	}

}
