package MathForDSA;
import java.util.*;
public class A3NoOfDigitsUsingFormula {

	public static void main(String[] args) {
		// int num=23415;
		// int base=10; //base=10 means decimal
		
		int num=11;
		int base=2; //base=10 means decimal and base=2 means binary
		
		int noOfDigits = (int)(Math.log(num)/Math.log(base))+1; //Formula for calculating digits
		System.out.println("No of Digits:"+noOfDigits);//Ans:4
	}

}
