package newcoder.atoffer;

import leetcode.TreeNode.TreeNode;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��29��
 */
public class IsBalanced{
	public boolean IsBalanced_Solution(TreeNode root) {
		if (root == null)
			return true;

		if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1)
			return false;

		return IsBalanced_Solution(root.left)
				&& IsBalanced_Solution(root.right);

	}

	public int getHeight(TreeNode root) {
		if (root == null)
			return 0;
		return max(getHeight(root.left), getHeight(root.right)) + 1;
	}

	private int max(int a, int b) {
		return (a > b) ? a : b;
	}
}
