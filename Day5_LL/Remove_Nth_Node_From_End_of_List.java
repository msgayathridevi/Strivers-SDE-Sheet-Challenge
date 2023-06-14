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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        if(n==1 && head.next==null) return null;
        ListNode d=new ListNode();
        d.next=head;
        ListNode f=d, s=d;
        for(int i=1;i<=n;++i) f=f.next;
        while(f.next!=null){f=f.next;s=s.next;}
        // ListNode del = s.next;
        s.next=s.next.next;
        // del.next=null;
        return d.next;
        /*if(head==null) return null;
        if(n==1 && head.next==null) return null;
        ListNode d=new ListNode();
        d.next=head;
        ListNode f=d, s=d;
        while(n>0){ f=f.next;n--;}
        while(f.next!=null){s=s.next;f=f.next;};
        ListNode del = s.next;
        s.next=s.next.next;
        del.next=null;
        return head;-*/
    }
}