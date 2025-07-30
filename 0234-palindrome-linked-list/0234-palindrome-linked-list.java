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
    public boolean isPalindrome(ListNode head) {
        ListNode sp=head,fp=head;
        while(fp.next!=null && fp.next.next!=null){
            sp=sp.next;
            fp=fp.next.next;
        }
        
        sp.next=reverse(sp.next);
        ListNode s1=sp.next;
        while(s1!=null){
            if(s1.val!=head.val){
                return false;
            }
            s1=s1.next;
            head=head.next;
        }
        return true;
        
    }

    public ListNode reverse(ListNode s1){
        ListNode pre=null,curr=s1;
        while(curr!=null){
            ListNode nex=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nex;
        }
        return pre;
    }
}