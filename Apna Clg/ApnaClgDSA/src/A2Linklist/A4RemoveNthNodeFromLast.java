package A2Linklist;
import java.util.LinkedList;
public class A4RemoveNthNodeFromLast {
  //Que. Remove nth node from end of the list  ex. Input: head = [1,2,3,4,5], n = 2      Output: [1,2,3,5]
	//Ans Using build-in method of LinkedList
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Original list: "+list);//Ans: [1, 2, 3, 4, 5]
		int n=2;
		int size=list.size();
		int nthFromStart= size-n+1;
		list.remove(nthFromStart-1);
		System.out.println("After operation :"+list);//Ans:[1, 2, 3, 5]

		
	}

}
