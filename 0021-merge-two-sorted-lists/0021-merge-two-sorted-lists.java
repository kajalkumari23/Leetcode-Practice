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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dhead = new ListNode(-1);
        ListNode dtail = dhead;   //datahead, datatail
        
        ListNode p1 = list1;
        ListNode p2 = list2;
        
        while(p1!=null && p2!=null){
            if(p1.val<p2.val){
                dtail.next = p1;
                p1 = p1.next;
            }
            else{
                dtail.next = p2;
                p2 = p2.next;
            }
            dtail = dtail.next;
        }
        if(p1!=null){
            dtail.next = p1;
        }
        if(p2!=null){
            dtail.next = p2;
        }
        return dhead.next;
    }
}