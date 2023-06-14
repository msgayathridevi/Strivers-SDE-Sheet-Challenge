/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        ListNode t1=h1,t2=h2;
        int c1=0,c2=0;
        while(t1!=null){
            c1++;
            t1=t1.next;
        }
        while(t2!=null){
            c2++;
            t2=t2.next;
        }
        // System.out.println(c1+" " +c2);
        t1=h1;t2=h2;
        if(c2>c1){
            int w=(c2-c1);
            while(w>c1){
                t2=t2.next;
                w--;
            }
        }
        else{
            int w=(c1-c2);
            while(w>c2){
                t1=t1.next;
                w--;
            }
        }
        while(t1!=null && t2!=null){
            if(t1==t2) return t1;
            t1=t1.next;
            t2=t2.next;
        }
        return null;
    }
}