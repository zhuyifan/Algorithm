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
    public int findSecondMinimumValue(TreeNode root) {
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
         recursion(root, pq);
         if(pq.size()==1){
             return -1;
         }
         int i = pq.poll();
         while(pq.peek()==i){
             if(pq.size()==1){
                 return -1;
             }
             i=pq.poll();
         }
        return pq.peek();
    }
    
    public void recursion(TreeNode root, PriorityQueue pq){
        if(root==null){
            return;
        }
        pq.add(root.val);
        recursion(root.left, pq);
        recursion(root.right, pq); 
    } 
}