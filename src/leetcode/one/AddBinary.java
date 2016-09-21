package leetcode.one;

public class AddBinary {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		String a = "11";
		String b = "101";

		if (a == null || "".equals(a)) {
			// return l2;
		}
		if (b == null || "".equals(b)) {
			// return l1;
		}
		ListNode l1 = null;
		l1 = new ListNode(Integer.parseInt(a.substring(a.length() - 1,
				a.length())));
		a = a.substring(0, a.length() - 1);
		ListNode l1Index = l1;
		while (!"".equals(a)) {
			int temp = Integer
					.parseInt(a.substring(a.length() - 1, a.length()));
			a = a.substring(0, a.length() - 1);
			l1Index.next = new ListNode(temp);
			l1Index = l1Index.next;
		}
		ListNode l2 = null;
		l2 = new ListNode(Integer.parseInt(b.substring(b.length() - 1,
				b.length())));
		b = b.substring(0, b.length() - 1);
		ListNode l2Index = l2;
		while (!"".equals(b)) {
			int temp = Integer.parseInt(b.substring(b.length() - 1,
					b.length() - 0));
			b = b.substring(0, b.length() - 1);
			l2Index.next = new ListNode(temp);
			l2Index = l2Index.next;
		}
		ListNode resultRoot = new ListNode((l1.val + l2.val) % 2);

		ListNode resultTemp = resultRoot;
		boolean carry = false;
		if ((l1.val + l2.val) - 1 > 0) {
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
			if (nextValue > 1) {
				carry = true;
			} else {
				carry = false;
			}
			resultTemp.next = new ListNode(nextValue % 2);
			resultTemp = resultTemp.next;
		}
		if (resultTemp.next != null) {
			while (carry && resultTemp.next != null) {
				carry = false;
				resultTemp = resultTemp.next;
				resultTemp.val += 1;
				if (resultTemp.val > 1) {
					resultTemp.val %= 2;
					carry = true;
				}
				if (resultTemp.next == null) {
					break;
				}
			}
		}
		if (carry) {
			resultTemp.next = new ListNode(1);
		}
		StringBuffer result = new StringBuffer();
		while (resultRoot != null) {
			result.append(resultRoot.val);
			resultRoot = resultRoot.next;
		}
		System.out.println(result.reverse().toString());
	}

}
