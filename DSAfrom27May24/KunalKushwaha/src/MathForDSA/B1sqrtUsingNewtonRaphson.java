package MathForDSA;
//import java.util.*;
public class B1sqrtUsingNewtonRaphson {
//Que. Find the sqrt of the number using Newton Raphson method
// formula= root = 0.5(x + (n/x))  where n=number, x=assuming sqrt  root=ans	
	public static void main(String[] args) {
		int num=40;
		System.out.println("Sqrt using Newton Raphson Method: "+sqrt(num));//Ans:6.325023209103984
	}
	
	public static double sqrt(int num) {
		
		double x=num;  //x means assume root
		double root;
		
		while(true) {
			root = 0.5*(x + (num/x)); //here for every iteration root becomes half of previous root 
		    if(Math.abs(root-x)<0.5) {  //Math.abs convert -ve or +ve num into +ve.
		    	break;  //when diff is less than 0.5 then we break the infinite while loop
		    }
		    x=root;  //here x become root means every iteration root becomes half.
		
		}
		return root;
	}

}
