package li.jesse.test.datastructure.tree;

import li.jesse.datastructure.tree.BinaryTree;
import li.jesse.datastructure.tree.Node;
import org.junit.Test;

public class BinaryTreeTest
{
    @Test
    public void testCreateTree()
    {
        BinaryTree bt = new BinaryTree(new int[]{1,2,3,4,5,6,7,8});
        bt.inorder();
//        bt.preorder();
//        bt.layerorder();
//        bt.preorderNoRecursion();
//        bt.inorderNoRecursion();
//        bt.postorderNoRecursion();
//        System.out.println("深度为：" + bt.getDepth());
    }

}
