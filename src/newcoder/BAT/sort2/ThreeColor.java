package newcoder.BAT.sort2;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月15日
 */
public class ThreeColor{
	public static int[] sortThreeColor(int[] A, int n) {
		int zero = 0;
		int two = n - 1;
		for (int i = 0; i <= two; i++) {
			if (A[i] == 0) {
				reverse(A, zero++, i);
				continue;
			}
			if (A[i] == 2) {
				reverse(A, two--, i--);
				continue;
			}
		}
		return A;
	}

	private static void reverse(int[] A, int pos1, int pos2) {
		int temp = A[pos1];
		A[pos1] = A[pos2];
		A[pos2] = temp;
	}
	
	public static void main(String[] args) {
		int[] temp ={1,2,0,2};
		System.out.println(sortThreeColor(temp,temp.length));
	}
}
