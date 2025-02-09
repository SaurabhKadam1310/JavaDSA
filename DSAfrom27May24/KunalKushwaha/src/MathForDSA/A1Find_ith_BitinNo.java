package MathForDSA;

public class A1Find_ith_BitinNo {
 // Que. Find the ith bit of a number.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int no=10;  //10 means 1010
       int ith=1;  //3rd bit value of no 10 is 1  //position starts from 0 of right side
       int ans=findithBit(no,ith);
       System.out.println("Ans is :"+ans); // Ans:1
	}
	public static int findithBit(int no,int ith) {
		int ithBit;   //10 means 1010
		int bitMask=1<<ith;// 1000 // 1 means 0001. For ith value i.e 3rd value we need to shift 1 to the left side
		ithBit= no&bitMask;  // Now finally 1010 & 1000= gives 1000 So ith i.e 3rd bit is 1.  	                         
		if(ithBit>0) {
			return 1;
		}
		return 0;
	}

}
