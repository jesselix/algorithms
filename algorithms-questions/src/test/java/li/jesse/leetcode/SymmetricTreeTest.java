package li.jesse.leetcode;

import li.jesse.data.TreeNode;
import org.junit.jupiter.api.Test;

public class SymmetricTreeTest {

    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(2);
    TreeNode node4 = new TreeNode(3);
    TreeNode node5 = new TreeNode(3);

    TreeNode node01 = new TreeNode(1);
    TreeNode node02 = new TreeNode(2);

    {
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.right = node5;

        node01.left = node02;
    }

    @Test
    public void testSymmetricTree() {
        System.out.println(SymmetricTree.isSymmetric(node1));
        System.out.println(SymmetricTree.isSymmetric(node01));
    }
}
