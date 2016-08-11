package newcoder.BAT.dichotomy6;

import leetcode.TreeNode.TreeNode;


/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��7��4��
 */
public class CountNodes{
	public int count(TreeNode root) {
		// write code here
		if (root == null)
			return 0;
		return binaryCount(root, 1, mostLeftLevel(root, 1));
	}

	public int binaryCount(TreeNode node, int l, int h) {
		if (l == h) {
			return 1;
		}
		if (mostLeftLevel(node.right, l + 1) == h) {
			return (1 << (h - l)) + binaryCount(node.right, l + 1, h);
		} else {
			return (1 << (h - l - 1)) + binaryCount(node.left, l = 1, h);
		}
	}

	// ��������ڵ�߶�
	public int mostLeftLevel(TreeNode node, int level) {
		while (node != null) {
			level++;
			node = node.left;
		}
		return level - 1;
	}
}
