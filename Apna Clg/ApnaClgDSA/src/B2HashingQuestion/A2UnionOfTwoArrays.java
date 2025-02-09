package B2HashingQuestion;
import java.util.*;
//Que. Union of two arrays 
//arr1[]={7,3,9}; and arr2[]={6,3,9,2,9,4};	and union of these two array is Union[]={7,3,9,6,2,4};
//Note: If we solve this question with BruteForce(Using nested loops then it takes O(n^2) complexity and if we sort the arrays and then solve
// it takes O(nlogn) time complexity and If solve using HashSet then it takes O(n) time complexity
//Here we solve using HashSet
public class A2UnionOfTwoArrays {
    public static void unionOfTwoArrays(int arr1[],int arr2[]) {
    	HashSet<Integer> set = new HashSet<>();
    	for(int ele:arr1) { // time complexity:O(n);
    		set.add(ele);
    	}
    	for(int ele:arr2) { // time complexity:O(n);
    		set.add(ele);
    	}
    	System.out.println(set.size()); //Ans: 6
    	System.out.println(set); //Ans: [2, 3, 4, 6, 7, 9]
    	
    	Iterator it = set.iterator();
    	while(it.hasNext()) {
    		System.out.print(it.next()+" ");//Ans:2 3 4 6 7 9 
    	}
    }
	public static void main(String[] args) {
		int arr1[]={7,3,9};
		int arr2[]={6,3,9,2,9,4};
		unionOfTwoArrays(arr1,arr2);
	}

}
