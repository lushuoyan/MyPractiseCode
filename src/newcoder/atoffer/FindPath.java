package newcoder.atoffer;

import java.util.ArrayList;

import leetcode.TreeNode.TreeNode;

/**
 * ������:����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 * 
 * @author luoshuoyan
 * @date 2016��8��25��
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
