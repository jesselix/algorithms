package li.jesse.leetcode;

import li.jesse.data.TreeNode;

public class MinimumDepthOfBinaryTree {

    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;

        if (root.left == null)
            return minDepth(root.right) + 1;
        else if (root.right == null)
            return minDepth(root.left) + 1;
        else
            return Integer.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

}
