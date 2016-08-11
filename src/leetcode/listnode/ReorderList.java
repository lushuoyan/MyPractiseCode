package leetcode.listnode;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年7月1日
 */
public class ReorderList{
	/*
	 * 分析题目可以得到，需要将链表的后半部分反序，再插入到链表的前半部分
	 */
	public void reorderList(ListNode head) {
		// 链表的长度大于2时才有重新排序的需要
		if (head == null || head.next == null || head.next.next == null) {
			return;
		}
		ListNode fast = head;
		ListNode slow = head;

		// 使用快慢指针，快指针指向结尾的时候，慢指针指向一半
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		ListNode after = slow.next;
		slow.next = null;

		// 将after后的链表就地反序
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
		
		// 插入链表的前半部分
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
