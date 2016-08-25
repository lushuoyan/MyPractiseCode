package newcoder.atoffer.firstimechar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * 类描述 找出字符串中第一个只出现一次的字符
 * 
 * @author luoshuoyan
 * @date 2016年8月25日
 */
public class Main{
	public static char FirstNotRepeatingChar(String s) {
		if (s == null) {
			return '.';
		}
		HashMap<Character, Integer> timesMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> position = new HashMap<Character, Integer>();
		char[] sarr = s.toCharArray();
		for (int i = 0; i < sarr.length; i++) {
			char key = sarr[i];
			if (timesMap.containsKey(key)) {
				Integer value = timesMap.get(sarr[i]);
				timesMap.put(key, ++value);
			} else {
				timesMap.put(key, 1);
				position.put(key, i);
			}
		}
		int min = Integer.MAX_VALUE;
		Set<Entry<Character, Integer>> set = timesMap.entrySet();
		Iterator<Entry<Character, Integer>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Character, Integer> entry = iterator.next();
			if (entry.getValue() != 1) {
				continue;
			}
			Character key = entry.getKey();
			min = position.get(key) < min ? position.get(key) : key;
		}
		return min == Integer.MAX_VALUE ? '.' : s.charAt(min);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String str = in.nextLine();
			char ans = FirstNotRepeatingChar(str);
			System.out.println(ans);
		}
	}
}
