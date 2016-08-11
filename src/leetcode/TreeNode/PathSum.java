package leetcode.TreeNode;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月20日
 */
public class PathSum{
	public boolean hasPathSum(TreeNode root, int sum) {
		boolean[] res = new boolean[1];
		if (root != null) {
			checkPathSum(root, 0, sum, res);
		}
		return res[0];
	}

	private void checkPathSum(TreeNode leaf, int pathSum, int sum, boolean[] res) {
		if (leaf.left == null && leaf.right == null
				&& leaf.val + pathSum == sum) {
			res[0] = true;
			return;
		}
		if (leaf.left != null) {
			checkPathSum(leaf.left, leaf.val + pathSum, sum, res);
		}
		if (leaf.right != null) {
			checkPathSum(leaf.right, leaf.val + pathSum, sum, res);
		}
	}

}
