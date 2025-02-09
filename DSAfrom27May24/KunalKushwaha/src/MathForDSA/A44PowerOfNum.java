package MathForDSA;

public class A44PowerOfNum {
   //Que.Find the value a^b in optimize time complexity
   // 1 approach is (a*a*a**...) b times but time complexity is O(b)	
	public static void main(String[] args) {
		//second approach
		int base =2;
		int power=5; //3^6 =3^4*3^2;  power 6 means=110 in binary
		int ans = findPowerValue(base,power);
        System.out.println(ans);
	}
	 
	//Time Complexity of this approach:O(log(b)) if a^b
	public static int findPowerValue(int base,int power) {
		int ans=1;
		while(power>0) {
			int bitValue=power&1;
			if(bitValue==1) {
				ans*=base;
			}
			base*=base; // value be 9, 81, ... 9 means 3^2 , 81 means 3^4, then 3^8.....
			power>>=1; //using right shift we travel through binary bits of power
		}
		
		return ans;
	}

}
