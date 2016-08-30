package newcoder.atoffer;

import leetcode.listnode.ListNode;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月25日
 */
public class FindFirstCommonNode {
	public ListNode FindFirstCommonNode(ListNode head1, ListNode head2) {
		if (head1 == null || head2 == null) {
			return null;
		}
		ListNode loop1 = getLoopNode(head1);
		ListNode loop2 = getLoopNode(head2);
		if (loop1 == null && loop2 == null) {
			return noLoop(head1, head2);
		}
		if (loop1 != null && loop2 != null) {
			return bothLoop(head1, loop1, head2, loop2);
		}
		return null;
	}

	private ListNode getLoopNode(ListNode head) {
		if (head == null || head.next == null || head.next.next == null) {
			return null;
		}
		ListNode n1 = head.next;
		ListNode n2 = head.next.next;
		while (n1 != n2) {
			if (n2.next == null || n2.next.next == null) {
				return null;
			}
			n1 = n1.next;
			n2 = n2.next.next;
		}
		n2 = head;
		while (n1 != n2) {
			n1 = n1.next;
			n2 = n2.next;
		}
		return n1;
	}

	private ListNode noLoop(ListNode head1, ListNode head2) {
		if (head1 == null || head2 == null) {
			return null;
		}
		ListNode ind1 = head1;
		ListNode ind2 = head2;
		int n = 0;
		while (ind1.next != null) {
			n++;
			ind1 = ind1.next;
		}
		while (ind2.next != null) {
			n--;
			ind2 = ind2.next;
		}
		if (ind1 != ind2) {
			return null;
		}
		ind1 = n > 0 ? head1 : head2;
		ind2 = ind1 == head1 ? head2 : head1;
		n = Math.abs(n);
		while (n != 0) {
			n--;
			ind1 = ind1.next;
		}
		while (ind1 != ind2) {
			ind1 = ind1.next;
			ind2 = ind2.next;
		}
		return ind1;
	}

	private ListNode bothLoop(ListNode head1, ListNode loop1, ListNode head2,
			ListNode loop2) {
		ListNode ind1 = null;
		ListNode ind2 = null;
		if (loop1 == loop2) {
			ind1 = head1;
			ind2 = head2;
			int n = 0;
			while (ind1 != loop1) {
				n++;
				ind1 = ind1.next;
			}
			while (ind2 != loop2) {
				n--;
				ind2 = ind2.next;
			}
			ind1 = n > 0 ? head1 : head2;
			ind2 = ind1 == head1 ? head2 : head1;
			while (n != 0) {
				n--;
				ind1 = ind1.next;
			}
			while (ind1 != ind2) {
				ind1 = ind1.next;
				ind2 = ind2.next;
			}
			return ind1;
		} else {
			ind1 = loop1.next;
			while (ind1 != loop2) {
				if (ind1 == loop2) {
					return loop1;
				}
				ind1 = ind1.next;
			}
			return null;
		}
	}
}
