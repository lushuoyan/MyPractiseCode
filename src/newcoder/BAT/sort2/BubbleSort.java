package newcoder.BAT.sort2;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月6日
 */
public class BubbleSort{
	public int[] bubbleSort(int[] A, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}
			}
		}
		return A;
	}
}
