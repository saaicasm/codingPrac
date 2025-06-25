package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Traversals {
	
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(root, res);
        return res;
    }
    
    public void helper(TreeNode node, List<Integer> res) {
        if (node != null) {
            helper(node.left, res);
            res.add(node.val);
            helper(node.right, res);
        }
    }
        
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
	
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helperPost(root, res);
        return res;
    }
    
    public void helperPost(TreeNode node, List<Integer> res) {
        if (node != null) {
            helperPost(node.left, res);
            helperPost(node.right, res);
            res.add(node.val);
        }
    }
 	
}
