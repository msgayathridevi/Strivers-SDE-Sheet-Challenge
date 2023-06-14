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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> lis = new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            lis.add(temp.val);
            temp=temp.next;
        }
        for(int i=0;i<lis.size()/2;i++){
            if(lis.get(i)!=lis.get(lis.size()-i-1))
                return false;
        }
        return true;
    }
}