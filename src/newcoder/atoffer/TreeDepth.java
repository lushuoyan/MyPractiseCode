package newcoder.atoffer;

import leetcode.TreeNode.TreeNode;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月25日
 */
public class TreeDepth{
	public int TreeDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int nLelt = TreeDepth(root.left);
		int nRight = TreeDepth(root.right);

		return nLelt > nRight ? (nLelt + 1) : (nRight + 1);
	}
}
