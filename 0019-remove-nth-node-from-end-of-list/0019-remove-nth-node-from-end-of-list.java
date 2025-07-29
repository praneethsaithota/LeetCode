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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n<=0){
            return head;
        }
        if(head.next == null) return (n == 1) ? null : head;

        ListNode t=head;
        int c=0;
        while(t!=null){
            c++;
            t=t.next;
        }
        if(n>c) return head;
        c=c-n+1;
        
        t=head;
        
        if(c==1) {
            return head.next;
        }
        for(int i=1;i<c-1;i++){
            t=t.next;
        }
        t.next=t.next.next;
        return head;
        
    }
}