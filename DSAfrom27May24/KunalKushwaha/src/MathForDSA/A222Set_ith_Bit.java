package MathForDSA;

public class A222Set_ith_Bit {
 // Que. Set ith bit means set ith bit as a 1. no matter either ith bit is 0 or 1.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int no=10; //10 means 1010  //Kunal kushwaha says position starts from 1 of right side which is Wrong.
       int ith=2; // here 2nd position bit is 0 .Remember position starts from 0 of right side. like   ...,2,1,0
       int ans=setithBit(no,ith);
       System.out.println("Ans is :"+ans);//Ans:14 i.e 1110
	}
	
	public static int setithBit(int no,int ith) {
		int ans;
		int bitMask=1<<ith;//this gives 1<<2 means 0100
		ans=no|bitMask; //1010 | 0100
		return ans;  //1110 means 14
	}

}
