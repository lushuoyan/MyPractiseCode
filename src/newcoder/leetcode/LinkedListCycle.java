package newcoder.leetcode;

import leetcode.listnode.ListNode;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月17日
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
