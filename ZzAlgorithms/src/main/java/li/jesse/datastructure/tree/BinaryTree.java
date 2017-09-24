package li.jesse.datastructure.tree;

import java.util.Stack;

public class BinaryTree
{
    public BinaryNode root = null;

    // ----- ----- Constructors ----- -----

    public BinaryTree()
    {
        root = new BinaryNode(1, "root: A");
    }

    public BinaryTree(String data)
    {
        root = new BinaryNode(1, data);
    }

    // ----- ----- Height ----- -----

    public int height()
    {
        return height(root);
    }

    private int height(BinaryNode subTree)
    {
        if(subTree==null)
            return 0;
        else
        {
            int i = height(subTree.leftChild);
            int j = height(subTree.rightChild);

            return (i < j) ? (j + 1) : (i + 1);
        }
    }

    // ----- ----- Size ----- -----

    public int size()
    {
        return size(root);
    }

    private int size(BinaryNode subTree)
    {
        if(subTree == null)
            return 0;
        else
            return size(subTree.leftChild) + size(subTree.rightChild) + 1;
    }

    // ----- ----- Parent ----- -----

    public BinaryNode parent(BinaryNode element)
    {
        return (root == null || root==element) ? null : parent(root, element);
    }

    public BinaryNode parent(BinaryNode subTree,BinaryNode element)
    {
        if(subTree==null)
            return null;

        if(subTree.leftChild == element || subTree.rightChild == element)
            return subTree;

        BinaryNode p;

        if((p=parent(subTree.leftChild, element))!=null)
            return p;
        else
            return parent(subTree.rightChild, element);
    }

    // ----- ----- Nodes: root & children ----- -----

    public BinaryNode getLeftChildNode(BinaryNode element)
    {
        return (element!=null)?element.leftChild:null;
    }

    public BinaryNode getRightChildNode(BinaryNode element)
    {
        return (element!=null)?element.rightChild:null;
    }

    public BinaryNode getRoot()
    {
        return root;
    }

    // ----- ----- Actions ----- -----

    public void destroy(BinaryNode subTree)
    {
        if(subTree!=null)
        {
            destroy(subTree.leftChild);
            destroy(subTree.rightChild);
            subTree=null;
        }
    }

    public void visited(BinaryNode subTree)
    {
        subTree.isVisited = true;
        System.out.println("key:"+subTree.key+"--name:"+subTree.data);;
    }

    // ----- ----- Traverses ----- -----

    public void preOrder(BinaryNode subTree)
    {
        if(subTree != null)
        {
            visited(subTree);
            preOrder(subTree.leftChild);
            preOrder(subTree.rightChild);
        }
    }

    public void inOrder(BinaryNode subTree)
    {
        if(subTree != null)
        {
            inOrder(subTree.leftChild);
            visited(subTree);
            inOrder(subTree.rightChild);
        }
    }

    public void postOrder(BinaryNode subTree)
    {
        if (subTree != null)
        {
            postOrder(subTree.leftChild);
            postOrder(subTree.rightChild);
            visited(subTree);
        }
    }

}




