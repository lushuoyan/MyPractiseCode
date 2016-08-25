package newcoder.atoffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月25日
 */
public class Permutation{
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> res = new ArrayList<>();
		if (input == null || input.length == 0)
			return res;
		if (k > input.length)
			return res;
		Arrays.sort(input);
		for (int i = 0; i < k; i++) {
			res.add(input[i]);
		}
		return res;
	}
}
