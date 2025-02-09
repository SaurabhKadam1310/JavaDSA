package A3Stack;
  //Stack using ArrayList
import java.util.ArrayList;
public class A2StackArrayList {
   
	    static class Stack{
	    	static ArrayList<Integer> list = new ArrayList<Integer>();
	    	 
	    	 public static boolean isEmpty() {  //to check stack is empty or not
	    		 return list.size()==0;
	    	 }
	    	 //push
	    	 public static void push(int data) {
	    		 list.add(data); //it is automatically added to the last index
	    	 }
	    	 
	    	 //pop
	    	 public static int pop() {  //we remove last element of ArrayList    		 
	    		 if(isEmpty()) {
	    			 return -1;
	    		 }
	    		 int top=list.get(list.size()-1);
	    		  list.remove(list.size()-1);
	    		  return top;
	    	 }
	    	 
	    	 //peek
	    	 public static int peek() {
	    		 if(isEmpty()) {
	    			 return -1;
	    		 }
	    		 int top = list.get(list.size()-1);
	    		 return top;
	    	 }
	    	 
	    	 
	     }
	
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		 
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");  //Ans: 4 3 2 1
			s.pop();
		}

	}

}
