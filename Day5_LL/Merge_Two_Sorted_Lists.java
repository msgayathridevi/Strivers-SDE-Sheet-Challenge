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
        ListNode ans_head = new ListNode();
        System.out.println("Ans : "+ ans_head.next);
        ListNode ans_tail = ans_head;
       while(list1 != null && list2 != null )
        {if(list1.val < list2.val ){
            ans_tail.next = list1;
            list1 = list1.next;
            ans_tail = ans_tail.next ;
        } else {
            ans_tail.next = list2;
            list2 = list2.next;
            ans_tail = ans_tail.next;
        }
       }

       if(list1 == null) ans_tail.next = list2;
       else if(list2 == null) ans_tail.next = list1;
        
        return ans_head.next;

    }
}