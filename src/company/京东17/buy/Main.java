package company.¾©¶«17.buy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		while (sc.hasNext()) {
			map.clear();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			String tmp = "";
			for (int i = 0; i < m; i++) {
				tmp = sc.next();
				if (map.containsKey(tmp)) {
					map.put(tmp, map.get(tmp) + 1);
				} else {
					map.put(tmp, 1);
				}
			}
			Arrays.sort(arr);
			int min = 0, max = 0;
			int[] keys = new int[map.size()];
			Iterator<Entry<String, Integer>> iterator = map.entrySet()
					.iterator();
			int ind = 0;
			while (iterator.hasNext()) {
				Entry<String, Integer> temp = iterator.next();
				keys[ind++] = temp.getValue();
			}
			Arrays.sort(keys);
			ind = keys.length - 1;
			for (int i = 0; i < keys.length; i++) {
				min += arr[i] * keys[ind--];
			}
			ind = keys.length - 1;
			for (int i = 0; i < keys.length; i++) {
				max += arr[n - i - 1] * keys[ind--];
			}
			System.out.println(min + " " + max);
		}
	}
}
