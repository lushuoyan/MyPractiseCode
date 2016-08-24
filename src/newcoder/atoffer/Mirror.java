package newcoder.atoffer;

import leetcode.TreeNode.TreeNode;

public class Mirror{
	public void Mirror(TreeNode root) {
		if (root == null) {
			return;
		}
		Mirror(root.left);
		Mirror(root.right);
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
}
