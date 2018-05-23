package li.jesse.leetcode;

import li.jesse.data.TreeNode;
import org.junit.Test;

public class MinimumDepthOfBinaryTreeTest {

    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);

    {
        node1.left = node2;
        node2.left = node4;
        node2.right = node5;
        node1.right = node3;
    }

    @Test
    public void testMinimumDepthOfBinaryTree() {
        System.out.println(MinimumDepthOfBinaryTree.minDepth(node1));
    }

}
