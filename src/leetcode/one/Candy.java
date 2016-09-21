package leetcode.one;

import java.util.Arrays;

public class Candy {

	public static void main(String[] args) {

	}

	public int candy(int[] ratings) {
		int size = ratings.length;
		if (size == 0) {
			return -1;
		}

		if (size == 1) {
			return 1;
		}
		int[] cans = new int[size];
		cans[0] = 1;
		// ����ɨ��һ�飬����ұߵ�rating����߸ߣ���ô�ұߵ��ǹ����ͱ���߶�һ��������ֻ��һ���ǹ�
		for (int i = 1; i < size; i++) {
			if (ratings[i] > ratings[i - 1]) {
				cans[i] = cans[i - 1] + 1;
			}

			else {
				cans[i] = 1;
			}

		}
		// ����ɨ��һ�飬�����ߵ�rating���ұ߸ߣ�������ߵ��ǹ������ұ��٣���ô��ߵ��ǹ���Ӧ���ұ߶�һ
		for (int i = size - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1] && cans[i] <= cans[i + 1]) {
				cans[i] = cans[i + 1] + 1;
			}
		}

		int ret = 0;
		for (int i = 0; i < size; i++) {
			ret += cans[i];
		}

		return ret;
	}
}
