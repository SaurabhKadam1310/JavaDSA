package MathForDSA;

public class A7PrimeNum {
  //Check the num's are prime or not
	public static void main(String[] args) {
		int n=20;
		for(int i=1;i<=n;i++) {
			System.out.println(i+" "+isPrime(i));
		}

	}
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		int c=2;
		while(c*c<=num) { //c*c<=num means c<=sqrt(num)
			if(num%c==0) {
				return false;
			}	
			c++;
		  }
		return true;
	}

}

/* output:
 * 1 false
2 true
3 true
4 false
.
.
19 true
20 false
 *  */
