package leetcode.zero;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ The gray code is a binary numeral system where two successive values
 * differ in only one bit. Given a non-negative integer n representing the total
 * number of bits in the code, print the sequence of gray code. A gray code
 * sequence must begin with 0. For example, given n = 2, return [0,1,3,2]. Its
 * gray code sequence is: 00 - 0 01 - 1 11 - 3 10 - 2 Note: For a given n, a
 * gray code sequence is not uniquely defined. For example, [0,2,3,1] is also a
 * valid gray code sequence according to the above definition. For now, the
 * judge is able to judge based on one instance of gray code sequence. Sorry
 * about that. Subscribe to see which companies asked this question
 * 
 * @author luoshuoyan
 * @date 2016��6��2��
 */
public class GrayCode{
	public static List<Integer> grayCode(int n) {
		List<Integer> res = new ArrayList<Integer>();
		res.add(0);
		if (n <= 0)
			return res;
		res.add(1);
		for (int i = 1; i < n; i++) {
			int tar = (int) Math.pow(2, i);
			int size = res.size();
			for(int j = size-1 ; j >-1 ;j--){
				res.add(tar+res.get(j));
			}
		}
		return res;
	}
	public static void main(String[] args) {
		List<Integer> res = grayCode(3);
		for(int i = 0 ; i < res.size();i++){
			System.out.println(res.get(i));
		}
	}
}
