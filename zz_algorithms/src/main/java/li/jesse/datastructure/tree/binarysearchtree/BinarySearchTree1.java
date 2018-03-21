package li.jesse.datastructure.tree.binarysearchtree;

public class BinarySearchTree1<T extends Comparable<T>>
{
    private BinarySearchNode<T> mRoot;

    public BinarySearchTree1() {
        mRoot = null;
    }

    private void preOrder(BinarySearchNode<T> tree) {
        if(tree != null) {
            System.out.print(tree.key + " ");
            preOrder(tree.left);
            preOrder(tree.right);
        }
    }

    public void preOrder() {
        preOrder(mRoot);
    }

    private void inOrder(BinarySearchNode<T> tree) {
        if(tree != null) {
            inOrder(tree.left);
            System.out.print(tree.key + " ");
            inOrder(tree.right);
        }
    }

    public void inOrder() {
        inOrder(mRoot);
    }

    private void postOrder(BinarySearchNode<T> tree) {
        if(tree != null)
        {
            postOrder(tree.left);
            postOrder(tree.right);
            System.out.print(tree.key+" ");
        }
    }

    public void postOrder() {
        postOrder(mRoot);
    }
}
