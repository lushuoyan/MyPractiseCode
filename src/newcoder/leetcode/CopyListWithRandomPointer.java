package newcoder.leetcode;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��18��
 */
public class CopyListWithRandomPointer{
	class RandomListNode{
		int label;
		RandomListNode next, random;

		RandomListNode(int x) {
			this.label = x;
		}
	};
	//��Ʋ�������
	public RandomListNode copyRandomList(RandomListNode head) {
		return head;
	}

}
