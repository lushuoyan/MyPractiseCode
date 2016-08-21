package leetcode.one;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月14日
 */
public class Triangle{
	public static int minimumTotal(List<List<Integer>> triangle) {
		if (triangle == null || triangle.size() == 0) {
			return 0;
		}
		List<Integer> res = new ArrayList<Integer>();
		res.add(triangle.get(0).get(0));
		for (int i = 1; i < triangle.size(); i++) {
			List<Integer> cur = triangle.get(i);
			cur.set(0, res.get(0) + cur.get(0));
			for (int j = 1; j < cur.size() - 1; j++) {
				cur.set(j, Math.min(cur.get(j) + res.get(j - 1), cur.get(j)	+ res.get(j)));
			}
			cur.set(cur.size() - 1, res.get(res.size() - 1) + cur.get(cur.size() - 1));
			res = cur;
		}
		int min = res.get(0);
		for (int i = 0; i < res.size(); i++) {
			if (res.get(i) < min) {
				min = res.get(i);
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> one = new ArrayList<Integer>();
		one.add(-1);
		ArrayList<Integer> two = new ArrayList<Integer>();
		two.add(2);
		two.add(3);
		ArrayList<Integer> three = new ArrayList<Integer>();
		three.add(1);
		three.add(-1);
		three.add(-3);
		List<List<Integer>> triangle  = new ArrayList<List<Integer>>();
		triangle.add(one);
		triangle.add(two);
		triangle.add(three);
		System.out.println(minimumTotal(triangle));
	}
}
