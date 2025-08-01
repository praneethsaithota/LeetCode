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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return head;

        ListNode t=head;
        int c=0;
        while(t.next!=null){
            c++;
            t=t.next;
        }
        c++;
        if(c==k)return head;
        t.next=head;
        k=k%c;

        c=c-k;

        t=head;
        for(int i=1;i<c;i++){
            t=t.next;
        }
        ListNode ans=t.next;
        t.next=null;
        return ans;
    }
}