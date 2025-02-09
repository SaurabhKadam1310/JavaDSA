package Recursion;

public class A4SumOfDigits {
   //Sum of digits of a number using normal and Recursion way
   //For both way: Time complexity:O(No of digits)=O(log(n)) and for recursion way Space complexity: O(log(n));	
   // Here n is number and log(n) means no of digits of that number
	public static void main(String[] args) {
		
     int no=54;
     int normalSumOfDigits=normalWay(no);
     System.out.println("Normal way Sum of digits:"+normalSumOfDigits);//Ans:9
     int recursionSumOfDigits=recursionWay(no);
     System.out.println("Recursive way Sum of digits:"+recursionSumOfDigits);//Ans:9
	}

	public static int normalWay(int N) {
		int sumOfDigits=0;
		while(N>0) {
			sumOfDigits += N%10;    // N%10 means reminder(last digit of a number N)
			N/=10;                  // N=N/10; We remove the last digit of a number N
		}
		return sumOfDigits;
	}
	
	public static int recursionWay(int N) {
		if(N==0) {  //base case 
			return 0;
		}            //IMP** Note : Before solving recursive example always draw a equation using pen and paper    
		return N%10 + recursionWay(N/10);  // Recursive equation draw on paper using pen
	}
}
