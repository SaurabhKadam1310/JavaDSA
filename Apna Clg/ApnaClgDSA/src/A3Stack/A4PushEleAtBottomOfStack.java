package A3Stack;
import java.util.*;
public class A4PushEleAtBottomOfStack {
  //Que. Push  element at the bottom of the Stack
  //here we use recursion approach to push element at bottom of the Stack	
	// here stack is 3 2 1 and we need to push element 4 at bottom of stack so ans should be 3 2 1 4
	public static void pushAtBottom(Stack<Integer> s,int data) {
		if(s.isEmpty()) {
		     s.push(data);
		     return;
		}
		int top=s.pop();
		 pushAtBottom(s,data);
		 s.push(top);
	}
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		pushAtBottom(s,4);
		
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());  //Ans: 3 2 1 4
			s.pop();
		}
        
	}

}
