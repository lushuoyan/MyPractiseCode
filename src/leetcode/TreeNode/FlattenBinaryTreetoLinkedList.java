package leetcode.TreeNode;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��6��20��
 */
public class FlattenBinaryTreetoLinkedList{
	public void flatten(TreeNode root) {
		while (root != null) {
			if (root.left != null) {
				TreeNode pre = root.left;
				while (pre.right != null)
					pre = pre.right;
				pre.right = root.right;
				root.right = root.left;
				root.left = null;
			}
			root = root.right;
		}
	}
}
