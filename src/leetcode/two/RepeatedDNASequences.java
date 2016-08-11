package leetcode.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��3��
 */
public class RepeatedDNASequences{
	public static List<String> findRepeatedDnaSequences(String s) {
		List<String> result = new ArrayList<String>();

		int len = s.length();
		if (len < 10) {
			return result;
		}

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('A', 0);
		map.put('C', 1);
		map.put('G', 2);
		map.put('T', 3);

		Set<Integer> temp = new HashSet<Integer>();
		Set<Integer> added = new HashSet<Integer>();

		int hash = 0;
		for (int i = 0; i < len; i++) {
			if (i < 9) {
				hash = (hash << 2) + map.get(s.charAt(i));
			} else {
				hash = (hash << 2) + map.get(s.charAt(i));
				hash = hash & (1 << 20) - 1;
				if (temp.contains(hash) && !added.contains(hash)) {
					result.add(s.substring(i - 9, i + 1));
					added.add(hash);
				} else {
					temp.add(hash);
				}
			}
		}
		return result;
	}

	/**
	 * �������.
	 * 
	 * @author luoshuoyan 2016��8��3��
	 */
	public static void main(String[] args) {
		List<String> res = findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCAAAAAGGGTTT");
		for (String test : res) {
			System.out.println(test);
		}
	}

}
