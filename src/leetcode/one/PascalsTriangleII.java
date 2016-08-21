package leetcode.one;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月14日
 */
public class PascalsTriangleII{
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> result = new ArrayList<Integer>();
		result.add(1);
		for (int i = 1; i <= rowIndex; i++) {
			ArrayList<Integer> cur = new ArrayList<Integer>();
			cur.add(1);
			for (int j = 0; j < result.size() - 1; j++) {
				cur.add(result.get(j) + result.get(j + 1));
			}
			cur.add(1);
			result = cur;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(getRow(2));
	}
}
