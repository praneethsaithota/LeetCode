/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 **/
  class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode(0), small = smallHead;
        ListNode largeHead = new ListNode(0), large = largeHead;

        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }

        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;
    }
}
 