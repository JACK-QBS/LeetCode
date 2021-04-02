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
 /**
 * 解题思路：
 * 1、p是空树，q是空树 -> 相等
 * 2、p是空树，q不是空树
 *    p不是空树，q是空树 -> 不想等
 * 3、
 * 条件1：两颗树根的值相等
 * 条件2：p的左子树 和 q的左子树相等
 * 条件3：p的右子树 和 q的右子树相等
 * 条件1 && 条件2 && 条件3
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //1、p是空树，q是空树 -> 相等
        if (p == null && q == null) {
            return true;
        }
        //2、p是空树，q不是空树
        //  p不是空树，q是空树 -> 不想等
        if (p == null || q == null) {
            return false;
        }
        //条件1 && 条件2 && 条件3
        return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}