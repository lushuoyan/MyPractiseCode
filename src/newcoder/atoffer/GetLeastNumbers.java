package newcoder.atoffer;

import java.util.ArrayList;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月25日
 */
public class GetLeastNumbers{
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (k > input.length) {
			return res;
		}
		for (int i = 0; i < k; i++) {
			res.add(input[k]);
		}
		
		for (int i = k; i < input.length; i++) {
			for (int j = 0; j < input.length - i - 1; j++) {
				if (input[j] < input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
			res.add(input[input.length - i - 1]);
		}
		return res;
	}
}
