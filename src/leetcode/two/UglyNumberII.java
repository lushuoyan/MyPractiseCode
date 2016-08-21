package leetcode.two;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月9日
 */
public class UglyNumberII{
	/*
	 * 分析：这道题最直观地想法是暴力查找，但不用想也知道会超时， 于是我想能不能找到规律，就是从每个生成数的系数。但是很遗憾。
	 * 于是想到后面的每个ugly数都是由前面的ugly数所产生的 。那这样的话就构成了一个生成链。但是这里有个重要的问题就是，
	 * 生成链必须是有序的。最开始想法是每添加一个元素就排序 ，但是也会TLE，后来发现，当我们生成x时
	 * ，我们下个希望生成的数肯定是大于x的，那么就可以从前向后查找list， 看当*2，*3，*5后生成的大于x的数中
	 * ，找到最小值，然后将其添加到list中，然后更新cur。 这里还有个trick，就是如果每次都从最开始搜索，其实是没有必要的，
	 * 直接从上次结束的位置搜索即可，因为那个位置以前都肯定小于cur.
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
