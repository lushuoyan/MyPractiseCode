package leetcode.one;

public class AddTwoNumbers {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(6);
		ListNode l12 = new ListNode(1);
		l1.next = l12;
		
		ListNode l2 = new ListNode(6);
		ListNode l22 = new ListNode(1);
		l2.next = l22;
		if (l1 == null) {
			// return l2;
		}
		if (l2 == null) {
			// return l1;
		}
		ListNode resultRoot = new ListNode((l1.val + l2.val) % 10);

		ListNode resultTemp = resultRoot;
		boolean carry = false;
		if ((l1.val + l2.val) - 9 > 0) {
			carry = true;
		}
		while (true) {
			l2 = l2.next;
			l1 = l1.next;
			if (l1 == null) {
				resultTemp.next = l2;
				break;
			}
			if (l2 == null) {
				resultTemp.next = l1;
				break;
			}
			int nextValue = 0;
			if (carry) {
				nextValue = l1.val + l2.val + 1;
			} else {
				nextValue = l1.val + l2.val;
			}
			if (nextValue > 9) {
				carry = true;
			}else{
				carry = false;
			}
			resultTemp.next = new ListNode(nextValue % 10);
			resultTemp = resultTemp.next;
		}
		if (resultTemp.next != null) {
			while (carry &&resultTemp.next != null) {
				carry = false;
				resultTemp = resultTemp.next;
				resultTemp.val += 1;
				if (resultTemp.val > 9) {
					resultTemp.val %= 10;
					carry = true;
				}
				if(resultTemp.next==null){
					break;
				}
			}
		}
		if (carry) {
			resultTemp.next = new ListNode(1);
		}
	}
}