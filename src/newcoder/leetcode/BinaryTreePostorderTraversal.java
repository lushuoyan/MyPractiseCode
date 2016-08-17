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
public class BinaryTreePostorderTraversal{

	public ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (root == null) {
			return res;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode temp = stack.peek();
			if (temp.left == null && temp.right == null) {
				TreeNode pop = stack.pop();
				res.add(pop.val);
			} else {
				if (temp.right != null) {
					stack.push(temp.right);
					temp.right = null;
				}
				if (temp.left != null) {
					stack.push(temp.left);
					temp.left = null;
				}
			}
		}

		return res;
	}
}
