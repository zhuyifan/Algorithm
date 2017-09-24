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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null){
            return false;
        }
        if(same(s,t)){
            return true;
        }
        return isSubtree(s.left, t)||isSubtree(s.right, t);
    }
    
    public boolean same(TreeNode s, TreeNode t){
        if(s==null&&t==null){
            return true;
        }
        else if(s==null||t==null){
            return false;
        }
        else if(s.val!=t.val){
            return false;
        }
        else return same(s.left, t.left)&&same(s.right, t.right);
    }
}