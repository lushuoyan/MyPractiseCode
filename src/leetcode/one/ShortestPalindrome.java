package leetcode.one;

public class ShortestPalindrome {
	public static void main(String[] args) {
		System.out.println(shortestPalindrome("aacecaaa"));
	}
	
	public static String shortestPalindrome(String s){
		String longest = longestPalindrome(s);
		int index = s.indexOf(longest);
		String temp = s.substring(index, longest.length());
		if(index==0){
			
		}
		System.out.println(index);
		return null;
	}
	

	public  static String longestPalindrome(String s) {  
        if (s.isEmpty()) {  
            return null;  
        }  
        if (s.length() == 1) {  
            return s;  
        }  
        String longest = s.substring(0, 1);  
        for (int i = 0; i < s.length(); i++) {  
            String tmp = getPalindromeSubString(s, i, i);  
            if (tmp.length() > longest.length()) {  
                longest = tmp;  
            }  
  
            tmp = getPalindromeSubString(s, i, i + 1);  
            if (tmp.length() > longest.length()) {  
                longest = tmp;  
            }  
        }  
        return longest;  
    }  
  
	public static String getPalindromeSubString(String s, int begin, int end) {  
        while (begin >= 0 && end <= s.length() - 1  
                && s.charAt(begin) == s.charAt(end)) {  
            begin--;  
            end++;  
        }  
        return s.substring(begin + 1, end);  
    }
}
