package leetcode.one;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
		int[] nums2 = {0,6 };
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if (nums1.length == 0 && nums2.length == 0) {
			return 0;
		}
		if (nums1.length == 0) {
			if (nums2.length % 2 == 1) {
				return nums2[(nums2.length + 1) / 2 - 1];
			} else {
				return (nums2[(nums2.length) / 2 - 1] + nums2[(nums2.length) / 2]) / 2.0;
			}
		}
		if (nums2.length == 0) {
			if (nums1.length % 2 == 1) {
				return nums1[(nums1.length + 1) / 2 - 1];
			} else {
				return (nums1[(nums1.length) / 2 - 1] + nums1[(nums1.length) / 2]) / 2.0;
			}
		}
		int[] resultArray = new int[nums1.length + nums2.length];
		int j = 0;
		int i = 0;
		int total = 0;
		while (true) {
			if ((i == nums1.length) && (j == nums2.length)) {
				break;
			}
			if (j == nums2.length) {
				resultArray[total] = nums1[i++];
				total++;
				continue;
			}
			if (i == nums1.length) {
				resultArray[total] = nums2[j++];
				total++;
				continue;
			}
			if (nums1[i] > nums2[j]) {
				resultArray[total] = nums2[j++];
			} else if (nums1[i] < nums2[j]) {
				resultArray[total] = nums1[i++];
			} else {
				resultArray[total++] = nums1[i];
				resultArray[total] = nums1[i];
				j++;
				i++;
			}
			total++;
		}
		if (total % 2 == 1) {
			return resultArray[(total + 1) / 2 - 1];
		} else {
			return ((resultArray[total / 2 - 1]) + (resultArray[total / 2])) / 2.0;
		}
	}
}
