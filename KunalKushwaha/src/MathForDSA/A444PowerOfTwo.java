package MathForDSA;

public class A444PowerOfTwo {
    //Que.Find the num is power of 2 or not //means 2,4,8,16,32,...
	public static void main(String[] args) {
	  int num=8;
	  boolean ans=isPowerOfTwoRightShift(num);
      System.out.println(ans);//Ans:true
      boolean ans2=isPowerOfTwoFormula(num);
      System.out.println(ans2);//Ans:true
	}
    //1st approach using right shift
	//time complexity:O(log(Num))
	public static boolean isPowerOfTwoRightShift(int Num) {
		int count=0; //we count the no of bit 1 present in Num
		while(Num>0) {
			count+=Num&1;
			Num>>=1; //we remove the last bit i.e devide the no by 2
		}
		if(count==1) { //Only 1 bit and other bits are 0 means Num is power of 2
		  return true;	
		}
		
		return false;
	}
	
	//2nd approach using formula
	public static boolean isPowerOfTwoFormula(int Num) {
		if(Num==0) {
			return false;
		}
		if((Num & (Num-1))==0){
			return true;
		}
		return false;
	}
	
}
