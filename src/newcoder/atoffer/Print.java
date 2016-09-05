package newcoder.atoffer;

import java.util.ArrayList;
import java.util.LinkedList;

import leetcode.TreeNode.TreeNode;

public class Print {
	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		LinkedList<TreeNode> q = new LinkedList<TreeNode>();
		if (pRoot == null) {
			return res;
		}
		q.add(pRoot);
		int now = 1, next = 0;
		while (!q.isEmpty()) {
			TreeNode t = q.remove();
			now--;
			tmp.add(t.val);
			if (t.left != null) {
				q.add(t.left);
				next++;
			}
			if (t.right != null) {
				q.add(t.right);
				next++;
			}
			if (now == 0) {
				res.add(new ArrayList<Integer>(tmp));
				tmp.clear();
				now = next;
				next = 0;
			}
		}
		return res;
	}
}
