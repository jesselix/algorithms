package li.jesse.datastructure.tree;

import java.util.LinkedList;

public class BinaryTree
{
    private Node<Integer> root;

    private int size;

    public BinaryTree()
    {
        root = new Node<Integer>();
    }

    public BinaryTree(int[] values) {
        System.out.print("新建binaryTree:");
        for (int i : values) {
            System.out.print(i);
        }
        System.out.println();
        boolean isLeft = true;
        int len = values.length;
        if (len == 0)
            return ;

        LinkedList<Node<Integer>> queue = new LinkedList<Node<Integer>>();
        root = new Node<Integer>(values[0]);
        queue.addLast(root);
        Node parent = null;
        Node current = null;
        for (int i=1; i<len; i++) {
            current = new Node<Integer>(values[i]);
            queue.addLast(current);
            if (isLeft)
                parent = queue.getFirst();
            else
                parent = queue.removeFirst();
            if (isLeft) {
                parent.setLeftChild(current);
                isLeft = false;
            }else {
                parent.setRightChild(current);
                isLeft = true;
            }
        }
    }

    public void inorder() {
        System.out.print("binaryTree递归中序遍历:");
        inorderTraverseRecursion(root);
        System.out.println();
    }

    private void inorderTraverseRecursion(Node<Integer> node) {
        // TODO Auto-generated method stub
        if (node.getLeftChild() != null)
            inorderTraverseRecursion(node.getLeftChild());
        System.out.print(node.getValue());
        if (node.getRightChild() != null)
            inorderTraverseRecursion(node.getRightChild());
    }
}




