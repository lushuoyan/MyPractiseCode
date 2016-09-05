package newcoder.atoffer;

import leetcode.TreeNode.TreeNode;

/*
 * ����һ�Ŷ��������������ҳ����еĵ�kС�Ľ�㡣
 * ���磬 5 / \ 3 7 /\ /\ 2 4 6 8 �У��������ֵ��С˳�����������ֵΪ4��
 */
public class KthNode {
	TreeNode kthNode(TreeNode pRoot, int k) {
		if (pRoot == null || k <= 0) {
			return null;
		}
		TreeNode[] result = new TreeNode[1];
		kthNode(pRoot, k, new int[1], result);
		return result[0];
	}

	void kthNode(TreeNode pRoot, int k, int[] count, TreeNode[] result) {
		if (result[0] != null || pRoot == null) {
			return;
		}
		kthNode(pRoot.left, k, count, result);
		count[0]++;
		if (count[0] == k) {
			result[0] = pRoot;
		}
		kthNode(pRoot.right, k, count, result);
	}
}
