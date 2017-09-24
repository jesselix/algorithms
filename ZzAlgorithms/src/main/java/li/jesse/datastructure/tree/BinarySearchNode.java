package li.jesse.datastructure.tree;

public class BinarySearchNode<T extends Comparable<T>>
{
    T key;
    BinarySearchNode<T> left;
    BinarySearchNode<T> right;
    BinarySearchNode<T> parent;

    public BinarySearchNode(T key, BinarySearchNode<T> parent, BinarySearchNode<T> left, BinarySearchNode<T> right) {
        this.key = key;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }
}
