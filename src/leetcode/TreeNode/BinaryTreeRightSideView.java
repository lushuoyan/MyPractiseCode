package leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月5日
 */
public class BinaryTreeRightSideView{

	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		if (root == null) {
			return res;
		}
		res.add(root.val);
		if (root.left == null && root.right == null) {
			return res;
		}
		List<TreeNode> layer = new ArrayList<TreeNode>();
		if (root.left != null) {
			layer.add(root.left);
		}
		if (root.right != null) {
			layer.add(root.right);
		}
		while (true) {
			List<TreeNode> nextLayer = new ArrayList<TreeNode>();
			for (int i = 0; i < layer.size() ; i++) {
				TreeNode leaf = layer.get(i);
				if (leaf.left != null) {
					nextLayer.add(leaf.left);
				}
				if (leaf.right != null) {
					nextLayer.add(leaf.right);
				}

			}
			res.add(layer.get(layer.size() - 1).val);
			if (nextLayer.size() == 0) {
				break;
			}
			layer = nextLayer;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
