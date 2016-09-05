package newcoder.atoffer;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��30��
 */
public class Multiply {
	public int[] multiply(int[] A) {
		int len = A.length;
		int forword[] = new int[len];
		int backword[] = new int[len];
		int B[] = new int[len];
		forword[0] = 1;
		backword[0] = 1;
		for (int i = 1; i < len; i++) {
			forword[i] = A[i - 1] * forword[i - 1];
			backword[i] = A[len - i] * backword[i - 1];
		}
		for (int i = 0; i < len; i++) {
			B[i] = forword[i] * backword[len - i - 1];
		}
		return B;
	}
}
