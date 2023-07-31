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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        int pow = 0;
        int sum = 0;

        ListNode resHead = new ListNode();
        resHead.next = null;
        ListNode temp = resHead;

        while(l1 != null && l2 != null)
        {
            sum = 0; 
            int n1 = l1.val;
            int n2 = l2.val;

            sum = n1+n2+pow;

            ListNode newnode = new ListNode(sum%10);
            temp.next = newnode;
            temp = temp.next;
            newnode.next= null;

            pow = sum/10;

            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null)
        {
            sum = l1.val + pow;
            
            ListNode newnode = new ListNode(sum%10);
            temp.next = newnode;
            temp = temp.next;
            newnode.next= null;

            pow = sum/10;

            l1 = l1.next;
        }
        while(l2 != null)
        {
            sum = l2.val + pow;
            
            ListNode newnode = new ListNode(sum%10);
            temp.next = newnode;
            temp = temp.next;
            newnode.next= null;

            pow = sum/10;

            l2 = l2.next;
        }


        if(pow != 0)
        {
            ListNode newnode = new ListNode(pow);
            temp.next = newnode;
            temp = temp.next;
            newnode.next= null;
        }

        return resHead.next;

    }
}