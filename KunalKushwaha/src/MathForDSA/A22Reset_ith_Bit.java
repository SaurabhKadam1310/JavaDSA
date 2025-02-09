package MathForDSA;

public class A22Reset_ith_Bit {
  //Que. Reset/Unset/Clear ith bit means to create ith bit as 0 either bit is already 0 or 1 no matter.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int no=10; //1010
      int ithPosition=1; //In 1 position of no 10 is 1 bit
      
      
      int bitMask=1<<ithPosition; //0010
      int notBitMask=~bitMask; //1101
      int ans= no & notBitMask; //1010 & 1101
      System.out.println("Ans is:"+ans);//1000 i.e 8
	}

}
