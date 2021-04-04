/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void preOrder(StringBuilder sb,TreeNode node) {
        if (node != null) {
            sb.append(node.val);
            //只有一个结点
            if (node.left == null && node.right == null) {
                return;
            } else if (node.left != null && node.right == null) {
                //只有左子树，只处理左子树
                sb.append("(");
                preOrder(sb,node.left);
                sb.append(")");
            } else {
                //处理左子树
                sb.append("(");
                preOrder(sb,node.left);
                sb.append(")");
                //处理右子树
                sb.append("(");
                preOrder(sb,node.right);
                sb.append(")");
            }    
        }
    }

    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        preOrder(sb,t);
        return sb.toString();
    }
}