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

// 二叉树的最大深度
class Solution {
    public int maxDepth(TreeNode root) {
        //空树
        if (root == null) {
            return 0;
        } else {
            //计算左子树的高度
            int leftHeight = maxDepth(root.left);
            //计算右子树的高度
            int rightHeight = maxDepth(root.right);
            //比较 左右子树的高度，选出最大值 + 根结点高度1
            return Math.max(leftHeight,rightHeight) + 1;
        }
    }
}