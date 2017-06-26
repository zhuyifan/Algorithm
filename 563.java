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
    public int findTilt(TreeNode root) {
        if(root==null){
            return 0;
        }
        return findTilt(root.left)+findTilt(root.right)+Math.abs(findWeight(root.left)-findWeight(root.right));
    }
    
    public int findWeight(TreeNode root){
        if(root==null){
            return 0;
        }
        return findWeight(root.left)+findWeight(root.right)+root.val;
    }
}