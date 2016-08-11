package newcoder.BAT;


/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月6日
 */
public class test{
	public static int[] mergeSort(int[] A, int n) {
		sort(A, 0, n - 1);
		return A;
	}

	private static void sort(int[] A, int left, int right) {
		if (left >= right) {
			return;
		}
		int middle = (right + left) / 2;
		sort(A, left, middle);
		sort(A, middle + 1, right);
		merge(A, left, middle, right);
	}

	private static void merge(int[] A, int left, int middle, int right) {
		int[] temp = new int[right - left + 1];
		int tempLeft = left;
		int tempRight = middle + 1;
		int tempIndex = 0;
		while (tempLeft <= middle && tempRight <= right) {
			if (A[tempLeft] < A[tempRight]) {
				temp[tempIndex++] = A[tempLeft++];
			} else {
				temp[tempIndex++] = A[tempRight++];
			}
		}
		while (tempLeft <= middle) {
			temp[tempIndex++] = A[tempLeft++];
		}
		while (tempRight <= right) {
			temp[tempIndex++] = A[tempRight++];
		}
		tempLeft = left;
		tempIndex = 0;
		while (tempLeft <= right) {
			A[tempLeft++] = temp[tempIndex++];
		}
	}
	public static void main(String[] args) {
		int[] A = {54,35,48,36,27,12,44,44,8,14,26,17,28};
		mergeSort(A,13);
	}
}
