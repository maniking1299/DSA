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
    public void reorderList(ListNode head) {
        if(head==null || head.next  == null){
            return ;
        }

    // TC ->O(N)
    // SC ->O(1)
    
        // Finding the mid point
        ListNode fast = head;
        ListNode slow = head;
       
        

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
       

      // Reverse the list from mid and make a seprate linkedlist
        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode curr = second;
        while(curr!=null){
            ListNode nextNd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNd;
        }


        // Join the lists from st and mid 1 by 1;

        ListNode p1 = head;
        ListNode p2 = prev;

        while(p2 != null){
             ListNode t1 = p1.next;
             ListNode t2 = p2.next;

            p1.next = p2;
            p2.next = t1;

            p1 = t1;
            p2 = t2;
        }


        

    }
   
}