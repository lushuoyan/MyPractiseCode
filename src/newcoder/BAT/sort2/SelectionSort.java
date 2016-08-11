package newcoder.BAT.sort2;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��6��6��
 */
public class SelectionSort{
	public int[] selectionSort(int[] A, int n) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			max = Integer.MIN_VALUE;
			int maxI = 0;
			for (int j = 0; j < n  - i; j++) {
				if (max < A[j]) {
					max = A[j];
					maxI = j;
				}
			}
			int temp = A[n - 1 - i];
			A[n - 1 - i] = A[maxI];
			A[maxI] = temp;
		}
		return A;
	}
}
