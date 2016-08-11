package leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		if (root == null) {
			return ret;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		queue.add(root);
		int currentLevel = 1;
		int nextLevel = 0;
		boolean left = true;
		while (!queue.isEmpty()) {
			TreeNode cur = queue.remove();
			currentLevel--;
			al.add(cur.val);
			if (cur.left != null) {
				queue.add(cur.left);
				nextLevel++;
			}
			if (cur.right != null) {
				queue.add(cur.right);
				nextLevel++;
			}

			if (currentLevel == 0) {
				if (!left) {
					Collections.reverse(al);
				}
				left = !left;
				ret.add(al);
				al = new ArrayList<Integer>();
				currentLevel = nextLevel;
				nextLevel = 0;
			}
		}
		return ret;
	}
}
