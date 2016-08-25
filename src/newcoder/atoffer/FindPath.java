package newcoder.atoffer;

import java.util.ArrayList;

import leetcode.TreeNode.TreeNode;

/**
 * 类描述:输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * 
 * @author luoshuoyan
 * @date 2016年8月25日
 */
public class FindPath{
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return arr;
		pa(root, target, arr, new ArrayList<Integer>(), 0);
		return arr;
	}

	public void pa(TreeNode root, int target,
			ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> a1, int sum) {
		if (root == null)
			return;
		sum += root.val;
		if (sum > target) {
			return;
		}
		if (root.left == null && root.right == null) {
			if (sum == target) {
				a1.add(root.val);
				arr.add(new ArrayList<Integer>(a1));
				a1.remove(a1.size() - 1);
			}
			return;
		}
		a1.add(root.val);
		pa(root.left, target, arr, a1, sum);
		pa(root.right, target, arr, a1, sum);
		a1.remove(a1.size() - 1);
	}
}
