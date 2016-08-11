package newcoder.BAT.sort2;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月6日
 */
public class QuickSort{
	public int[] quickSort(int[] A, int n) {
		quickSort(A, 0, n - 1);
		return A;
	}

	public void quickSort(int[] A, int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = A[end];
		int counter = start;
		for (int i = start; i < end; i = i + 1) {
			if (A[i] < mid) {
				swap(A, counter, i);
				counter = counter + 1;
			}
		}
		swap(A, counter, end);
		quickSort(A, start, counter - 1);
		quickSort(A, counter + 1, end);
	}

	public void swap(int[] A, int n1, int n2) {
		int temp = A[n1];
		A[n1] = A[n2];
		A[n2] = temp;
	}

}
