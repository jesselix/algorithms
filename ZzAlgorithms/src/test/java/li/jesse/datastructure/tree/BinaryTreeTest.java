package li.jesse.datastructure.tree;

import org.junit.Test;

public class BinaryTreeTest
{
    @Test
    public void testCreateTree()
    {
        BinaryTree bt = new BinaryTree("AAAAA");
        createBinaryTree(bt.root);

        System.out.println("the size of the tree is " + bt.size());
        System.out.println("the height of the tree is " + bt.height());

        System.out.println("*******(前序遍历)[ABDECF]遍历*****************");
        bt.preOrder(bt.root);

        System.out.println("*******(中序遍历)[DBEACF]遍历*****************");
        bt.inOrder(bt.root);

        System.out.println("*******(后序遍历)[DEBFCA]遍历*****************");
        bt.postOrder(bt.root);
    }

    /*
                   A
              B          C
           D     E            F
     */
    public void createBinaryTree(BinaryNode root){
        BinaryNode newNodeB = new BinaryNode(2,"B");
        BinaryNode newNodeC = new BinaryNode(3,"C");
        BinaryNode newNodeD = new BinaryNode(4,"D");
        BinaryNode newNodeE = new BinaryNode(5,"E");
        BinaryNode newNodeF = new BinaryNode(6,"F");

        root.leftChild = newNodeB;
        root.rightChild = newNodeC;
        root.leftChild.leftChild = newNodeD;
        root.leftChild.rightChild = newNodeE;
        root.rightChild.rightChild = newNodeF;
    }



}
