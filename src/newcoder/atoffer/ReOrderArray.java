package newcoder.atoffer;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月24日
 */
public class ReOrderArray{
	public void reOrderArray(int[] array) {
		LinkedList<Integer> odd = new LinkedList<Integer>();
		LinkedList<Integer> even = new LinkedList<Integer>();
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			temp = array[i];
			if (temp % 2 == 1) {
				odd.add(temp);
			} else {
				even.add(temp);
			}
		}
		int m = 0;
		Iterator<Integer> iter = odd.iterator();
		while (iter.hasNext()) {
			array[m++] = iter.next();
		}
		iter = even.iterator();
		while (iter.hasNext()) {
			array[m++] = iter.next();
		}
	}
}
