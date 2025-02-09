package A3Stack;
import java.util.*;
  //Que. Reverse a Stack
 //while solving this see a diagram or draw using pen and paper
public class A5ReverseAStack {
	
	public static void pushAtTheBottom(Stack<Integer> s,int data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top=s.pop();
		pushAtTheBottom(s,data);
		s.push(top);
	}

	 public static void reverseStack(Stack<Integer> s) {
		 if(s.isEmpty()){
			 return;
		 }
		 int top= s.pop();
		 reverseStack(s);
		 if(s.isEmpty()) {
			 s.push(top);
		 }else {
			 pushAtTheBottom(s,top);
		 }
		
		 
	 }
	
	public static void main(String[] args) {
	  Stack<Integer> s = new Stack<Integer>();
      s.push(1);
      s.push(2);
      s.push(3);
     /* while(!s.isEmpty()) {
    	  System.out.println(s.peek()); //Ans: 3 2 1
    	  s.pop();
      } */
      
      reverseStack(s);
       while(!s.isEmpty()) {
	    System.out.println(s.peek()); //Ans: 1 2 3
	    s.pop();
       } 
	}

}
