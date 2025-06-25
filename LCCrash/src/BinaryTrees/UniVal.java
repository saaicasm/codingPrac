package BinaryTrees;

public class UniVal {
    
    private int count = 0;
    
    public boolean isUnival(TreeNode node, int parentVal) {
        if (node == null) return true;

        boolean left = isUnival(node.left, node.val);
        boolean right = isUnival(node.right, node.val);

        if (!left || !right) return false;

        count++;
        return node.val == parentVal;
    }

    public int countUnivalSubtrees(TreeNode root) {
        isUnival(root, -1);
        return count;
    }
}
