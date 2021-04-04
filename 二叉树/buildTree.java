/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        List<Integer> preorderList = intArrayToList(preorder);
        List<Integer> inorderList = intArrayToList(inorder);
        return buildTreeInternal(preorderList,inorderList);
    }

    //数组 转 顺序表（顺序表中可以用的方法更多）
    public List<Integer> intArrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int e : array) {
            list.add(e);
        }
        return list;
    }

    public TreeNode buildTreeInternal(List<Integer> preorderList,List<Integer> inorderList) {
        //空树
        if (preorderList.isEmpty()) {
            return null;
        }
        //树中只有一个结点
        int rootVal = preorderList.get(0);
        TreeNode root = new TreeNode(rootVal);
        if (preorderList.size() == 1) {
            return root;
        }
        //获取左子树的长度
        int leftSize = inorderList.indexOf(rootVal);
        //切割：
        //左子树的前序 + 右子树的前序
        List<Integer> leftPre = preorderList.subList(1,1 + leftSize);
        List<Integer> rightPre = preorderList.subList(1 + leftSize,preorderList.size());
        //左子树的中序 + 右子树的中序
        List<Integer> leftIn = inorderList.subList(0,leftSize);
        List<Integer> rightIn = inorderList.subList(leftSize + 1,inorderList.size());

        //分别构造左右子树
        root.left = buildTreeInternal(leftPre,leftIn);
        root.right = buildTreeInternal(rightPre,rightIn);

        return root;
    }
}

