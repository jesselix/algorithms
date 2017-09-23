package li.jesse.datastructure.tree;

public class BinaryNode
{
    private int key = 0;
    private String data = null;
    private boolean isVisted = false;
    public BinaryNode leftChild = null;
    public BinaryNode rightChild = null;

    public BinaryNode(){}

    /**
     *
     * @param key   层序编码
     * @param data  数据域
     */
    public BinaryNode(int key,String data)
    {
        this.key = key;
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}
