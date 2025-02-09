package A2Linklist;
//Different operations on Linklist
public class A1LinklistEx1 {
	Node head;
	private int size;
	A1LinklistEx1(){
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
			   System.out.print(currNode.data+" ");
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
	
	public static void main(String[] args) {
		A1LinklistEx1 ll = new A1LinklistEx1();//here we create object of own LinkList class
          ll.addFirst("a");
          ll.addFirst("is");
          ll.printList(); //Ans: is a null
          
          ll.addLast("List");
          ll.printList(); //Ans : is a List null
          
          ll.addFirst("This");
          ll.printList();//Ans:This is a List null
          
          ll.deleteFirst();
          ll.printList();//Ans:is a List null

          ll.deleteLast();
          ll.printList();//Ans: is a null
          
          System.out.println(ll.getSize());//Ans:2
          ll.addFirst("thid");
          System.out.println(ll.getSize());//Ans:3
          
	}

}
