/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // ListNode temp=head;
        // while(temp!=null && temp.next!=null){
        //     if(temp.val==temp.next.val){
        //         temp.next=temp.next.next;
        //     }
        //     temp=temp.next;
        // }
        // return head;
        if(head==null){
            return head;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        while(prev.next!=null){
            if(prev.val==curr.val){
                prev.next=curr.next;
                curr=curr.next;
            }
            else{
                prev=prev.next;
                curr=curr.next;
            }
        }
        return head;
        
    }
}