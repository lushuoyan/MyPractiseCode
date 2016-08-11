package leetcode.listnode;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年7月5日
 */
public class InsertionSortList{
	public ListNode insertionSortList(ListNode head) {
		if (head == null || head.next == null){
			return head;
		}
		ListNode newHead = new ListNode(-1);
		newHead.next = head;
		ListNode cur = head;
		ListNode post = head.next;
		while (post != null) {
			if (post.val >= cur.val) {
				cur = cur.next;
				post = post.next;
			} else {
				ListNode insertCur = newHead;
				ListNode insertPost = newHead.next;
				while (insertPost.val < post.val) {
					insertCur = insertPost;
					insertPost = insertPost.next;
				}
				cur.next = post.next;
				post.next = insertPost;
				insertCur.next = post;
				post = cur.next;
			}
		}
		return newHead.next;
	}
}
