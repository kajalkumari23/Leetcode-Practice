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
    public ListNode removeNodes(ListNode head) {
        LinkedList<ListNode> list = new LinkedList<>();
        ListNode curNode = head;
        while (curNode != null) {
            while (list.size() != 0 && list.peekLast().val < curNode.val) {
                list.removeLast();
            }

            list.add(curNode);
            curNode = curNode.next;
        }

        head = null; curNode = null;
        for (ListNode node : list) {
            if (head == null) {
                head = node;
                curNode = node;
                continue;
            }

            curNode.next = node;
            curNode = node;
        }

        curNode.next = null;
        return head;
    }
}