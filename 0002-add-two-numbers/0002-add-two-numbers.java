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
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        int carry = 0;

        while (a != null || b != null || carry != 0) {
            int sum = carry;

            if (a != null) {
                sum += a.val;
                a = a.next;
            }

            if (b != null) {
                sum += b.val;
                b = b.next;
            }

            carry = sum / 10;
            node.next = new ListNode(sum % 10);
            node = node.next;
        }

        return head.next;
    }
}