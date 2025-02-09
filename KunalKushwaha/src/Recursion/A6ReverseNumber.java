package Recursion;

public class A6ReverseNumber {
   //Que. Reverse a number using normal way and using recursion 
	public static void main(String[] args) {
		int num=3524;
		int normalIterativeway=revIterative(num);
        System.out.println("Reverse a num "+num+" using iterative way "+normalIterativeway);
        
        //Using recursion
        int rev=0;
        int revRecursiveWay=revRecursive(rev,num);
        System.out.println("Reverse of a num "+num+" using recursion is "+revRecursiveWay);
        
        //Using Kunal method
        int revNum= helper(num);
        System.out.println("Reverse of a num "+num+" using no of digits/helper "+revNum);
	}
	
	public static int helper(int num) {
		int noOfDigits = (int)Math.log10(num)+1;   //Formula to count no of digits
		return revUsingNoOfDigits(num,noOfDigits);
	}
	
	public static int revUsingNoOfDigits(int num, int noOfDigits) {
		if(num%10==num) {//base case
			return num;
		}
		return (num%10)*(int)Math.pow(10, noOfDigits-1) + revUsingNoOfDigits(num/10,noOfDigits-1);//logic of Kunal Kushwaha 
		
	}
	
	public static int revIterative(int n) {
		int rev=0;
		while(n>0) {
			rev = rev*10 + n%10;  //formula for reverse
			n/=10;
		}
		return rev;
	}
	
	//Recursive way  imp
	public static int revRecursive(int rev,int N) {
		if(N==0){
			return rev;  //imp
		}
		rev=(rev*10)+(N%10);
		N/=10;
		return revRecursive(rev,N);
	}

}
