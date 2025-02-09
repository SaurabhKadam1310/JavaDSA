package B2HashingQuestion;
import java.util.*;
//Que. Given an integer array of size n, find all elements that appear more than [n/3] times.
//e.g int nums[] = {1,3,2,5,1,3,1,5,1}; and ans= 1 because 1 appear more than n/3=9/3=3
//Note: if you solve with BruteForce method(nested loops) then it takes O(n^2) time complexity 
// and if we use one loop with HashMap then it takes O(n) time complexity 
public class A1MajorityElement {

	public static void main(String[] args) {
		int nums[] = {1,3,2,5,1,3,1,5,1};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int ele:nums) {  //time complexity: O(n)
			if(map.containsKey(ele)) {
				map.put(ele, map.get(ele)+1);
			}else {
				map.put(ele, 1);
			}
		}
		
		for(int key: map.keySet()) { //time complexity: O(n)
			if(map.get(key)>(nums.length/3)) {
				System.out.println(key);       //Ans: 1
			}
		}
	}

}
