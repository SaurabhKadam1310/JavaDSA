package A4Queue;
  //Circular Queues
 //Circular Queues time complexity is good that is O(1) than Queue using array
public class A2CircularQueue {
     static class Queue{
    	      static int size;
    	      static int rear=-1;
    	      static int front=-1;
    	      static int arr[];
    	      Queue(int n){
    	    	  arr = new int[n];
    	    	 this.size=n;
    	      }
    	      
    	      public static boolean isEmpty() {
    	    	  return rear==-1 && front==-1;
    	      }
    	      
    	      public static boolean isFull() {
    	    	  return (rear+1)%size==front;  //formula to check circular queue is full or not
    	      }
    	      
    	      //enque means add
    	      public static void add(int data) {
    	    	  if(isFull()) {
    	    		  System.out.println("Queue is full");
    	    		  return;
    	    	  }
    	    	  rear= (rear+1)%size;  //for one step back
    	    	  //if first ele add
    	    	  if(front==-1) {
    	    		  front=0;
    	    	  }
    	    	  arr[rear]=data;
    	    	  
    	      }
    	      
    	      //dequeue time complexity: O(1);
    	      public static int remove() {
    	    	  if(isEmpty()) {
    	    		  return -1;
    	    	  }
    	    	  int result = arr[front];
    	    	  //single element condition
    	    	  if(rear==front) {
    	    		  rear=-1;
    	    		  front=-1;	
    	    	  }
    	    	  else {
    	    		  front=(front+1)%size;
    	    	  }
    	    	  
    	    	  return result;
    	      }
    	      //peek
    	      public static int peek() {
    	    	  if(isEmpty()) {
    	    		  return -1;
    	    	  }
    	    	  return arr[front];
    	      }
    	      
     }
	public static void main(String[] args) {
		  Queue q=new Queue(5);
		  q.add(1);
		  q.add(2);
          q.add(3);
          q.add(4);
          q.add(5);
          System.out.println(q.remove());//Ans:1
          q.add(6);
          System.out.println(q.remove());//Ans:2
          q.add(7);
          while(!q.isEmpty()) {
        	  System.out.println(q.peek());  //Ans : 3 4 5 6 7
        	  q.remove();
          }
	}

}
