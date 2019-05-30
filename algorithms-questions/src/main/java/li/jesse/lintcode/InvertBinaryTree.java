package li.jesse.lintcode;


import li.jesse.data.TreeNode;

/**
 * https://www.lintcode.com/problem/invert-binary-tree/description
 */
public class InvertBinaryTree {

    public static TreeNode invertBinaryTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        swap(root);
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);

        return root;
    }

    public static void swap(TreeNode root)
    {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
