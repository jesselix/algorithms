package li.jesse.leetcode;

import li.jesse.data.TreeNode;
import org.junit.Test;

public class SameTreeTest {

    @Test
    public void testSameTree() {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;

        TreeNode node01 = new TreeNode(1);
        TreeNode node02 = new TreeNode(2);
        TreeNode node03 = new TreeNode(3);

        node01.right = node02;
        node01.left = node03;

        System.out.println(SameTree.isSameTree(node1, node01));
    }

}
