package Recursion;

public class A8CountZeroInNumber {
  //Que. Count zero's in a number using normal and recursive way
	public static void main(String[] args) {
		int num=10;
		int countZeroNormalWay = countZero(num);
		System.out.println("Total no of zeros in "+num+" is "+countZeroNormalWay);
		
		//Recursive way
		int totalZeros= countZeroAns(num,0);
		System.out.println("Total no of zeros using recursion  in no "+num+" is "+totalZeros);

	}
	
	//Normal way using iteration
	public static int countZero(int num) {
		int count=0;
		while(num>0) {
			if(num%10==0) {
				count++;
			}
			num/=10;
		}
		return count;
	}
	
	//Recursive way 
    public static int countZeroAns(int num,int count) {
    	if(num==0) {
    		return count;
    	}
    	if(num%10==0) {
    		count++;
    	}
    	return countZeroAns(num/10,count);
    }
}
