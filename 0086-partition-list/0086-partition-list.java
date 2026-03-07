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
    public ListNode partition(ListNode head, int x) {
        ListNode lessdummy = new ListNode(0);
        ListNode greaterdummy = new ListNode(0);
        ListNode fastdummy = new ListNode(0);
        ListNode less = lessdummy;
        ListNode greater = greaterdummy;
        ListNode curr = head;

        while(curr != null){
            if(curr.val < x){
                less.next = curr;
                less = less.next;
            }else{
                greater.next = curr;
                greater = greater.next;
            }
            curr = curr.next;
        }
        greater.next = null;
        less.next = greaterdummy.next;
        return lessdummy.next;
    }
}