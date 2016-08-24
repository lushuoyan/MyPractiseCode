package newcoder.atoffer;

import leetcode.listnode.ListNode;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��24��
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
