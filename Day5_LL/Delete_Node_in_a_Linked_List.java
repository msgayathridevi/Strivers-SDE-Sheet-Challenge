/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.next=null;
        node.val=node.next.val;
        //System.out.println("node next val"+ node.next.val);
        if(node.next!=null)
        node.next=node.next.next;
        return node;
    }
}