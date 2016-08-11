package leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(root ==null){
			return result;
		}
		List<TreeNode> currentLayer = new ArrayList<TreeNode>();
		currentLayer.add(root);
		while (true) {
			List<TreeNode> temp = new ArrayList<TreeNode>();
			temp.addAll(currentLayer);
			currentLayer.clear();
			List<Integer> currentVal = new ArrayList<Integer>();
			for (int i = 0; i < temp.size(); i++) {
				TreeNode tempNode = temp.get(i);
				currentVal.add(tempNode.val);
				if (tempNode.left != null) {
					currentLayer.add(tempNode.left);
				}
				if (tempNode.right != null) {
					currentLayer.add(tempNode.right);
				}
			}
			result.add(currentVal);
			if(currentLayer.size()==0){
				break;
			}
		}
		return result;
	}
}
