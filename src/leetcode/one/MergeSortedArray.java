package leetcode.one;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int index = m + n - 1;
		m--;
		n--;
		for (; index > -1; index--) {
			if (n == -1) {
				nums1[index] = nums1[m--];
				continue;
			}
			if (m == -1) {
				nums1[index] = nums2[n--];
				continue;
			}
			if (nums1[m] > nums2[n]) {
				nums1[index] = nums1[m];
				m--;
			} else if (nums1[m] < nums2[n]) {
				nums1[index] = nums2[n];
				n--;
			} else {
				nums1[index--] = nums1[m];
				nums1[index] = nums1[m];
				m--;
				n--;
			}
		}

	}
}
