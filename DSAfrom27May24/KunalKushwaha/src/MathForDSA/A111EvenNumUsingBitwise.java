//Que.Even Number using Bitwise
package MathForDSA;
import java.util.*;
public class A111EvenNumUsingBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter any No: ");
      Scanner sc=new Scanner(System.in);
      int no = sc.nextInt();
      if((no&1)==1) {  //Bitwise & operator
    	  System.out.println(no+" is odd");
      }else {
    	  System.out.println(no+" is even");
      }
      
	

       }


/*output:  
 *  1)  Enter any No: 12
 *      12 is even
 *      
 *  2) Enter any No: 3    
 *     3 is odd
 *  
 */
 
}