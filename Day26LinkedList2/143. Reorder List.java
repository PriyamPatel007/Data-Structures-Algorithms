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
    public void reorderList(ListNode head) {
        if((head==null) || (head.next==null)){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while((fast.next!=null) && (fast.next.next!=null)){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow.next;
        slow.next=null;
        ListNode prev=null;
        while(curr!=null){
            ListNode curr1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=curr1;
        }
        ListNode left=head;
        ListNode right=prev;
        while(right!=null){
            ListNode left1=left.next;
            ListNode right1=right.next;
            left.next=right;
            right.next=left1;
            left=left1;
            right=right1;
        }
    }
}
