package Recursion;

public class A7PalindromNum {
  //Check given no is palindrom or not using both normal and recursive way
	public static void main(String[] args) {
		int num=35653;
		//Normal Way
		boolean isPalindromNormal=palindrom(num);
        System.out.println("The given num is palindrom: "+isPalindromNormal);
        
        //Palindrom using Recursion way
        boolean isPalinndromrecursion= isPalind(num);
        System.out.println("The given no is palindrom using recursion: "+isPalinndromrecursion);
	}
	
	//Normal/Iterative way
	public static boolean palindrom(int N) {
		int rev=0;
	    int temp=N;
	    while(N>0) {
	    	rev = rev*10 + N%10;
	    	N/=10;
	    }
	    if(temp==rev) {
	    	return true;
	    }
	    return false;
	}
	
	//Recursive way
	public static boolean isPalind(int N) {
		int noOfDigits= (int)Math.log10(N)+1; //formula to find no of digits of a number
		int temp=N;
		int revOfNum= revNum(N,noOfDigits);
		if(N==revOfNum) {
			return true;
		}
		return false;
	}
	
	public static int  revNum(int N,int noOfdigits) {
		if(N%10==N) {//Base case means when remain last digit then return as it is
			return N;
		}
		return N%10 * (int)Math.pow(10, noOfdigits-1) + revNum(N/10,noOfdigits-1);
	}
}
