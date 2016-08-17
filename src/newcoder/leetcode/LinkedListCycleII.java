package newcoder.leetcode;

import leetcode.listnode.ListNode;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��17��
 */
public class LinkedListCycleII{
	public ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null)
			return null;
		ListNode temp = head;
		ListNode cur = head.next;
		// �ҵ�������
		while (cur != temp) {
			if (cur.next == null || cur.next.next == null)
				return null;
			temp = temp.next;
			cur = cur.next.next;
		}
		// ��ԭ��������ֳ����� head��curΪһ�� cur.next��curΪһ��
		cur = cur.next;
		temp.next = null;
		// ������������ĳ���
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
		// ������������
		temp = head;
		if (len1 > len2) {
			for (int i = 0; i < len1 - len2; i++)
				temp = temp.next;
		} else if (len2 > len1) {
			for (int i = 0; i < len2 - len1; i++)
				cur = cur.next;
		}
		// �ҵ���һ����ͬ�Ľ��
		while (temp != cur) {
			temp = temp.next;
			cur = cur.next;
		}
		return cur;
	}
}
