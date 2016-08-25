package newcoder.atoffer;

import component.RandomListNode;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月25日
 */
public class Clone{
	public RandomListNode Clone(RandomListNode pHead) {
		if (pHead == null) {
			return null;
		}
		RandomListNode cur = pHead;
		RandomListNode next = null;
		// copy node and link to every node
		while (cur != null) {
			next = cur.next;
			cur.next = new RandomListNode(cur.label);
			cur.next.next = next;
			cur = next;
		}
		cur = pHead;
		RandomListNode curCopy = null;
		// set copy node rand
		while (cur != null) {
			next = cur.next.next;
			curCopy = cur.next;
			curCopy.random = cur.random != null ? cur.random.next : null;
			cur = next;
		}
		RandomListNode res = pHead.next;
		cur = pHead;
		// split
		while (cur != null) {
			next = cur.next.next;
			curCopy = cur.next;
			cur.next = next;
			curCopy.next = next != null ? next.next : null;
			cur = next;
		}
		return res;
	}
}
