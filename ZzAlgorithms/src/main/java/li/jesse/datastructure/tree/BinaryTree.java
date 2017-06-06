package li.jesse.datastructure.tree;

public class BinaryTree
{
    private TreeNode root;

    public BinaryTree()
    {

    }

    public BinaryTree(TreeNode root)
    {
        this.root = root;
    }

    /**
     * find the node
     * @param key
     * @return
     */
    public TreeNode find(int key)
    {
        if (this.root != null)
        {
            TreeNode currentNode = this.root;
            while (currentNode.key != key)
            {
                if (key > currentNode.key)
                {
                    currentNode = currentNode.rightChild;
                }
                else
                {
                    currentNode = currentNode.leftChild;
                }

                if (currentNode == null)
                {
                    return null;
                }
            }
        }
        return null;
    }

    /**
     * insert the node
     * @param key
     * @param value
     */
    public void insert(int key, Object value)
    {
        TreeNode node = new TreeNode(key, value);

        if (this.root == null)
        {
            this.root = node;
        }
        else
        {
            TreeNode currentNode = this.root;

            while (true)
            {
                if (key > currentNode.key) {
                    if (currentNode.rightChild == null) {
                        currentNode.rightChild = node;
                        return;
                    } else {
                        currentNode = currentNode.rightChild;
                    }
                } else {
                    if (currentNode.leftChild == null) {
                        currentNode.leftChild = node;
                        return;
                    } else {
                        currentNode = currentNode.leftChild;
                    }
                }
            }
        }
    }

    public void show()
    {
        this.show(root);
    }

    private void show(TreeNode node)
    {
        if (node != null)
        {
            this.show(node.leftChild);
            System.out.println(node.key + ":" + node.value);
            this.show(node.rightChild);
        }
    }
}




