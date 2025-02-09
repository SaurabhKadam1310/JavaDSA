package A2Linklist;



public class A3ReversedLinkedList {
	Node head;
	private int size;
	A3ReversedLinkedList(){
		this.size=0;
	}
	
	
	   class Node{  //In java Node represented as the form of class 
		   String data;
		   Node next;    //here next means the next node hence DataType is Node
		   
		   Node(String data){  //constructor of Node
			   this.data=data;
			   this.next=null;   //next is by default null when we create a node
			   size++;
		   }
	   }
	   
	    
	   
	    //add- first   here we inserting an element at start of the Linklist
	   public  void addFirst(String data) {
		   Node newNode = new Node(data);
		   if(head==null) {
			   head=newNode;
			   return;
		   }
		   newNode.next=head;
		   head=newNode;
	   }
	   
	   //add-last   //here we add data as a last Node in Linklist
	   public void addLast(String data) {
		   Node newNode = new Node(data);
		   if(head==null) {
			   head=newNode;
			   return;
		   }
		   
		   Node currentNode;
		   currentNode=head;
		   while(currentNode.next!=null) {  //through this we find the last node 
			   currentNode=currentNode.next;
		   }
		   currentNode.next=newNode; //at the next of last node we add newNode;
		   
	   }
	   
	   
	   //Print   here we print the LinkList
	   public void printList() {
		   if(head==null) {
			   System.out.print("List is empty");
			   return;
		   }
		   Node currNode;
		   currNode=head;
		   while(currNode!=null) {
			   System.out.print(currNode.data+"->");
			   currNode=currNode.next;
		   }
		   System.out.println("null");
	   }
	   
	   
	   //delete first  here we delete the first node of LinkList
	   public void deleteFirst() {
		   if(head==null) {
			   System.out.println("The List is empty");
			   return; //here we right return means we break the function or come out of the function deleteFirst
		   }
		    size--;
		   //My ans
//		   Node currntNode;
//		   currntNode=head;
//		   currntNode.next=head;
		   //Apna clg di ans
		   head=head.next;//here we mention second node as head so first node that was head is deleted so that way we delete first node
		   
	   }
	   
	   //delete last here we delete the last node of LinkList
	   public void deleteLast() {
		   if(head==null) {
			   System.out.println("The List is Empty");
			   return;
		   }
		   size--;
		   if(head.next==null) {  //when we have only one node in linklist
			   head=null;
			   return;
		   }
		   Node secondLast=head;
		   Node lastNode=head.next;
		   while(lastNode.next!=null) {
			   lastNode=lastNode.next;
			   secondLast=secondLast.next;
		   }
		   secondLast.next=null; //here we make last node as null
		   //Note: For Imagination draw linkList using pen and paper
	   }
	   
	   
	   //size  here this function gives size of LinkList
	   public int getSize() {
		   return size;
	   }
	   
	   
	   //this method for reverse the LinkedList using space complexity: O(1)
	   public void reverseIterate() {  //for better understanding see diagram or draw diagram using pen and paper
		   if(head==null  || head.next==null) {
			   return;
		   }
		   
		   Node prevNode=head;
		   Node currNode=head.next;
		   while(currNode!=null) {
				   Node nextNode=currNode.next;
				   currNode.next=prevNode;
				   
				   //update
				   prevNode=currNode;
				   currNode=nextNode;

		   }
		   head.next=null;
		   head=prevNode; //here we make last element that is prevNode as a head
		   
	   }
	   
	   //Reverse a LinkList using Recursive way
	   public Node reverseRecursive(Node head) {
		   if(head==null || head.next==null) {
			   return head;
		   }
		 Node newHead = reverseRecursive(head.next);
		   head.next.next=head;
		   head.next=null;
		   return newHead;
	   }
	
	public static void main(String[] args) {
		
		//In this example we only reverse the linkedList using reverseIterate method other things we done copy paste from 
		//previous code
		A3ReversedLinkedList ll=new A3ReversedLinkedList();
         ll.addLast("1");
         ll.addLast("2");
         ll.addLast("3");
         ll.addLast("4");
         ll.addLast("5");
         ll.addLast("6");
         ll.printList(); //Ans:1->2->3->4->5->6->null  
        // ll.reverseIterate();
        // ll.printList();//Ans: 6->5->4->3->2->1->null
         ll.head=ll.reverseRecursive(ll.head);
         ll.printList();//Ans: 6->5->4->3->2->1->null
	}

}
