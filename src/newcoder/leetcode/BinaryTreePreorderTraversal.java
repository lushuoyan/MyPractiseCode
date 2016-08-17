package newcoder.leetcode;

import java.util.ArrayList;
import java.util.Stack;

import leetcode.TreeNode.TreeNode;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月15日
 */
public class BinaryTreePreorderTraversal{
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (root == null) {
			return res;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			res.add(temp.val);
			if (temp.right != null) {
				stack.push(temp.right);
			}
			if (temp.left != null) {
				stack.push(temp.left);
			}
		}
		return res;
	}
}
