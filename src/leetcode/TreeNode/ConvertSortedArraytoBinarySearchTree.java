package leetcode.TreeNode;

public class ConvertSortedArraytoBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums) {
		return createLeaf( nums, 0, nums.length - 1);
	}

	private TreeNode createLeaf(int[] nums, int start, int end) {
		if (start > end) {
			return null;
		}
		if (start == end) {
			return new TreeNode(nums[end]);
		}
		int middle = (start + end) / 2;
		TreeNode root = new TreeNode(nums[middle]);
		root.left = createLeaf(nums, start, middle - 1);
		root.right = createLeaf(nums, middle + 1, end);
		return root;
	}
}
