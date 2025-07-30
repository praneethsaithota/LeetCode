/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ans=null;
        ListNode t1=headA;
        ListNode t2=headB;
        while(t1!=null){
            t1.val=-(t1.val);
            t1=t1.next;
        }
        while(t2!=null){
            if(t2.val>0){
                t2=t2.next;
            }
            else{
                t2.val=-(t2.val);
                ans= t2;
                t2.val=-(t2.val);
                break;
            }

        }
        t1=headA;
        while(t1!=null){
            t1.val=-(t1.val);
            t1=t1.next;
           }
        return ans;

        
    }
}