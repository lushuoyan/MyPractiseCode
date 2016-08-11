package leetcode.listnode;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月16日
 */
public class RemoveDuplicatesfromSortedListII{
	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		while (head != null && head.next != null) {
			int first = head.val;
			if (head.next.val != head.val) {
				break;
			}
			while (head != null && head.val == first) {
				head = head.next;
			}
		}
		if (head == null) {
			return head;
		}
		ListNode cur = head;
		while (cur != null && cur.next != null) {
			if (cur.next != null && cur.next.next == null) {
				break;
			}
			if (cur.next.val == cur.next.next.val) {
				int temp  = cur.next.val;
				while (cur.next != null && cur.next.val == temp) {
					cur.next = cur.next.next;
				}
				continue;
			}
			cur = cur.next;
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(2);
		deleteDuplicates(head);
	}
}
