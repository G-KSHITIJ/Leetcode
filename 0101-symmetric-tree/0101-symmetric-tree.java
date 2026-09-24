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
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isMirror(root.left, root.right);
    }
    public boolean isMirror(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null) return true;
        
        // Base case 2: one node is null and the other is not (asymmetric)
        if(t1 == null || t2 == null) return false;

        // Base case 3: the values do not match (asymmetric)
        if(t1.val != t2.val) return false;

        // Recursively compare:
        // 1. Left child of t1 with Right child of t2
        // 2. Right child of t1 with Left child of t2
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}
















