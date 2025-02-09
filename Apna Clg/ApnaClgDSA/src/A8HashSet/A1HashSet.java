package A8HashSet;
import java.util.HashSet; //Need to import HashSet
import java.util.Iterator; //Need to import Iterator for traversing on set
public class A1HashSet {

	public static void main(String[] args) {
		//Creation
		HashSet<Integer> set = new HashSet<Integer>();
	   //ArrayList<Integer> list = new ArrayList<Integer>();	
        //HashSet is similar with ArrayList Syntax
		
		//Insert
		set.add(1); //similar syntax with list.add(1);
		set.add(2);
		set.add(3);
		set.add(1); //It will not take dublicate so value in set remains 1,2,3 only
		
		//size
		 System.out.println("Size of set: "+set.size()); //Ans:3
		 
		//Print all elements in the set
		 System.out.println(set); //Ans: [1, 2, 3]
		 
		//Iterator     for traversing on each element of set like i in for loop traverse on array(i is iterator for array)
		               //and need to import Iterator 
		 Iterator it = set.iterator(); //set has iterator method which returns iterator for set 
		                               //here 'it' is iterator like i is iterator for traversing array and Iterator is type of 'it'
		 //hasNext and next are two special function of 'it'
		 while(it.hasNext()) {
			 System.out.println(it.next());  //Ans: 1 2 3   here order/sequence may vary 
			     //no need to write it++ etc
		 }
		
		//Search    here in set for search special function is used that is "contains"
		if(set.contains(1)) {
			System.out.println("set contains 1 "); //Ans: set contains 1
		}
		if(!set.contains(6)) {
			System.out.println("does not contain 6"); //Ans: does not contain 6
		}
		
		//Delete
		set.remove(1); //here 1 is an element and not an index
		if(!set.contains(1)) {
			System.out.println("delete the 1"); //Ans:delete the 1
		}
		System.out.println(set); //Ans:[2, 3]
	}

}
