package Recursion;

public class A3SumOfNnumbers {
   //Sum of a number n using recursion
	public static void main(String[] args) {
	int n=5;	
    int sumOfN=sum(n);
    System.out.println("Sum of "+n+" no from 1 is "+sumOfN);
	}

	public static int sum(int No) {
		if(No==1) {//Base case
			return 1;
		}
		return No+sum(No-1);  //recursive equation
	}
}
