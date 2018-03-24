//package li.jesse.leetcode;
//
///*
//104. Maximum Depth of Binary Tree
//Easy
//
//Given a binary tree, find its maximum depth.
//The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
// */
//
//import li.jesse.datastructure.tree.Node;
//
//import java.util.LinkedList;
//
//public class MaximumDepthOfBinaryTree
//{
//    public static int maxDepth(Node root)
//    {
//        if(root == null)
//            return 0;
//        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
//    }
//
//
//    public static int maxDepth2(Node root)
//    {
//        if(root == null)
//            return 0;
//        int level = 0;
//        LinkedList<Node> queue = new LinkedList<Node>();
//        queue.add(root);
//        int curNum = 1; //num of nodes left in current level
//        int nextNum = 0; //num of nodes in next level
//        while(!queue.isEmpty())
//        {
//            Node n = queue.poll();
//            curNum--;
//            if(n.left!=null)
//            {
//                queue.add(n.left);
//                nextNum++;
//            }
//            if(n.right!=null)
//            {
//                queue.add(n.right);
//                nextNum++;
//            }
//            if(curNum == 0)
//            {
//                curNum = nextNum;
//                nextNum = 0;
//                level++;
//            }
//        }
//        return level;
//    }
//}
