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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>() ;

        for(ListNode list : lists){
            ListNode temp = list ;
            while(temp!=null){
                pq.offer(temp.val);
                temp = temp.next ;  
            }
           
        }

        if(pq.isEmpty()){
            return null ;
        }
        ListNode ans = new ListNode(pq.poll());
        ListNode temp = ans ;
        while(!pq.isEmpty()){
            temp.next = new ListNode(pq.poll()) ;
            temp = temp.next ;
            
        }

        return ans;
    }
}