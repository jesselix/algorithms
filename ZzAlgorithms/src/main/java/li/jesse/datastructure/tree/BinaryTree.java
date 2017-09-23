package li.jesse.datastructure.tree;

public class BinaryTree
{
    public BinaryNode root = null;

    public BinaryTree()
    {
        root = new BinaryNode(1, "root: A");
    }

    public BinaryTree(String data)
    {
        root = new BinaryNode(1, data);
    }

    public int height(){
        return height(root);
    }

    private int height(BinaryNode subTree)
    {
        if(subTree==null)
            return 0;
        else
        {
            int i=height(subTree.leftChild);
            int j=height(subTree.rightChild);

            return (i<j)?(j+1):(i+1);
        }
    }

    public int size(){
        return size(root);
    }

    private int size(BinaryNode subTree){
        if(subTree==null){
            return 0;
        }else{
            return 1+size(subTree.leftChild)
                    +size(subTree.rightChild);
        }
    }
}




