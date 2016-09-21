package leetcode.one;

public class Searcha2DMatrix {
	public static void main(String[] args) {
		int[][] input = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 } };
		System.out.println(searchMatrix(input, 3));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		int i = 0;
		int M = matrix.length;
		int N = matrix[i].length;
		for (; i < M - 1; i++) {
			if (matrix[i][0] == target || matrix[i + 1][0] == target) {
				return true;
			}

			if (matrix[i][0] < target && matrix[i + 1][0] > target) {
				if (matrix[i][N - 1] < target) {
					return false;
				}
				for (int j = 0; j < matrix[i].length; j++) {
					if (matrix[i][j] == target) {
						return true;
					}
				}
				break;
			}
		}
		if (matrix[i][0] > target || matrix[i][N - 1] < target) {
			return false;
		}
		for (int j = 0; j < N; j++) {
			if (matrix[i][j] == target) {
				return true;
			}
		}
		return false;
	}
}
