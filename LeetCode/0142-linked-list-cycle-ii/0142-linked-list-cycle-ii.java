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
        if(head == null || head.next==null){
            return null;
        }
        Set<ListNode> nodes = new HashSet<>();
        ListNode node = head;
        while(node!=null){
            if(nodes.contains(node)){
                return node;
            }
            nodes.add(node);
            node=node.next;
        }
        return null;
    }
}