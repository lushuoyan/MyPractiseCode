package newcoder.BAT.sort2;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月7日
 */
public class ShellSort{
	public int[] shellSort(int[] A, int n) {
		if (A == null || n < 2)
			return A;
		int feet = n / 2;
		while (feet > 0) {
			for (int i = feet; i < n; i++) {
				int index = i;
				while (index >= feet) {
					if (A[index - feet] > A[index]) {
						swap(A, index - feet, index);
						index -= feet;
					} else {
						break;
					}
				}
			}
			feet = feet / 2;
		}
		return A;
	}

	void swap(int[] A, int m, int n) {
		int temp = A[m];
		A[m] = A[n];
		A[n] = temp;
	}
}
