package MathForDSA;

import java.util.ArrayList;

public class B2FactorsOfNumber {
 //Find the factors of a number
 // Brute force solution	
 //Time Complexity: O(n)	
	public static void main(String[] args) {
		int num=36;
      
     findFactors(num);
     findFactors2(num);
    findFactors3(num);
      
	}

	 //Time Complexity: O(n)
	public static void findFactors(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
					System.out.print(i+" ");//Ans:1 2 3 4 6 9 12 18 36
			}
		}
		
	}
	
	//Optimized way  time complexity:O(sqrt(n))  Unsorted order
	public static void findFactors2(int num) {  //output:1 36 2 18 3 12 4 9 6  
		for(int i=1; i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				
				 if(i==(num/i)) {  //in case of num=36 it gives 2 times 6 therefore we write this condition
					 System.out.print(i+" ");
				 }else {
					 System.out.print(i+" "+num/i+" ");  //Ans is Unsorted order
				 }
			}
		}
	}
	
	//Optimized way with Sorted order with time complexity:O(sqrt(n)) and Space complexity: O(sqrt(n))
	//Here we use Arraylist So, Space complexity:O(sqrt(n));
	public static void findFactors3(int num) {  // Output: 1 2 3 4 6 9 12 18 36
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				if(i==num/i) {
					System.out.print(i+" ");
				}else {
					System.out.print(i+" ");
					list.add(num/i);  //here we add only the Descending Order elements in list
				}
			}
		}
		
		for(int j=list.size()-1;j>=0;j--) {//we want to display descending order elements into ascending order
		  	System.out.print(list.get(j)+" "); //here we display list elements
		}
	}
}
