package newcoder.atoffer;

import java.util.ArrayList;

/**
 * ������ ��ֻ��������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ����������7��
 * ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 * 
 * @author luoshuoyan
 * @date 2016��8��25��
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