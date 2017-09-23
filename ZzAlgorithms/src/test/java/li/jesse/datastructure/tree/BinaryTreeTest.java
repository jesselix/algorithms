package li.jesse.datastructure.tree;

import org.junit.Test;

public class BinaryTreeTest
{
    @Test
    public void testCreateTree()
    {
        BinaryTree bt = new BinaryTree("AAA");
        createBinaryTree(bt.root);

        System.out.println("the size of the tree is " + bt.size());
        System.out.println("the height of the tree is " + bt.height());
    }



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
