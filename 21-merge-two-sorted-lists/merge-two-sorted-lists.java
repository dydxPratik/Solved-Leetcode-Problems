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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temphead = head;
        head.next = null;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ListNode newnode = new ListNode(list1.val, null);
                temphead.next = newnode;
                temphead = temphead.next;
                list1 = list1.next;
            } else {
                ListNode newnode = new ListNode(list2.val, null);
                temphead.next = newnode;
                temphead = temphead.next;
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            ListNode newnode = new ListNode(list1.val, null);
            temphead.next = newnode;
            temphead = temphead.next;
            list1 = list1.next;
        }

        while (list2 != null) {
            ListNode newnode = new ListNode(list2.val, null);
            temphead.next = newnode;
            temphead = temphead.next;
            list2 = list2.next;
        }

        return head.next;
    }
}
