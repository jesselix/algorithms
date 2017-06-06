package li.jesse.datastructure.tree;

import javax.xml.bind.ValidationEvent;

public class TreeNode
{
    int key;
    Object value;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode()
    {

    }

    public TreeNode(int key, Object value)
    {
        this.key = key;
        this.value = value;
    }
}




