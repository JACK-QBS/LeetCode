package Tree;

import java.util.ArrayList;
import java.util.List;


public class Solution {

    //前序遍历二叉树，将结点放入链表中返回
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            //将根值放入链表中
            list.add(root.v);

            //遍历左子树
            List<Integer> leftSubTreeList = preorderTraversal(root.left);
            list.addAll(leftSubTreeList);

            //遍历右子树
            List<Integer> rightSubTreeList = preorderTraversal(root.right);
            list.addAll(rightSubTreeList);
        }
        return list;
    }

    //中序遍历二叉树，将结点放入链表中返回
    public List<Integer> indexTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            //遍历左子树
            List<Integer> leftSubTreeList = preorderTraversal(root.left);
            list.addAll(leftSubTreeList);

            //将根值放入链表中
            list.add(root.v);

            //遍历右子树
            List<Integer> rightSubTreeList = preorderTraversal(root.right);
            list.addAll(rightSubTreeList);
        }
        return list;
    }

    //后序遍历二叉树，将结点放入链表中返回
    public List<Integer> lastTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            //遍历左子树
            List<Integer> leftSubTreeList = preorderTraversal(root.left);
            list.addAll(leftSubTreeList);

            //遍历右子树
            List<Integer> rightSubTreeList = preorderTraversal(root.right);
            list.addAll(rightSubTreeList);

            //将根值放入链表中
            list.add(root.v);

        }
        return list;
    }
}
