/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int pos=-1;
        if(head==null || head.next==null) return null;
        
        ListNode sp=head;
        ListNode fp=head;
        
        
        while(fp!=null &&fp.next!=null ){
            sp=sp.next;
            fp=fp.next.next;
            if(sp==fp){
            break;
            }
        }
        if(sp==fp){
            ListNode s1=head;
            pos=0;
            while(s1!=sp){
                s1=s1.next;
                sp=sp.next;
                pos++;
            }
            return s1;
            
            
        }
        else{
            return null;
        }
        
        
    }
}