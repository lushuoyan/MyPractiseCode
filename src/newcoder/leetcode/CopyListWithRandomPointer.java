package newcoder.leetcode;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月18日
 */
public class CopyListWithRandomPointer{
	class RandomListNode{
		int label;
		RandomListNode next, random;

		RandomListNode(int x) {
			this.label = x;
		}
	};
	//深复制不好做。
	public RandomListNode copyRandomList(RandomListNode head) {
		return head;
	}

}
