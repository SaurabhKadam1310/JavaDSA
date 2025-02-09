package recursionString;
import java.util.*;
//Que.Letter combinations of phone number where 2 means abc , 3 means def
//Always use Kunal Kushwaha (p,up) trick for solving the problems and first solve using pen and paper
public class A9LetterCombinationOfPhoneNo {
     static String[] arr= {"."," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String[] args) {
		
		String str="23";
      ArrayList<String> ans =  lettersCombinations(str);
      System.out.println("Combinations are: "+ans);//Ans: [ad, ae, af, bd, be, bf, cd, ce, cf]
	}

	public static ArrayList<String> lettersCombinations(String digits){
		
		return lettersComb("",digits);
	}
	
	public static ArrayList<String> lettersComb(String p,String up){
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		
		char ch= up.charAt(0);
		String str = arr[ch-'0'];//here ch-'0' means substracting char from char gives integer this convert '2' into 2
		ArrayList<String> list2 = new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			list2.addAll(lettersComb(p+str.charAt(i),up.substring(1)));
		}
		
		return list2;
	}
}
