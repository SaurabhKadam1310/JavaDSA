package recursionString;
import java.util.*;
public class A8PermutationsOfabc {
     //Que.Find all the permutations of abc that is abc,acb,bac,bca,cab,cba
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String up="abc";//here up means unprocessed
         String p=""; //here p means processed
         permutations(p,up);
         
         
         //returning ans as a ArrayList
         System.out.println("Permutaions Array List :"+permutationsList(p,up));//Ans:[cba, bca, bac, cab, acb, abc]
         
         //returning ans as a count
         System.out.println("Permutations count: "+permutationsListCount(p,up));//Ans:6
         
	}
	
	public static void permutations(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);  //Ans:cba, bca, bac, cab, acb, abc
			return;
		}
		
		char ch=up.charAt(0);
		//to be add
		for(int i=0; i<=p.length();i++) {  //here we use <= because when p is 1 then we need to add 2 times
			String first=p.substring(0,i);  //here we divide string and then we add ch
			String last=p.substring(i,p.length());
			permutations(first+ch+last,up.substring(1));  //here first+ch+last is imp 
			
		}
		
	}
	
	
	//returning ans as Array list
	public static ArrayList<String> permutationsList(String p, String up){
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		
		char ch=up.charAt(0);
		ArrayList<String> list2=new ArrayList<>();
		for(int i=0;i<=p.length();i++) {
			String  first=p.substring(0,i);
			String last=p.substring(i,p.length());
			list2.addAll(permutationsList(first+ch+last,up.substring(1)));
		}
		
		return list2;
	}

	
	//returning ans as count
		public static int permutationsListCount(String p, String up){
			if(up.isEmpty()) {
				ArrayList<String> list=new ArrayList<>();
				list.add(p);
				return 1;
			}
			
			char ch=up.charAt(0);
			int count=0;
			for(int i=0;i<=p.length();i++) {
				String  first=p.substring(0,i);
				String last=p.substring(i,p.length());
			count = count +	permutationsListCount(first+ch+last,up.substring(1));
			}
			
			return count;
		}

}
