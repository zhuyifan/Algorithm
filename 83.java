/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode a = head;
        while(a.next!=null){
            if(a.val==a.next.val){
                a.next=a.next.next;
            }
            else a=a.next;
        }
        return head;
    }
}