package A3Stack;
import java.util.Stack;  //Need to import Stack
public class A3StackusingJavaCollections {
     //Stack Using Java Collection framework
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
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
