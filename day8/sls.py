from typing import Optional

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root:
            return None
        
        # Swap the left and right children
        tmp = root.left
        root.left = root.right
        root.right = tmp

        # Recursively invert the subtrees
        self.invertTree(root.left)
        self.invertTree(root.right)

        return root

# Helper function to insert nodes in a binary tree (for testing)
def insert_level_order(arr, root, i, n):
    if i < n:
        temp = TreeNode(arr[i])
        root = temp

        # Insert left child
        root.left = insert_level_order(arr, root.left, 2 * i + 1, n)

        # Insert right child
        root.right = insert_level_order(arr, root.right, 2 * i + 2, n)

    return root

# Helper function to print in-order traversal of the tree
def inorder_traversal(root):
    if root:
        inorder_traversal(root.left)
        print(root.val, end=" ")
        inorder_traversal(root.right)

# Helper function to print level order traversal of the tree
def level_order_traversal(root):
    if not root:
        return

    queue = [root]
    while queue:
        node = queue.pop(0)
        print(node.val, end=" ")

        if node.left:
            queue.append(node.left)
        if node.right:
            queue.append(node.right)

# Driver code
if __name__ == "__main__":
    # Sample array representing a binary tree in level order
    arr = [1, 2, 3, 4, 5, 6, 7]
    n = len(arr)
    
    # Construct the binary tree from the array
    root = None
    root = insert_level_order(arr, root, 0, n)

    # Print the tree before inversion
    print("Level order traversal before inversion:")
    level_order_traversal(root)
    print("\nIn-order traversal before inversion:")
    inorder_traversal(root)
    
    # Invert the binary tree
    solution = Solution()
    root = solution.invertTree(root)
    
    # Print the tree after inversion
    print("\n\nLevel order traversal after inversion:")
    level_order_traversal(root)
    print("\nIn-order traversal after inversion:")
    inorder_traversal(root)
