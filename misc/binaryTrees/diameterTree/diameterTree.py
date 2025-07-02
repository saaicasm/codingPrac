class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.diameter = 0

        def helper(root):
            if root is None:
                return 0
            self.diameter = max(self.diameter, helper(root.left) + helper(root.right))
            return 1 + max(helper(root.left), helper(root.right))
        helper(root)
        return self.diameter