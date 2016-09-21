package company.°Ù¶È17.bighomes;


public class BigHomes {
	public static int bigHomes(int[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		int[] arr = new int[1];
		boolean[][] passed = new boolean[grid.length][grid[0].length];
		int i = 0, j = 0;
		int res = 0;
		while (i < grid.length && j < grid[0].length) {
			res = Math.max(res, arr[0]);
			if (grid[i][j] == 0) {
				arr[0] = 0;
			}
			dfs(i++, j++, passed, grid, arr);
		}
		return arr[0];
	}

	private static void dfs(int i, int j, boolean[][] passed, int[][] grid,
			int[] arr) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid.length) {
			return;
		}
		if (passed[i][j]) {
			return;
		}
		if (grid[i][j] == 0) {
			passed[i][j] = true;
			return;
		}
		if (grid[i][j] == 1) {
			arr[0]++;
		}
		dfs(i - 1, j, passed, grid, arr);
		dfs(i + 1, j, passed, grid, arr);
		dfs(i, j + 1, passed, grid, arr);
		dfs(i, j - 1, passed, grid, arr);
	}
}
