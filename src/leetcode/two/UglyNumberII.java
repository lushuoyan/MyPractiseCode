package leetcode.two;

import java.util.ArrayList;
import java.util.List;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��9��
 */
public class UglyNumberII{
	/*
	 * �������������ֱ�۵��뷨�Ǳ������ң���������Ҳ֪���ᳬʱ�� ���������ܲ����ҵ����ɣ����Ǵ�ÿ����������ϵ�������Ǻ��ź���
	 * �����뵽�����ÿ��ugly��������ǰ���ugly���������� ���������Ļ��͹�����һ�������������������и���Ҫ��������ǣ�
	 * ����������������ġ��ʼ�뷨��ÿ���һ��Ԫ�ؾ����� ������Ҳ��TLE���������֣�����������xʱ
	 * �������¸�ϣ�����ɵ����϶��Ǵ���x�ģ���ô�Ϳ��Դ�ǰ������list�� ����*2��*3��*5�����ɵĴ���x������
	 * ���ҵ���Сֵ��Ȼ������ӵ�list�У�Ȼ�����cur�� ���ﻹ�и�trick���������ÿ�ζ����ʼ��������ʵ��û�б�Ҫ�ģ�
	 * ֱ�Ӵ��ϴν�����λ���������ɣ���Ϊ�Ǹ�λ����ǰ���϶�С��cur.
	 */
	public static int nthUglyNumber(int n) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		int cur = 2;
		int i1 = 0, i2 = 0, i3 = 0;
		int min1, min2, min3;
		while (list.size() < n) {
			while (list.get(i1) * 2 < cur)
				i1++;
			min1 = list.get(i1) * 2;
			while (list.get(i2) * 3 < cur)
				i2++;
			min2 = list.get(i2) * 3;
			while (list.get(i3) * 5 < cur)
				i3++;
			min3 = list.get(i3) * 5;

			int next = Math.min(Math.min(min1, min2), min3);
			cur = next + 1;
			list.add(next);
		}
		return list.get(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(nthUglyNumber(439));
	}
}
