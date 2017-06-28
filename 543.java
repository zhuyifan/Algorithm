/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDeep(root);
        return max;
    }
    
    public int maxDeep(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = maxDeep(root.left);
        int right = maxDeep(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}