package leetcode.one;

public class JumpGameII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int jump(int[] nums) {
		int ret = 0;// ��ǰ����
		int last = 0;// ��һ���ɴ���Զ����
		int curr = 0;// ��ǰһ���ɴ���Զ��
		for (int i = 0; i < nums.length; ++i) {
			// �޷���ǰ����ֱ�ӷ���
			if (i > curr) {
				return -1;
			}
			// ��Ҫ�����´���Ծ�������last�͵�ִ�е�����ret
			if (i > last) {
				last = curr;
				++ret;
			}
			// ��¼��ǰ�ɴ����Զ��
			curr = Math.max(curr, i + nums[i]);
		}
		return ret;
	}
}
