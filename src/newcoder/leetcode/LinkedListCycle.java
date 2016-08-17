package newcoder.leetcode;

import leetcode.listnode.ListNode;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��17��
 */
public class LinkedListCycle{
	public boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow)
				return true;
		}
		return false;
	}
}
