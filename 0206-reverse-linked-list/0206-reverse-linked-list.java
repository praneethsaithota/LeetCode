class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;   
        ListNode current = head; 
        
        while (current != null) {
            ListNode next = current.next; 
            current.next = temp;          
            temp = current;               
            current = next;               
        }
        return temp; 
    }
}
