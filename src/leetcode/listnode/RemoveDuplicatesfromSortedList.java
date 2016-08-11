package leetcode.listnode;

/** 
 * 类描述
 * 
 * @author luoshuoyan 
 * @date 2016年6月16日
 */
public class RemoveDuplicatesfromSortedList{
	public ListNode deleteDuplicates(ListNode head) {
		ListNode cur = head;
		if (head == null || head.next == null) {
			return head;
		}
		while (cur.next != null) {
			if (cur.next.val == cur.val) {
				cur.next = cur.next.next;
				continue;
			}
			cur = cur.next;
		}
		return head;
	}
}
