package newcoder.atoffer;

import java.util.ArrayList;

/**
 * 类描述 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * 
 * @author luoshuoyan
 * @date 2016年8月25日
 */
public class GetUglyNumber{
	public int GetUglyNumber_Solution(int index) {
		if (index < 0) {
			return 0;
		}
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(1);
		int n2 = 0, n3 = 0, n5 = 0;
		int tmp2, tmp3, tmp5;
		int tmp;
		for (int i = 1; i < index; i++) {
			tmp2 = res.get(n2) * 2;
			tmp3 = res.get(n3) * 3;
			tmp5 = res.get(n5) * 5;
			tmp = Math.min(tmp2, Math.min(tmp3, tmp5));
			res.add(tmp);
			if (tmp == tmp2) {
				n2++;
			}
			if (tmp == tmp3) {
				n3++;
			}
			if (tmp == tmp5) {
				n5++;
			}
		}
		return res.get(index - 1);
	}
}