package A4Queue;
   //Queue Using LinkedList
public class A3QueueUsingLinkedList {
	
	 
		
	            static  class Node{  
	            	  int data;
	            	  Node next;
	            	  Node(int data){  //here we create new node
	            		  this.data=data;
	            		  this.next=null;
	            	  }
	              }         
	
             static class Queue{
                       static Node head=null;
                       static Node tail=null;
            	  //isEmpty()
            	  public static boolean isEmpty() {
            		  return head==null && tail==null;
            	  }
            	  
            	  //add node at last
            	  public static void add(int data) {
            		Node newNode= new Node(data);
            		if(isEmpty()) {
            			head=tail=newNode;
            			return;
            		}
            		tail.next=newNode;
            		tail=newNode;
            	  }
            	  
            	  //remove first node 
            	  public int remove() {
            		  if(isEmpty()) {
            			  System.out.println("LinkList/Queue is empty");
            			  return -1;
            		  }
            		  int first=head.data;
            		  if(head==tail) {//when linkedlist have only one element
            			 tail=null;
            		  }
            		  head=head.next;
            		  return first;  
            	  }
            	  
            	  //find the peek means head
            	  public int peek() {
            		  if(isEmpty()) {
            			  return -1;
            		  }
            		  return head.data;
            	  }
            	  
              }
	public static void main(String[] args) {
	//	A3QueueUsingLinkedList ll=new A3QueueUsingLinkedList();
		Queue q= new Queue();
		  q.add(1);
		  q.add(2);
		  q.add(3);
		  q.add(4);
		  q.remove();
		  
		 while(!q.isEmpty()) {
			 System.out.println(q.peek());  //Ans 2 3 4
			 q.remove();
		 }

	}

}
