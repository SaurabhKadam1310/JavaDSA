package recursionString;
import java.util.*;
public class B1DiceThrow {
	//we know dice=[1,2,3,4,5,6]
   //Que.Find the maximum combination to form target in dice like for target 4 = (112),(121),(22),(31),(4),(211),(1111),(13)
	public static void main(String[] args) {
		int target=4;
		String p="";//here p means processed and target means unprocessed
		//printing the ans
		dice(p,target);   
		
		//returning the ans through ArrayList
		ArrayList<String> list = new ArrayList<>();
		list=diceRet(p,target);
		System.out.println("Returning type ArrayList: "+list);//Ans:[1111, 112, 121, 13, 211, 22, 31, 4]
		
		//Count no of ans and return
		System.out.println("Count Ans: "+diceRetCount(p,target));//Ans:8
	}
	
	//printing the ans
	public static void dice(String p, int target) {
		if(target==0) {
			System.out.print(p+" ");//Ans:1111 112 121 13 211 22 31 4 
			return;
		}
		for(int i=1;i<=target&&i<=6;i++) {
			dice(p+i,target-i);
		}
	}
	
	//Returning the ans
	public static ArrayList<String> diceRet(String p, int target){
		if(target==0) {
			ArrayList<String> list2=new ArrayList<>();
			list2.add(p);
			return list2;
		}
		
		ArrayList<String> list3=new ArrayList<>();
		for(int i=1;i<=target&&i<=6;i++) {  //here i=1 because dice starts from 1 and to 6.
			list3.addAll(diceRet(p+i,target-i));
		}
		return list3;
	}
	
	//Returning the no of ans
	public static int diceRetCount(String p, int target) {
		if(target==0) {
			return 1;
		}
		int count =0;
		for(int i=1;i<=target&&i<=6;i++) {
		count = count +	diceRetCount(p+i,target-i);
		}
		return count;
	}
	
	

}
