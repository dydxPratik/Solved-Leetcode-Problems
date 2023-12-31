/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var middleNode = function(head) {
    if(head === null){
        return null;
    }
    if(head.next == null) {
        return head;
    }

    let ptr1 = head;
    let ptr2 = head;

    while(ptr2 !== null && ptr2.next !== null){
        ptr1 = ptr1.next;
        ptr2 = ptr2.next.next;
    }
    return ptr1;
};