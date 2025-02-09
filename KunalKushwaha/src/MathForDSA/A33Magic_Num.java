package MathForDSA;

public class A33Magic_Num {
 //Que. Multiply each bit of num by 5^1,5^2,5^3.....and Give the ans of that number. //Question ask in Amazon
 //ex. for 6 num (binary=110)=((5^3*1)+(5^2*1)+(5^1*0))=150 	
	public static void main(String[] args) {
      int n=6;
      int ans=magicNumAns(n);
      System.out.println("Magic No Ans: "+ans);//Ans:150
	}
	//My Ans:
 /*	public static int magicNumAns(int num) {
		int NoToMultiply=5;
		int magicNoAns=0;
		int i=1;
		 while(num>0) {
			 int bitValue=0;
			 int totalValue=1;
			 bitValue=(num&1); //Here we check bit is 1 or 0
			 for(int j=0;j<i;j++) {
				 totalValue=totalValue*5;  //here we take power of 5 as per the i value.
			 }
			 magicNoAns+=bitValue*totalValue; //multiply power of 5 with bitvalue and add in ans
			 i++; 
			 num>>=1; //right shift is used for remove the last bit or divide by 2 to the num
		 }
		
		return magicNoAns;
	} */

	//Kunal Kushwaha's ans:
	public static int magicNumAns(int num) {
		int baseValueToMultiply=5;
		int ans=0;
		while(num>0) {
			int lastbit=num&1;
			num>>=1;
			ans+=(lastbit*baseValueToMultiply);
			baseValueToMultiply=baseValueToMultiply*5;			
		}
		return ans;
	}
}
