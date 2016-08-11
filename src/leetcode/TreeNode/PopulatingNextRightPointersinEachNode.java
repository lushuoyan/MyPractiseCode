package leetcode.TreeNode;

import java.util.ArrayList;

class TreeLinkNode{
	int val;
	TreeLinkNode left, right, next;

	TreeLinkNode(int x) {
		val = x;
	}
}

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月23日
 */
public class PopulatingNextRightPointersinEachNode{
	// 按层遍历
	public static void connect(TreeLinkNode root) {
		if (root == null) {
			return;
		}
		ArrayList<TreeLinkNode> layer = new ArrayList<TreeLinkNode>();
		layer.add(root);
		while (true) {
			if (layer.size() == 0) {
				return;
			}
			ArrayList<TreeLinkNode> nextLayer = new ArrayList<TreeLinkNode>();
			for (int i = 0; i < layer.size() - 1; i++) {
				TreeLinkNode temp = layer.get(i);
				if (temp.left != null) {
					nextLayer.add(temp.left);
				}
				if (temp.right != null) {
					nextLayer.add(temp.right);
				}
				temp.next = layer.get(i + 1);
			}
			TreeLinkNode last = layer.get(layer.size() - 1);
			if (last.left != null) {
				nextLayer.add(last.left);
			}
			if (last.right != null) {
				nextLayer.add(last.right);
			}
			last.next = null;
			layer = nextLayer;
		}
	}
	
	public static void main(String[] args) {
		TreeLinkNode temp = new TreeLinkNode(0);
		connect(temp);
	}
}
