package MathForDSA;

public class A9sqrtUsingBinarySearchSeive {
 //Que. Find the square root of num using binary search still 3 precision digits(decimal points) 
  //Time complexity: O(log(n))	
	public static void main(String[] args) {
		int num=38;
		int precision=3;
		double ans=sqrtUsingBinary(num,precision);
		System.out.println("Ans is "+ans);//Ans is 6.164

	}
	
	public static double sqrtUsingBinary(int num,int precision) {
				
		double ans=0.0;
		int start=0;
		int end=num;
		double root=0.0;
//		int mid=(start+end)/2;
		while(start<=end) {  //imp
			int mid=start+((end-start)/2);
			if((mid*mid)==num) {
				ans=mid;
				return ans;
			}
			if((mid*mid)>num) {
				end=mid-1;
				root=end;  //imp
			}else {
				start=mid+1;
				root=start;  //imp
			}
		}
		
		//When num is not perfect square
		double inc=0.1;
		for(int i=0;i<precision;i++) {
			while(root*root<num) {
				root+=inc;	
			}
			root -= inc;
			inc /= 10;
			
		}
	return root;
	}
}
