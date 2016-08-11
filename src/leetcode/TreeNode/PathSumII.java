package leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月20日
 */
public class PathSumII{
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root != null) {
			ArrayList<Integer> path = new ArrayList<Integer>();
			getPath(root, path, 0, sum, res);
		}
		return res;
	}

	private void getPath(TreeNode leaf, ArrayList<Integer> path, int pathSum,
			int sum, List<List<Integer>> res) {
		if (leaf.left == null && leaf.right == null
				&& leaf.val + pathSum == sum) {
			path.add(leaf.val);
			res.add(new ArrayList<Integer>(path));
			path.remove(path.size() - 1);
			return;
		}
		if (leaf.left != null) {
			path.add(leaf.val);
			getPath(leaf.left, path, leaf.val + pathSum, sum, res);
			path.remove(path.size() - 1);
		}
		if (leaf.right != null) {
			path.add(leaf.val);
			getPath(leaf.right, path, leaf.val + pathSum, sum, res);
			path.remove(path.size() - 1);
		}
	}
}
