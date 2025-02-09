package B2HashingQuestion;
import java.util.*;
public class A5NoOfSubArrays {
  //Que. Count no of subArrays who's sum equal to k
	//e.g int arr[]={10,2,-2,-20,10} k=-10;  Ans should be 3 subArrays
	public static void main(String[] args) {
		int arr[]= {10,2,-2,-20,10};
		int k=-10;
		HashMap<Integer,Integer> map = new HashMap<>(); //<sum,frequency>
		
		map.put(0, 1); //empty sub array comes 1 time So frequency 1 and sum=0;
		int ans=0;
		int sum=0;
		for(int j=0;j<arr.length;j++) {
			sum += arr[j];    //later we add sum in hashmap for each iteration
			if(map.containsKey(sum-k)) {
				ans += map.get(sum-k);
			}
			
			if(map.containsKey(sum)) {
				map.put(sum, map.get(sum)+1);
			}else {
				map.put(sum,1);
			}
		}
		System.out.println("Ans: "+ans); //Ans : 3
	}

}
