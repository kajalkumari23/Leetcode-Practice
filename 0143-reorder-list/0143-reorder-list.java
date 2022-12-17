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
    public static ListNode middle (ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next !=null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode mid = middle(head);
        ListNode nh = mid.next;
        mid.next = null;
        ListNode r = reverse(nh);
        ListNode l = head;
        while(r!=null){
            //backup
            ListNode ln=l.next;
            ListNode rn = r.next;
            //connection
            l.next = r;
            r.next = ln;
            //move
            l=ln;
            r=rn;
        }
    }
}