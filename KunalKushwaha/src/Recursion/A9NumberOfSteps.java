package Recursion;

public class A9NumberOfSteps {
   //LeetCode Example
	//Number of Steps to Reduce a Number to Zero
	//Given an integer num, return the number of steps to reduce it to zero.
    //In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it
	public static void main(String[] args) {
		int num=14;
      System.out.println(numberOfSteps(num));//Ans:6
	}

	
	   public static int numberOfSteps(int num) {
	        if(num==0){
	            return 0; 
	        }
	        if(num%2==0){
	           
	           return numberOfSteps(num/2) +1; //here +1 means we count the step; while returning the function
	        }else{
	           
	          return numberOfSteps(num-1)+1; //here +1 means we count the step; 
	        }
	    }
}
