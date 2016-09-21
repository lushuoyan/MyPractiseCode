package leetcode.one;

public class FirstBadVersion extends VersionControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int firstBadVersion(int n) {
		if (n <= 0) {
			return 0;
		}

		if (isBadVersion(1)) {
			return 1;
		} else if (!isBadVersion(n)) {
			return Integer.MAX_VALUE;
		}

		int left = 1;
		int right = n;

		int mid;
		while (true) {
			mid = left + (right - left) / 2; // 注意 left + right 有可能超过了整数的最大值
			if (mid == left) {
				return right;
			}
			if (isBadVersion(mid)) {
				right = mid;
			} else {
				left = mid;
			}
		}
	}
}
