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
			mid = left + (right - left) / 2; // ע�� left + right �п��ܳ��������������ֵ
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
