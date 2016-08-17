package newcoder.leetcode;

import leetcode.listnode.ListNode;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月15日
 */
public class InsertionSortList{
	public ListNode insertionSortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode helper = new ListNode(0);
		ListNode pre = helper;
		ListNode cur = head;
		while (cur != null) {
			ListNode next = cur.next;
			pre = helper;
			while (pre.next != null && pre.next.val < cur.val) {
				pre = pre.next;
			}
			cur.next = pre.next;
			pre.next = cur;
			cur = next;
		}
		return helper.next;
	}
}
