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
        int len =0;
        ListNode temp = head;
        while(head!=null){
            head = head.next;
            len++;
        }
        int i =0;
        int half = len/2;
        while(i<half){
            temp = temp.next;
            i++;
        }
        return temp;
    }
}