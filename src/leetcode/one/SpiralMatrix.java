package leetcode.one;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> spiralOrder(int[][] matrix) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int x1 = 0;
		int y1 = 0;
		int x2 = matrix.length - 1;
		if (x2 < 0){
			return result;
		}
			
		int y2 = matrix[0].length - 1;
		while (x1 <= x2 && y1 <= y2) {
			for (int i = y1; i <= y2; i++) {// right
				result.add(matrix[x1][i]);
			}
			for (int j = x1 + 1; j <= x2; j++) {// down
				result.add(matrix[j][y2]);
			}
			if (x1 != x2) {
				for (int i = y2 - 1; i >= y1; i--) {// left
					result.add(matrix[x2][i]);
				}
			}
			if (y1 != y2) {// up
				for (int j = x2 - 1; j > x1; j--) {
					result.add(matrix[j][y1]);
				}
			}
			x1++;
			y1++;
			x2--;
			y2--;
		}
		return result;
	}
}
