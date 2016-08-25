package newcoder.atoffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月25日
 */
public class PrintMinNumber{
	public String PrintMinNumber(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		}
		Collections.sort(list, new Comparator<Integer>(){
			public int compare(Integer s1, Integer s2) {
				return (s1 + "" + s2).compareTo(s2 + "" + s1);
			}
		});
		StringBuilder str = new StringBuilder();
		for (int tmp : list) {
			str.append(tmp);
		}
		return str.toString();
	}
}
