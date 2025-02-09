package A4Queue;
 import java.util.*;  //Need to import Queue
public class A4QueueJavaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Queue<Integer> q= new LinkedList<>();  //We can't create Object of Queue because Queue is not a class it is a Interface
                                            //LinkedList is a Class
        Queue<Integer> q= new ArrayDeque<>();   //here ArrayDeque and LinkedList are class which can implement Queue interface
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         q.add(5);
         q.remove();
         q.remove();
         
         while(!q.isEmpty()) {
        	 System.out.println(q.peek());  //Ans: 3 4 5
        	 q.remove();
         }
         
	}

}
