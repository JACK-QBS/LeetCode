/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//二叉树的最近公共祖先
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //1、一个是根，另外一个是在树中
        if (root == p || root == q) {
            return root;
        }
        //判断一下p、q是否都在左子树中  
        boolean pInLeft = search(root.left,p);
        boolean qInLeft = search(root.left,q);
        //2、两个都在 左子树 中
        if (pInLeft && qInLeft) {
            return lowestCommonAncestor(root.left,p,q);
        }
        //3、两个都在 右子树 中
        if (!pInLeft && !qInLeft) {
            return lowestCommonAncestor(root.right,p,q);
        }
        //4、一个在左子树中，另外一个在右子树中
        return root;
    }

    public boolean search(TreeNode root,TreeNode t) {
        if (root == null) {
            return false;
        }
        if (root == t) {
            return true;
        }
        if (search(root.left,t)) {
            return true;
        }
        return search(root.right,t);
    }
}