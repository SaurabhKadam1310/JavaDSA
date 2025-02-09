package MathForDSA;

public class A4CountSetBit {
  //Que. Find the no of set bit in a given number like num=9 means(1001)= no of set bit=2
	public static void main(String[] args) {
		int num=98887;
		System.out.println(Integer.toBinaryString(num)); //this gives binary value in string datatype //Ans:11000001001000111
		int count=noOfSetBit(num);
        System.out.println("No of set bits are: "+count);//Ans:No of set bits are: 7
	}
	
	public static int noOfSetBit(int No) {
		int count=0;
		//My Approach
		/*  while(No>0) {
			  count+=(No&1);  //count the 1
			  No>>=1;  //remove the last bit through number i.e devide the no by 2
		  } */
		  
		  //or Kunal Kushwaha approach
		  while(No>0) {
			count++;
			No = No & (No-1);
		  }
		return count;
	}

}
