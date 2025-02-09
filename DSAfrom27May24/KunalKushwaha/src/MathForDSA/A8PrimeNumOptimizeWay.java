package MathForDSA;

public class A8PrimeNumOptimizeWay {
//Que. find the prime num less than 40 in optimized way using Seive's algorithm
//Space Complexity:O(n);	
//Time Complexity: O(nlog(logn))	
	public static void main(String[] args) {
		int n=37;
		boolean[] primenums = new boolean[n+1];//by default all indexes are false
		
			isPrimNumSeive(n,primenums);		
		
	}
	
	//boolean value false means Prime Num
	public static void isPrimNumSeive(int num,boolean[] primes) {
		for(int i=2;i*i<=num;i++) { //loops work till the sqrt of num
			if(!primes[i]) {  // !false=true
				
				for(int j=2*i;j<=num;j+=i) {
				  primes[j]=true;  //here the value can multiply which become true
				}                 // here true means Not a prime number
			}
		}
		
	//Print All prime num's	
		for(int i=2;i<=num;i++) {
			if(!primes[i]) {  //the value which are false in boolean array means Prime num
				System.out.print(i+" "); //Ans:2 3 5 7 11 13 17 19 23 29 31 37
			}
		}
		
	}

}
