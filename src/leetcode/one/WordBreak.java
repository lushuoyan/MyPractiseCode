package leetcode.one;

import java.util.Set;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��7��1��
 */
public class WordBreak{
	/*
	 * ������ һ��ʼ���������Ŀ���ҵĵ�һ��Ӧ��Ҫ�ݹ飬����֮��о��ݹ����������û�취ͨ����Ȼ��Ϳ�ʼ�룬֮�󿴵����˵�˼·֮�󣬸о���ʵ��ͦ���׵ġ�
	 * ����˼·�� һ���ַ���S�����ĳ���ΪN�����S�ܹ������ֵ伯�ϡ���dict���еĵ���ƴ�Ӷ��ɣ���ô��Ҫ���������Ϊ�� F(0, N) = F(0,
	 * i) && F(i, j) && F(j, N);
	 * �����ӣ����������֪��ĳ���Ӵ��Ƿ����Dict�еļ�������ƴ�Ӷ��ɾͿ����������ķ�ʽ�õ��������������ΪTrue,
	 * ����������ΪFalse�����뵽һ��boolean����Ķ�Ӧλ���ϣ������ӣ����boolean��������һλ����F(0,
	 * N)��ֵ��ΪTrue��ʾ����ַ���S����Dict�еĵ���ƴ�ӣ������У� ������˵����AC���룡��
	 */
	public static boolean wordBreak(String s, Set<String> dict) {
		boolean[] t = new boolean[s.length() + 1];
		t[0] = true;
		for (int i = 0; i < s.length(); i++) {
			if (!t[i])
				continue;
			for (String a : dict) {
				int len = a.length();
				int end = i + len;
				if (end > s.length()) {
					continue;
				}
				if (t[end]) {
					continue;
				}
				if (s.substring(i, end).equals(a)) {
					t[end] = true;
				}
			}
		}
		return t[s.length()];
	}
}
