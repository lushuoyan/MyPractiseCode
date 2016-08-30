package newcoder.atoffer;

import java.util.ArrayList;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月30日
 */
public class FindContinuousSequence{
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		if (sum == 1){
			return list;
		}
		int n = (int) (Math.ceil((Math.sqrt(8 * sum + 1) - 1) / 2));
		int tmp = 0;
		int num = 0;
		for (int i = n; i > 1; i--) {
			tmp = (i + 1) * i / 2;
			if ((sum - tmp) % i == 0) {
				ArrayList<Integer> arrayList = new ArrayList<Integer>();
				num = (sum - tmp) / i;
				for (int a = 1; a <= i; a++) {
					arrayList.add(num + a);
				}
				list.add(arrayList);
			}
		}
		return list;
	}
}
