package newcoder.atoffer;

import java.util.ArrayList;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月30日
 */
public class FindNumbersWithSum{
	public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (array == null) {
			return res;
		}
		if (array.length < 2) {
			return res;
		}
		int left = 0;
		int right = array.length - 1;
		int temp;
		while (left < right) {
			temp = array[left] + array[right];
			if (temp == sum) {
				if (res.size() == 0) {
					res.add(array[left]);
					res.add(array[right]);
					continue;
				} else if (res.get(0) * res.get(1) > array[left] * array[right]) {
					res.clear();
					res.add(array[left]);
					res.add(array[right]);
				}
				left++;
				right--;
			} else if (temp < sum) {
				left++;
			} else {
				right--;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5 };
		System.out.println(FindNumbersWithSum(input, 5));
	}
}
