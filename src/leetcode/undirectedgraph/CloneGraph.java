package leetcode.undirectedgraph;

import java.util.HashMap;

/**
 * 类描述 Clone an undirected graph. Each node in the graph contains a label and a
 * list of its neighbors. OJ's undirected graph serialization: Nodes are labeled
 * uniquely. We use # as a separator for each node, and , as a separator for
 * node label and each neighbor of the node. As an example, consider the
 * serialized graph {0,1,2#1,2#2,2}. The graph has a total of three nodes, and
 * therefore contains three parts as separated by #. First node is labeled as 0.
 * Connect node 0 to both nodes 1 and 2. Second node is labeled as 1. Connect
 * node 1 to node 2. Third node is labeled as 2. Connect node 2 to node 2
 * (itself), thus forming a self-cycle. Visually, the graph looks like the
 * following:
 * 
 * @author luoshuoyan
 * @date 2016年6月29日
 */
public class CloneGraph{
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if (node == null) {
			return null;
		}
		HashMap<Integer, UndirectedGraphNode> passed = new HashMap<Integer, UndirectedGraphNode>();
		return clone(node, passed);
	}

	private UndirectedGraphNode clone(UndirectedGraphNode node,
			HashMap<Integer, UndirectedGraphNode> passed) {
		if (passed.containsKey(node.label)) {
			return passed.get(node.label);
		}
		UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
		passed.put(newNode.label, newNode);
		for (UndirectedGraphNode tempNode : node.neighbors) {
			newNode.neighbors.add(clone(tempNode, passed));
		}
		return newNode;
	}
}
