package newcoder.leetcode;

import leetcode.TreeNode.TreeNode;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��11��
 */
public class MinimumDepthofBinarytree{
	public int run(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = run(root.left);
		int right = run(root.right);
		if (left == 0 && right == 0){
			return 1;
		}
		if (left == 0){
			left = Integer.MAX_VALUE;
		}
		if (right == 0){
			right = Integer.MAX_VALUE;
		}
		return Math.min(left, right) + 1;
	}
}
