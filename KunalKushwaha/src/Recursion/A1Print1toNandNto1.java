package Recursion;
//1st program on 31 may 2024
public class A1Print1toNandNto1 {
	//Recursion
   //Que. Input:n i.e 5 and Print 5 to 1 using print fun and 1 to 5 using printFrom1 fun.
	//and print both sequence using printBoth function
	//Time complexity:O(n) and Space complexity:O(n);
	public static void main(String[] args) {
	int n=5;
    print(n);
    printFrom1(n);
	printBoth(n);
	}

	public static void print(int n) {
		if(n==1) {  //Base case
			System.out.println(n);
			return;
		}
		System.out.println(n); //to print 5 to 1
		print(n-1); //Recursion call
	}
	
	public static void printFrom1(int n) {
		if(n==0) {  //base call
			return;
		}
		
		printFrom1(n-1);  //Recursion call    
		System.out.println(n); //to print 1 to 5
	}
	
	public static void printBoth(int n) {
		if(n==0) {  //Base case
			return;
		}
		System.out.println(n);  //to print 5 to 1
		printBoth(n-1);  //Recursion call
		System.out.println(n);  //to print 1 to 5
	}
}
