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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddhead = head ;
        if(head==null || head.next==null){
        return head ;
    }
        ListNode evenhead = head.next ;
        
        ListNode tempeven = evenhead ;
        while(oddhead!=null && tempeven!=null){
            oddhead.next = tempeven.next ;
            if(oddhead.next!=null){
                oddhead = oddhead.next;
                tempeven.next = oddhead.next ;

            }
            tempeven = tempeven.next ;
            
        }

        oddhead.next = evenhead ;
        return head ;
    }
}