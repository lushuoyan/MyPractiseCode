package leetcode.undirectedgraph;

import java.util.ArrayList;
import java.util.List;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��6��29��
 */
public class UndirectedGraphNode{
	int label;
	List<UndirectedGraphNode> neighbors;
	UndirectedGraphNode(int x) {
		label = x;
		neighbors = new ArrayList<UndirectedGraphNode>();
	}
}
