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
        // 0 or 1 element
        if(head==null || head.next ==null ) return null;

        ListNode f=head, s=head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
            if(s==f){
                // break;
                s=head;
                while(s!=f){
                    s=s.next;
                    f=f.next;
                }
                return f;
            }
        }
        return null;
    }
}