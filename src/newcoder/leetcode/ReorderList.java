package newcoder.leetcode;

import leetcode.listnode.ListNode;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月17日
 */
public class ReorderList{
	public static void reorderList(ListNode head) {
		if (head == null || head.next == null || head.next.next == null) {
			return;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode pre = slow.next;
		if (pre != null && pre.next != null) {
			ListNode nex = pre.next;
			while (nex != null) {
				pre.next = nex.next;
				nex.next = slow.next;
				slow.next = nex;
				nex = pre.next;
			}
		}
		ListNode p = head;
		ListNode q = slow.next;
		while (q != null && p != null) {
			slow.next = q.next;
			q.next = p.next;
			p.next = q;
			q = slow.next;
			p = p.next.next;
		}
	}

	public static void main(String[] args) {
		ListNode temp1 = new ListNode(1);
		ListNode temp2 = new ListNode(2);
		ListNode temp3 = new ListNode(3);
		ListNode temp4 = new ListNode(4);
		ListNode temp5 = new ListNode(5);
		ListNode temp6 = new ListNode(6);
		temp1.next = temp2;
		temp2.next = temp3;
		// temp3.next = temp4;
		// temp4.next = temp5;
		// temp5.next = temp6;

		reorderList(temp1);
	}
}
