package leetcode.one;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月13日
 */
public class WordSearch{
	public boolean exist(char[][] board, String word) {
		int m = board.length;
		int n = board[0].length;
		char[] arr = word.toCharArray();
		boolean[][] visited = new boolean[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (dfs(board, visited, i, j, arr, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean dfs(char[][] board, boolean[][] visited, int x, int y,
			char[] arr, int k) {
		if (k == arr.length) {
			return true;
		}
		if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {
			return false;
		}
		if (visited[x][y]) {
			return false;
		}
		if (board[x][y] != arr[k]) {
			return false;
		}
		visited[x][y] = true;
		if (dfs(board, visited, x - 1, y, arr, k + 1)) {
			return true;
		}
		if (dfs(board, visited, x + 1, y, arr, k + 1)) {
			return true;
		}
		if (dfs(board, visited, x, y - 1, arr, k + 1)) {
			return true;
		}
		if (dfs(board, visited, x, y + 1, arr, k + 1)) {
			return true;
		}
		visited[x][y] = false;
		return false;
	}
}
