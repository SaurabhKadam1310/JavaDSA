package A2Linklist;

public class A7CheckCycle {
  //leetcode question
  //Linked list cycle
	public static void main(String[] args) {
		
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
	/*	public class Solution {
		    public boolean hasCycle(ListNode head) {
		        if(head==null){
		            return false;
		        }
		        ListNode hare=head;  //hare means sassa
		        ListNode turtal=head; //turtal means kasav
		        boolean isCycle=false;
		        while(hare.next !=null && hare.next.next!=null){
		            hare=hare.next.next;
		            turtal=turtal.next;
		            if(hare==turtal){
		               isCycle=true;
		               break;
		            }
		        }
		        if(isCycle){
		            return true;
		        }else{
		            return false;
		        }

		    }
		} */

	}

}
