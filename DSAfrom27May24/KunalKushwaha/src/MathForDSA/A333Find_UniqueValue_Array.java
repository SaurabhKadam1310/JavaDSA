package MathForDSA;
// Wrong or Incorrect solution
public class A333Find_UniqueValue_Array {

	public static void main(String[] args) {
	     int arr[]= {2,2,6,2,7,8,7,8,8,7};//Here every value occurs 3 times except 4
	     int ans=findUniqueValue(arr);
	     System.out.println("Unique value is "+ans);
	}
   public static int findUniqueValue(int Arr[]) {
    	String ans="";
    	    for(int n:Arr) {
    	    	//ans=ans + Integer.toBinaryString(n);
    	    }
    	int ansInt=Integer.parseInt(ans)%3;
//    	ans=Integer.parseInt(Integer.toBinaryString(ans),2);
    	return ansInt;
    }
}
