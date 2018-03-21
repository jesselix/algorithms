package li.jesse.datastructure.tree.binarysearchtree;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {

    private class Node {
        private Key key;
        private Value value;
        private Node left, right;
        private int size;

    // --
    }

    private Node root;

    public BinarySearchTree() {
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        } else {
            return node.size;
        }
    }

//    public boolean contains(Key key) {
//
//    }

    private void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.key);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void preOrder() {
        preOrder(root);
    }

//    private Node search(Node node, Key key) {
//
//    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node node, Key key) {
        if (key == null) {
            throw new IllegalArgumentException("calls get() with a null key");
        }
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            return get(node.left, key);
        } else if (cmp > 0) {
            return get(node.right, key);
        } else {
            return node.value;
        }
    }
}
