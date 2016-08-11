package leetcode.two;

import java.util.HashSet;

public class ContainsDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length == 0)
			return false;

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : nums) {
			if (!set.add(i)) {
				return true;
			}
		}

		return false;
	}
}
