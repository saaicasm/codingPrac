package BinaryTrees;

import java.util.LinkedList;
import java.util.List;

public class PreOrder {
	
	public List<Integer> preOrder (TreeNode root) {
		
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		LinkedList<Integer> output = new LinkedList<Integer>();
		
		stack.add(root);
		
		while(!stack.isEmpty()) {
			TreeNode node = stack.pollLast();
			output.add(node.val);
			
			if (node.right != null) {
				stack.add(node.right);
			}
			if (node.left != null) {
				stack.add(node.left);
			}
			
		}
		
		return output;
	}
 	
}
