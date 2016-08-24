package newcoder.atoffer;

import leetcode.listnode.ListNode;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月24日
 */
public class ReverseList{
	public ListNode ReverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode newHead = null;
		ListNode pNode = head;
		ListNode pPrev = null;
		while (pNode != null) {
			ListNode pNext = pNode.next;
			if (pNext == null){
				newHead = pNode;
			}
			pNode.next = pPrev;
			pPrev = pNode;
			pNode = pNext;
		}
		return newHead;
	}
}
