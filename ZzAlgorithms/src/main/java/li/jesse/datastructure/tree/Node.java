package li.jesse.datastructure.tree;

public class Node<V>
{
    private V value;
    private Node<V> leftChild;
    private Node<V> rightChild;

    public Node()
    {

    }

    public Node(V value)
    {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void setLeftChild(Node<V> lNode)
    {
        this.leftChild = lNode;
    }

    public void setRightChild(Node<V> rNode)
    {
        this.rightChild = rNode;
    }

    public Node<V> getLeftChild()
    {
        return leftChild;
    }

    public Node<V> getRightChild()
    {
        return rightChild;
    }

    public void setValue(V value)
    {
        this.value = value;
    }

    public V getValue()
    {
        return value;
    }
}




