package A2Linklist;
//LeetCode question
//Que. Remove nth node from end of the list  ex. Input: head = [1,2,3,4,5], n = 2   Output: [1,2,3,5]
 // ex. Input: head = [1], n = 1  Output: []  ex. Input: head = [1,2], n = 1  Output: [1]

public class A5RemoveNthNodeFromLast {
//Just for understanding copy from leetcode for detail understanding visit question on leetcode

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
 /*	class Solution {
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        
	        if(head.next==null){
	            return null;
	        }
	         int size=0;
	         ListNode currNode=head;
	         while(currNode!=null){
	            currNode=currNode.next;
	            size++;
	         }

	         if(size==n){
	            return head.next;
	         }
	         System.out.print(size);
	         int indexToSearch= size-n;
	          System.out.print(indexToSearch);
	        int i=1;
	        ListNode prevNode=head;
	        while(i<indexToSearch){
	            prevNode=prevNode.next;
	            i++;
	        }   
	        if(prevNode.next!=null){
	           prevNode.next = prevNode.next.next;
	        }
	        
	        return head; 
	}

	}*/
} 
