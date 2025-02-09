package MathForDSA;

public class A2Find_RightMost_SetBt {
    //Que.Find the position of the right most set bit. like 101100100. here 2nd is the right most set bit position 
	public static void main(String[] args) {
            int no=14;//1110 here right most set bit position is 1. 1st bit i.e 0's position consider as 0.
            int ans=findRightMostSetBit(no);
            System.out.println("Right Most set bit is at position:"+ans);//ans:1
	}
	public static int findRightMostSetBit(int no) {
		int i=0;
		while(no>0) {
			if((no&1)==1) {  //no&1 gives ans as 0 or 1. if 1 means no is odd else even for 1st loop
				break;
			}else {
				i++;  //count the position of set bit
				no>>=1;   //Using right shift we remove the last bit of number
				
			}
		}
		return i;
	}

}
