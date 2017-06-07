package li.jesse.datastructure.tree;


public class BinaryTree
{
    private Node parent;
    private Node currentPoint;
    private StringBuffer sb;
    private int length = 0;

    // class node
    public class Node
    {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value, Node leftChild, Node rightChild)
        {
            this.value = value;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }
    }

    public Node getParent()
    {
        return parent;
    }

    public BinaryTree()
    {
        sb = new StringBuffer();
    }

    public void insert(int value)
    {

    }
}




