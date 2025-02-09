package MathForDSA;

public class A5RangeForXOR {
   //Que. Find the value of XOR from 0 to n
	public static void main(String[] args) {
		
      int n=10;
      int ans=xor(n);
      System.out.println("xor of Range from 0 to "+n+" is "+ans);//Ans:xor of Range from 0 to 10 is 11
      
      //range of xor from a to b = xor[b]^xor[a-1]
      int a=3;
      int b=9;
      int rangeAns=xor(b)^xor(a-1);  //xor(a-1) part already comes in xor(b) so xor(b)^xor(a-1) substract a-1 from b
                                     // which gives xor range between a and b
      System.out.println("xor Range between "+a+" and "+b+" is "+rangeAns);//xor Range between 3 and 9 is 2
	}
	public static int xor(int num){
		if(num%4==0) {
			return num;
		}else if(num%4==1) {
			return 1;
		}else if(num%4==2) {
			return num+1;
		}
		return 0;
	}

}
