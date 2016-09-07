package newcoder.atoffer;

public class HasPath {
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		boolean passed[] = new boolean[matrix.length];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (dfs(matrix, rows, cols, i, j, str, 0, passed)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean dfs(char[] matrix, int rows, int cols, int i, int j,
			char[] str, int k, boolean[] passed) {
		int index = i * cols + j;
		if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k]
				|| passed[index]) {
			return false;
		}
		if (k == str.length - 1) {
			return true;
		}
		passed[index] = true;
		if (dfs(matrix, rows, cols, i - 1, j, str, k + 1, passed)
				|| dfs(matrix, rows, cols, i + 1, j, str, k + 1, passed)
				|| dfs(matrix, rows, cols, i, j - 1, str, k + 1, passed)
				|| dfs(matrix, rows, cols, i, j + 1, str, k + 1, passed)) {
			return true;
		}
		passed[index] = false;
		return false;
	}

	public static void main(String[] args) {
		HasPath test = new HasPath();
		System.out.println(test.hasPath((new String(
				"ABCEHJIGSFCSLOPQADEEMNOEADIDEJFMVCEIFGGS")).toCharArray(), 5,
				8, "SLHECCEIDEJFGGFIE".toCharArray()));
	}
}
