package leetcode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		if (strs == null || strs.length == 0)
			return result;
		HashMap<String, List<String>> map = new HashMap<>();

		for (int i = 0; i < strs.length; i++) {
			char[] chars = strs[i].toCharArray();
			// ×ÖµäÐòÅÅÐò
			Arrays.sort(chars);
			String temp = new String(chars);

			if (!map.containsKey(temp)) {
				List<String> result_list = new ArrayList<>();
				result_list.add(strs[i]);
				map.put(temp, result_list);
			} else {
				map.get(temp).add(strs[i]);
			}
		}

		Iterator<Map.Entry<String, List<String>>> iterator = map.entrySet()
				.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, List<String>> entry = iterator.next();
			List<String> temp_list = entry.getValue();
			Collections.sort(temp_list);
			result.add(temp_list);
		}
		return result;

	}
}
