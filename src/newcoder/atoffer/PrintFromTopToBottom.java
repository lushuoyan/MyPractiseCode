package newcoder.atoffer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

import leetcode.TreeNode.TreeNode;

/**
 * ������
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * @author luoshuoyan
 * @date 2016��8��25��
 */
public class PrintFromTopToBottom{
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (root == null)
			return list;
		Deque<TreeNode> deque = new LinkedList<TreeNode>();

		deque.add(root);
		while (!deque.isEmpty()) {
			TreeNode t = deque.pop();
			list.add(t.val);
			if (t.left != null)
				deque.add(t.left);
			if (t.right != null)
				deque.add(t.right);
		}
		return list;
	}
}
