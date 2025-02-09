package A5GreedyAlgorithm;
//Que. Coin change problem
//time complexity: O(nlogn)
import java.util.Arrays;
public class A4CoinChangeProblem {
	
	  static void coinChangeProblem(int[] coins, int amount) {
		  Arrays.sort(coins);  //time complexity: O(nlogn) due to sort the array
		  int index=coins.length-1;
		  while(true) {
			  int coinValue= coins[index];
			  index--;
			  int maxAmount= (amount/coinValue)*coinValue;
			  if(maxAmount>0) {
				  System.out.println("Coin Value: "+coinValue+" taken count: "+(amount/coinValue));
				  amount= amount-maxAmount;
			  }
			  if(amount==0) {
				  break;
			  }
		  }
	  }

	public static void main(String[] args) {
		int[] coins= {1,2,5,10,20,50,100,1000};
		int amount=2035;
		coinChangeProblem(coins,amount);
	}
 /* 
  * output: Coin Value: 1000 taken count: 2
          Coin Value: 20 taken count: 1
          Coin Value: 10 taken count: 1
          Coin Value: 5 taken count: 1
  */
}
