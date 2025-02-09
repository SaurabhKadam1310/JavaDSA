package A4Queue;
  //Queue using Array
public class A1QueueEx1 {

	  static class Queue{
		  static int arr[];
		  static int size;
		  static int rear=-1;
		  
		  Queue(int n){ //constructor
			  arr = new int[n];
			  this.size=n;
		  }
		  
		  public static boolean isEmpty() {
			  return rear==-1;
		  }
		  
		  //enqueue that is add
		  public static void add(int data) {
			  if(rear==size-1) {
				  System.out.println("Queue is Full");
				  return;
			  }
			  rear++;
			  arr[rear]=data;
		  }
		  
		  //Dequeue means remove here time complexity: O(n)
		  public static int remove() {
			  if(isEmpty()) {
				  return -1;
			  }
			 int front = arr[0];
			 for(int i=0;i<rear;i++) {
				 arr[i]=arr[i+1];
			 }
			      rear--;
			  return front;
		  }
		  
		  //peek
		  public static int peek() {
			  if(isEmpty()) {
				  return -1;
			  }
			   
			  return arr[0];
		  }
	  }
	
	public static void main(String[] args) {
	   Queue q=new Queue(5);
	   q.add(1);
	   q.add(2);
	   q.add(3);
	   
	   while(!q.isEmpty()) {
		   System.out.println(q.peek());  //Ans: 1 2 3
		   q.remove();
	   }

	}

}
