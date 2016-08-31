package company.ÖÐÐË17;

import java.util.HashSet;
import java.util.LinkedList;

public class FirstInOutPage {
	public static int countCacheMiss(int max_cache_size, int[] page_requests) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedList<Integer> cache = new LinkedList<Integer>();
		if (page_requests == null || page_requests.length == 0) {
			return 0;
		}
		if (max_cache_size == 0) {
			return page_requests.length;
		}
		int res = 0;
		for (int temp : page_requests) {
			if (set.contains(temp)) {
				continue;
			}
			if (cache.size() == max_cache_size) {
				set.remove(cache.get(0));
				cache.removeFirst();
			}
			cache.add(temp);
			set.add(temp);
			res++;
		}
		return res;
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 1, 3, 1, 2 };
		System.out.println(countCacheMiss(2, input));
	}
}
