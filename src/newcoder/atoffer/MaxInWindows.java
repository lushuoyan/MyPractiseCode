package newcoder.atoffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class MaxInWindows {
	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		LinkedList<Integer> win = new LinkedList<Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (num == null || size < 1 || num.length < size) {
			return res;
		}
		for (int i = 0; i < size; i++) {
			while (!win.isEmpty() && num[win.peekLast()] <= num[i]) {
				win.pollLast();
			}
			win.add(i);
		}
		res.add(num[win.peekFirst()]);
		for (int i = size; i < num.length; i++) {
			while (!win.isEmpty() && num[win.peekLast()] <= num[i]) {
				win.pollLast();
			}
			win.addLast(i);
			if (win.peekFirst() == i - size) {
				win.pollFirst();
			}
			res.add(num[win.peekFirst()]);
		}
		return res;
	}

	public static void main(String[] args) {
		MaxInWindows test = new MaxInWindows();
		System.out.println(test.maxInWindows(
				new int[] { 4, 3, 5, 4, 3, 3, 6, 7 }, 3));
	}
}
