package li.jesse.lintcode;

import li.jesse.data.TreeNode;
import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {

    @Test
    public void testInvertBinaryTree() {
        TreeNode node0 = new TreeNode(999);
        TreeNode node1 = new TreeNode(2);;
        TreeNode node2 = new TreeNode(3);;

        node0.left = node1;
        node0.right = node2;

        TreeNode newNode0 = InvertBinaryTree.invertBinaryTree(node0);

        System.out.println(newNode0);
        System.out.println(newNode0.left.getVal());
        System.out.println(newNode0.right.getVal());
    }
}
