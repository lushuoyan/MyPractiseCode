package leetcode.one;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月23日
 */
public class WordLadder{
	public int ladderLength(String start, String end, Set<String> dict) {
		Set<String> set = new HashSet<String>();
		Queue<String> queue = new LinkedList<String>();
		queue.offer(start);
		int distance = 1;
		int count = 1;
		set.add(start);

		while (count > 0) {
			while (count > 0) {
				char[] cur = queue.poll().toCharArray();
				for (int i = 0; i < cur.length; i++) {
					char tmp = cur[i];
					for (char c = 'a'; c <= 'z'; c++) {
						if (c == tmp) {
							continue;
						}
						cur[i] = c;
						String str = cur.toString();
						if (str.equals(end)) {
							return distance + 1;
						}
						if (dict.contains(str) && !set.contains(str)) {
							queue.offer(str);
							set.add(str);
						}
					}
					cur[i] = tmp;
				}
				count--;
			}
			distance++;
			count = queue.size();
		}
		return 0;
	}
}
