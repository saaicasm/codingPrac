class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        self.ans = True

        def dfs(root):
            if root is None:
                return 0
            
            if abs(dfs(root.left) - dfs(root.right)) > 1:
                self.ans = False

            return 1 + max(dfs(root.left), dfs(root.right))

        dfs(root)
        return self.ans