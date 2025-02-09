package B2HashingQuestion;
import java.util.*;
//Que. find the intersection of two arrays that is common value between two arrays
//arr1[]={7,3,9}; and arr2[]={6,3,9,2,9,4}; and ans should be 3,9 and count=2;
public class A3InterSectionOfTwoArrays {
//   IMP Note: To check Occurrence/frequency/common/Union/Unique  element in Array/ArrayList/LinkedList we use Hashing(HashSet,HashMap);
	public static int intersection(int arr1[], int arr2[]) {
		int count=0;
		  //for making unique value arr we convert 1st array into set
		HashSet<Integer> setArr1 = new HashSet<>();
		for(int ele: arr1) {
			setArr1.add(ele);
		}
		 
		for(int i=0;i<arr2.length;i++) {
			if(setArr1.contains(arr2[i])) {
				count++;
				System.out.print(arr2[i]+" "); //Ans: 3 9
				setArr1.remove(arr2[i]); //here we remove from the first set Array
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int arr1[] = {7,3,9};
		int arr2[] = {6,3,9,2,9,4};
		
		int commonVal = intersection(arr1,arr2);
       System.out.println();
       System.out.println("Count of value inside intersection of two arrays: "+commonVal); //Ans: 2
	}

}
