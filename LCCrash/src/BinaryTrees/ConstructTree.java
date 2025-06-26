package BinaryTrees;

import java.util.HashMap;

public class ConstructTree {
 
	int post_idx;
	int [] preorder;
	int [] postorder;
	int [] inorder;
	
	
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	
	public TreeNode helper(int left_idx, int right_idx) {
		if (left_idx > right_idx) {
			return null;
		}
		
		int root_val = postorder[post_idx];
		
		TreeNode root = new TreeNode(root_val);
		
		int index = hm.get(root_val);
		
		post_idx--;
		
		root.right = helper(index + 1, right_idx);
		root.left = helper(left_idx, index - 1);
		
		return root;
	}
	
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		this.inorder = inorder;
		this.postorder = postorder;
		
		post_idx = postorder.length - 1;
		
		int idx = 0;
		
		for (int val:inorder) hm.put(val, idx++);
		
		return helper(0, inorder.length - 1);
	}
	
}
