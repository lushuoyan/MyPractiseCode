package newcoder.atoffer;

import leetcode.listnode.ListNode;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月24日
 */
public class FindKthToTail{
	public ListNode FindKthToTail(ListNode head, int k) {
		if (head == null) {
			return head;
		}
		ListNode node = head;
		int count = 0;
		while (node != null) {
			count++;
			node = node.next;
		}
		if (count < k){
			return null;
		}
		ListNode p = head;
		for (int i = 0; i < count - k; i++) {
			p = p.next;
		}
		return p;
	}
}
