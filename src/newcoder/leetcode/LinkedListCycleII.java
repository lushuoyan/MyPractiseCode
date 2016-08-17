package newcoder.leetcode;

import leetcode.listnode.ListNode;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月17日
 */
public class LinkedListCycleII{
	public ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null)
			return null;
		ListNode temp = head;
		ListNode cur = head.next;
		// 找到相遇点
		while (cur != temp) {
			if (cur.next == null || cur.next.next == null)
				return null;
			temp = temp.next;
			cur = cur.next.next;
		}
		// 将原来的链表分成两段 head到cur为一条 cur.next到cur为一条
		cur = cur.next;
		temp.next = null;
		// 计算两个链表的长度
		int len1 = 0;
		int len2 = 0;
		temp = head;
		while (temp != null) {
			len1++;
			temp = temp.next;
		}
		temp = cur;
		while (temp != null) {
			len2++;
			temp = temp.next;
		}
		// 对齐两个链表
		temp = head;
		if (len1 > len2) {
			for (int i = 0; i < len1 - len2; i++)
				temp = temp.next;
		} else if (len2 > len1) {
			for (int i = 0; i < len2 - len1; i++)
				cur = cur.next;
		}
		// 找到第一个相同的结点
		while (temp != cur) {
			temp = temp.next;
			cur = cur.next;
		}
		return cur;
	}
}
