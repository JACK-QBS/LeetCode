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
 //平衡二叉树
class Solution {
    public boolean isBalanced(TreeNode root) {
        //空树
        if (root == null) {
            return true;
        }
        //计算左子树高度
        int leftHeight = getHeight(root.left);
        //计算右子树高度
        int rightHeight = getHeight(root.right);
        //计算左右子树高度差值
        int diff = leftHeight - rightHeight;
        if (!(diff == -1 || diff == 0 || diff == 1)) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    //计算二叉树高度
    public int getHeight(TreeNode root) {
        //空树
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return Math.max(leftHeight,rightHeight) + 1;
    }
}