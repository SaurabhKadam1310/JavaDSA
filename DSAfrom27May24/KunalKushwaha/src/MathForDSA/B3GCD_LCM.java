package MathForDSA;

public class B3GCD_LCM {
  //Que. Find the GCD and LCM of a number. Note: GCD means HCF
	public static void main(String[] args) {
		int a=105;
		int b=224;
        int gcdAns=gcd(a,b);
        System.out.println("GCD/HCF is "+gcdAns);//Ans:GCD/HCF is 7
        System.out.println("LCM is "+lcm(a,b));//Ans:LCM is 3360
	}

	//Here we use recursion because same step happened again and again
	public static int gcd(int a,int b) {
		//base case
		if(a==0) {
			return b;    //a=0 and b=any num then gcd=b;
		}
		
		
		return gcd(b%a,a);
	}
	
	public static int lcm(int a, int b) {
		
		return a*b/gcd(a,b); //Formula: lcm*gcd=a*b So,lcm=a*b/gcd; 
	}
}
