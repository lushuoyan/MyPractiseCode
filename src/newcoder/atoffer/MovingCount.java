package newcoder.atoffer;

public class MovingCount {
	public int movingCount(int threshold, int rows, int cols) {
		boolean[][] passed = new boolean[rows][cols];
		return dfs(passed, rows, cols, 0, 0, threshold);
	}

	private int dfs(boolean[][] passed, int rows, int cols, int i, int j,
			int threshold) {
		if (i < 0 || i >= rows || j < 0 || j >= cols || passed[i][j]
				|| !canGo(i, j, threshold)) {
			return 0;
		}
		passed[i][j] = true;
		return dfs(passed, rows, cols, i + 1, j, threshold )
				+ dfs(passed, rows, cols, i, j + 1, threshold )
				+ dfs(passed, rows, cols, i - 1, j, threshold )
				+ dfs(passed, rows, cols, i, j - 1, threshold ) + 1;
	}

	private boolean canGo(int i, int j, int threshold) {
		int res = 0;
		while (i > 0) {
			res += i % 10;
			i /= 10;
		}
		while (j > 0) {
			res += j % 10;
			j /= 10;
		}
		return res <= threshold;
	}
	
	public static void main(String[] args) {
		MovingCount test = new MovingCount();
		System.out.println(test.movingCount(5, 10, 10));
	}
}
