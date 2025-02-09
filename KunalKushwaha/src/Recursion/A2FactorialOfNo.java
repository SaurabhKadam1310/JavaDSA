package Recursion;

public class A2FactorialOfNo {

	public static void main(String[] args) {
		int num=3;
        int factorialAns=fact(num);
        System.out.println("Factorial of "+num+" is "+factorialAns); //Ans:6
	}
	
	public static int fact(int No) {
		if(No<=1) { //Base case . we Know 1!=1 so we decide base case. Also 0!=1 we can write (No<=1)
			return 1;
		}
		return No*fact(No-1); //We can devide factorial into sub part i.e recursive equation
	}

}
