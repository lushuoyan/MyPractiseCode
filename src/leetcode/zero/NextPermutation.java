package leetcode.zero;

/**
 * ������ Implement next permutation, which rearranges numbers into the
 * lexicographically next greater permutation of numbers. If such arrangement is
 * not possible, it must rearrange it as the lowest possible order (ie, sorted
 * in ascending order). The replacement must be in-place, do not allocate extra
 * memory. Here are some examples. Inputs are in the left-hand column and its
 * corresponding outputs are in the right-hand column. 1,2,3 �� 1,3,2 3,2,1 ��
 * 1,2,3 1,1,5 �� 1,5,1
 * 
 * @author luoshuoyan
 * @date 2016��6��12��
 */
public class NextPermutation{
	/*** �����ֵ������һ������ ***/
	public void nextPermutation(int[] nums) {
		if (nums.length == 0 || nums.length == 1) {
			return;
		}
		// �ҵ����һ������
		int i = nums.length - 1;
		while (i > 0 && nums[i - 1] >= nums[i]) {
			i--;
		}
		// ��������жϾͲ���num����ǰ������źõ���
		if (i == 0) {
			reverse(nums, 0, nums.length - 1);
			return;
		}
		// �ҵ����һ����num[i-1]�����
		int j = i;
		while (j < nums.length && nums[j] > nums[i - 1]) {
			j++;
		}
		// ����num[i-1]��num[j-1]
		int tmp = nums[i - 1];
		nums[i - 1] = nums[j - 1];
		nums[j - 1] = tmp;
		// ��תi�Ժ����
		reverse(nums, i, nums.length - 1);
	}

	public void reverse(int[] nums, int begin, int end) {
		for (int i = begin, j = end; i < j; i++, j--) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
	}
}
