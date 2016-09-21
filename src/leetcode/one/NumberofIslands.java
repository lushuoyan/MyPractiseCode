package leetcode.one;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NumberofIslands {

	public static void main(String[] args) {
		
	}

	public int numIslands(char[][] grid) {
		if(grid.length==0){
			return 0;
		}
		int result = 0;
		HashSet<String> past = new HashSet<String>();
		int row = grid[0].length;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < row; j++) {
				if (grid[i][j] == '0') {
					continue;
				}
				String target = String.valueOf(i) + "," + String.valueOf(j);
				if (past.contains(target)) {
					continue;
				}
				getCurrentIslands(grid, i, j, past);
				result++;
			}
		}

		return result;
	}

	private class Point {
		int x;
		int y;
	}

	private void getCurrentIslands(char[][] grid, int x, int y,
			HashSet<String> past) {
		List<Point> islands = new ArrayList<Point>();
		Point start = new Point();
		start.x = x;
		start.y = y;
		int line = grid.length;
		int row = grid[0].length;
		int index = 0;
		while (index != islands.size()) {
			Point current = islands.get(index++);
			if (current.x - 1 > 0 && grid[current.x - 1][current.y] == '1') {
				Point temp = new Point();
				temp.x = x - 1;
				temp.y = y;
				past.add(String.valueOf(temp.x) + "," + String.valueOf(temp.y));
				islands.add(temp);
			}
			if (current.x + 1 < row && grid[current.x + 1][current.y] == '1') {
				Point temp = new Point();
				temp.x = x + 1;
				temp.y = y;
				past.add(String.valueOf(temp.x) + "," + String.valueOf(temp.y));
				islands.add(temp);
			}
			if (current.y < line && grid[current.x][current.y + 1] == '1') {
				Point temp = new Point();
				temp.x = x;
				temp.y = y + 1;
				past.add(String.valueOf(temp.x) + "," + String.valueOf(temp.y));
				islands.add(temp);
			}
		}
	}
}
