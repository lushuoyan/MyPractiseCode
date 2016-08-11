package newcoder.BAT.sort2;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月6日
 */
public class InsertionSort{
	public int[] insertionSort(int[] A, int n) {
		int j ;
		for (int i = 1; i < n; i++) {
			int temp = A[i];
			for (j = i; j > 0 && A[j - 1] > temp; j--) {
				A[j] = A[j - 1];
			}
			A[j] = temp;
		}
		return A;
	}
}