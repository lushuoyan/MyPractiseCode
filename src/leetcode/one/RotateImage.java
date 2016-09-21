package leetcode.one;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(input);
	}

	public static void rotate(int[][] matrix) {
		int n = matrix.length;
		int limit = (n - 1) / 2;
		for (int i = 0; i <= limit; i++) {
			for (int j = i; j < n - 1 - i; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n - 1 - j][i];
				matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
				matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
				matrix[j][n - 1 - i] = temp;
			}
		}
	}
}
