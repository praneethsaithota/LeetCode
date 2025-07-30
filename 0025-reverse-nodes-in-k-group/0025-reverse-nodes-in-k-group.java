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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode x=new ListNode(0),t=head;
        x.next=head;
        if(head==null || k==1) return head;
        int c=0;
        while(t!=null){
            c++;
            t=t.next;
        }
        ListNode pre=x,curr=x,nex=x;
        while(c>=k){
            curr=pre.next;
            nex=curr.next;
            for(int i=1;i<k;i++){
                curr.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=curr.next;
            }
            pre=curr;
            c-=k;
        }
        return x.next;
        
    }
}