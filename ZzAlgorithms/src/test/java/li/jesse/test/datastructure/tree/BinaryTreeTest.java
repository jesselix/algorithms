package li.jesse.test.datastructure.tree;

import li.jesse.datastructure.tree.BinaryTree;
import li.jesse.datastructure.tree.TreeNode;
import org.junit.Test;

public class BinaryTreeTest
{
    @Test
    public void testCreateTree()
    {
        TreeNode root = new TreeNode(50, 24);
        BinaryTree tree = new BinaryTree(root);
        tree.insert(20, 530);
        tree.insert(540, 520);
        tree.insert(4, 540);
        tree.insert(0, 550);
        tree.insert(8, 520);
        tree.show();
    }

}
