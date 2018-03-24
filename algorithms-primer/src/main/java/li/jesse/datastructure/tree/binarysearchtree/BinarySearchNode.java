package li.jesse.datastructure.tree.binarysearchtree;

public class BinarySearchNode<T extends Comparable<T>>
{
    T key;
    BinarySearchNode<T> left;
    BinarySearchNode<T> right;
    BinarySearchNode<T> parent;
    private int size;

    public BinarySearchNode(T key, BinarySearchNode<T> left, BinarySearchNode<T> right, BinarySearchNode<T> parent, int size) {
        this.key = key;
        this.left = left;
        this.right = right;
        this.parent = parent;
        this.size = size;
    }

    public T getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "BinarySearchNode{" +
                "key=" + key +
                ", left=" + left +
                ", right=" + right +
                ", parent=" + parent +
                ", size=" + size +
                '}';
    }
}
