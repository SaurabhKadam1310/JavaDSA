package A2Linklist;

public class A6Palindrom {
  //LeetCode Question
  //Que.Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
  //Input: head = [1,2,2,1] Output: true
		
	 	
	public static void main(String[] args) {
		// Copied from leetcode for understanding use leetcode for better understading this question
        
        /*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;  //if linklist is empty or have 1 element then it is palindrom
        }

        int size=0;
        ListNode forSize=head;
        while(forSize!=null){  //here we find the size of linkedlist
            forSize=forSize.next;
            size++;
        }
        int mid =size/2;
       ListNode prev=head;
       ListNode curr=head.next;
       int k;
       k=1;
       //System.out.print(mid);
       while(k<=mid){
        prev=prev.next;  //we devide second part of linkedlist as new list
        k++;
       }
       curr=prev.next;
       prev.next=null;  //here we make secondlist first as null and then reverse the second part only 
       while(curr!=null){
        ListNode next= curr.next;
        
        curr.next=prev;
        //update
        prev=curr;
        curr=next;
        
       }
       ListNode nextHead=prev;  //second list's prev means nextHead
       System.out.print(nextHead.val);
         System.out.print(head.val);
       boolean isPali=true;
       for(int i=0;i<mid;i++){    //here we check values are palindrom or not
         if(head.val==nextHead.val){
            head=head.next;
            nextHead=nextHead.next;
         }else{
            isPali=false;
            break;
          }
       }
       if(isPali){
        return true;
       }else{
           return false;
       }
    
    }
}
        * 
        * 
        * */
	}

}
