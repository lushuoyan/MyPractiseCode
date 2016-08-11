package newcoder.BAT.sort2;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��6��15��
 */
public class Gap{
	public int maxGap(int[] nums, int N) {
		if (nums == null || nums.length < 2) {
			return 0;
		}
		int len = nums.length;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < len; i++) {
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}
		if (min == max) {
			return 0;
		}
		boolean[] hasNum = new boolean[len + 1];
		int[] maxs = new int[len + 1];
		int[] mins = new int[len + 1];
		int bid = 0;
		for (int i = 0; i < len; i++) {
			bid = bucket(nums[i], len, min, max); // ���Ͱ��
			mins[bid] = hasNum[bid] ? Math.min(mins[bid], nums[i]) : nums[i];
			maxs[bid] = hasNum[bid] ? Math.max(maxs[bid], nums[i]) : nums[i];
			hasNum[bid] = true;
		}
		int res = 0;
		int lastMax = 0;
		int i = 0;
		while (i <= len) {
			if (hasNum[i++]) { // �ҵ���һ�����յ�Ͱ
				lastMax = maxs[i - 1];
				break;
			}
		}
		for (; i <= len; i++) {
			if (hasNum[i]) {
				res = Math.max(res, mins[i] - lastMax);
				lastMax = maxs[i];
			}
		}
		return res;
	}

	// ʹ��long������Ϊ�˷�ֹ���ʱ���
	public int bucket(long num, long len, long min, long max) {
		return (int) ((num - min) * len / (max - min));
	}
}
