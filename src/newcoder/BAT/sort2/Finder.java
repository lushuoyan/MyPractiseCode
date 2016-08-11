package newcoder.BAT.sort2;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月15日
 */
public class Finder{
	public boolean findX(int[][] mat, int n, int m, int x) {
		int r = 0, c = m - 1;
		while (r < n && c >= 0) {
			if (mat[r][c] == x) {
				return true;
			}
			// 如果比当前数更大说明该列的所有数都比x大，左移。否则下移
			if (mat[r][c] > x) {
				c--;
			} else {
				r++;
			}
		}
		return false;
	}
}
