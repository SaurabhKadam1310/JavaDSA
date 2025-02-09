package MathForDSA;
import java.util.*;
public class A11UniqueNoInArray {

	//Que. Find the Unique no from array other elements are double i.e ans should be 6
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {1,5,4,6,4,1,5};
       //We know XOR operator are 1 when one value is 0 and another 1 that is (0 XOR 1) = 1 ,  (1 XOR 0) = 1 otherwise 0 
       
      int ans=findUnique(arr);
      System.out.println("Ans is "+ans);//Ans:6
	}
	
	 public static int findUnique(int arr[]){
        int unique=0;
        
        for(int n:arr) {
        	unique ^=n;  //We know a^a=0  therefore 4^4=0 here we do 1^5^4^6^4^1^5=6 like 1-2-1+2+3=3 Sequence No matter in XOR
        }
		 return unique;
     }

}
