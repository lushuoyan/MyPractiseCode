package leetcode.TreeNode;

import leetcode.listnode.ListNode;

public class ConvertSortedListtoBinarySearchTree {
	static ListNode currentHead = null;

	static TreeNode buildTree(int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = start + (end - start) / 2;
		TreeNode left = buildTree(start, mid - 1);
		TreeNode root = new TreeNode(currentHead.val);
		root.left = left;
		currentHead = currentHead.next;
		root.right = buildTree(mid + 1, end);
		return root;
	}

	public static TreeNode sortedListToBST(ListNode head) {
		if (head == null) {
			return null;
		}
		currentHead = head;
		int len = 0;
		while (head != null) {
			len++;
			head = head.next;
		}

		return buildTree(0, len - 1);
	}
}
