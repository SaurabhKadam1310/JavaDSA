package Recursion;

public class A5ProductOfDigitsOfNum {
     //Product of a digits of a number using recursion
	public static void main(String[] args) {
		int n=1342;
		int productOfDigits = prod(n);
		System.out.println("Product of digits: "+productOfDigits);//Ans:24
	}
	
	public static int prod(int n) {
		if(n==0) { //Base case   or if(n%10==n) then return n;
			return 1;
		}
		return (n%10)*prod(n/10); //recursive equation
	}

}
