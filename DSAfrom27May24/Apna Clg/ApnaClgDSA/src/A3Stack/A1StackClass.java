package A3Stack;
  //Stack Using LinkedList
public class A1StackClass {
   
	    static class Node{  //this Node class for creating a Node of LinkedList
	    	int data;
	    	Node next;
	    	Node(int data){
	    		this.data=data;
	    		this.next=null;
	    	}
	    }
	    
	    static class Stack{
	    	public static Node head;
	    	public static boolean isEmpty() {  //to check Stack is empty or not
	    		return head==null;
	    	}
	    	public static void push(int data) {
	    		Node newNode = new Node(data);
	    		if(isEmpty()) {
	    			head=newNode;
	    			return;
	    		}
	    		newNode.next=head;
	    		head=newNode;
	    	}
	    	
	    	public static int pop() {
	    		if(isEmpty()) {
	    			return -1;
	    		}
	    		int top=head.data;
	    		head=head.next;  //we remove the head that is top of the Stack
	    		return top;
	    	}
	    	
	    	public static int peek() {
	    		if(isEmpty()) {
	    			return -1;
	    		}
	    		
	    		return head.data;
	    	}
	    }
	
	
	public static void main(String[] args) {
		    Stack s=new Stack();
		      s.push(1);
		      s.push(2);
		      s.push(3);
		      s.push(4);
		      s.push(5);
		      
		      while(!s.isEmpty()) {
		    	  System.out.println(s.peek());  //Ans: 5 4 3 2 1
		    	  s.pop();
		      }

	}

}
