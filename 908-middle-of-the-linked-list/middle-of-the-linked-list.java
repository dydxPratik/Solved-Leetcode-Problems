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
    public ListNode middleNode(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode ptr1 , ptr2;
        ptr1 = ptr2 = head;

        while(ptr2 != null && ptr2.next != null)
        {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }

        return ptr1;

    
    }
}