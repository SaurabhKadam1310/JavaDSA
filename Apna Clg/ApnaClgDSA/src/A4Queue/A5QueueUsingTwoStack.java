package A4Queue;
import java.util.*;
public class A5QueueUsingTwoStack {
    //Que. Create a Queue(FIFO Structure) Using Two Stack(LIFO Structure)
	
	static class Queue{
		static Stack<Integer> s1=new Stack<Integer>();
		static Stack<Integer> s2=new Stack<Integer>();
		
		public static boolean isEmpty() {
			return s1.isEmpty();
		}
	
		 //time complexity:O(n) for adding the data
		public static void add(int data) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s1.push(data); //When Stack s1 becomes empty then we add data in s1 stack
			
			
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
		
		//here for removing time complexity: O(1)
		public static int remove() {
			if(s1.isEmpty()) {
				return -1;
			}
			
			return s1.pop();
		}
		
		//here time complexity: O(1)
		public static int peek() {
			if(s1.isEmpty()) {
				return -1;
			}
			return s1.peek();
		}
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());  //Ans: 1 2 3 4 that is in  FIFO(First In First Out) structure
			q.remove();
		}

	}

}
