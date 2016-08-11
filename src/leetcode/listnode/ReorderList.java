package leetcode.listnode;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��7��1��
 */
public class ReorderList{
	/*
	 * ������Ŀ���Եõ�����Ҫ������ĺ�벿�ַ����ٲ��뵽�����ǰ�벿��
	 */
	public void reorderList(ListNode head) {
		// ����ĳ��ȴ���2ʱ���������������Ҫ
		if (head == null || head.next == null || head.next.next == null) {
			return;
		}
		ListNode fast = head;
		ListNode slow = head;

		// ʹ�ÿ���ָ�룬��ָ��ָ���β��ʱ����ָ��ָ��һ��
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		ListNode after = slow.next;
		slow.next = null;

		// ��after�������͵ط���
		if (after.next != null) {
			ListNode afterNext = after.next;
			after.next = null;
			while (afterNext != null) {
				ListNode temp = afterNext.next;
				afterNext.next = after;
				after = afterNext;
				afterNext = temp;
			}
		}
		
		// ���������ǰ�벿��
		ListNode index = head;
		while (index != null && after != null) {
			ListNode temp = index.next;
			ListNode temp2 = after.next;
			index.next = after;
			after.next = temp;
			index = temp;
			after = temp2;
		}

	}
}
