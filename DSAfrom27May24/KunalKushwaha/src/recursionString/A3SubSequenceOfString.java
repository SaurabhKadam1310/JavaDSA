package recursionString;
import java.util.ArrayList;
public class A3SubSequenceOfString {
  //Que.Find the sub sequences of a string "abc" that is a,b,c,ab,ac,bc,abc
	public static void main(String[] args) {
		String up="abc";  //up means unprocessed string 
		String p="";  //p means processed string means new string
        subSequence(p,up);//Normal void recursive way
      
      //return array list way
      ArrayList<String> list =new ArrayList<>();
      list=subSequenceRet(p,up,list);
      System.out.println("Array list return type "+list);//Ans:[abc, ab, ac, a, bc, b, c, ]
      
      //return array list created in function
      ArrayList<String> list2= subSeqRetArrayList(p,up);
      System.out.println("Return ArrayList created locally: "+subSeqRetArrayList(p,up));//Ans: [abc, ab, ac, a, bc, b, c, ]
	}

	public static void subSequence(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);//Ans:abc, ab, ac, a, bc, b, c,
			return;
		}
		
		char ch=up.charAt(0);
		//to be add
		subSequence(p+ch, up.substring(1));
		//to be not add
		subSequence(p, up.substring(1));
	}
	
	public static ArrayList<String> subSequenceRet(String p, String up, ArrayList<String> list){
		if(up.isEmpty()) {
			list.add(p);
			return list;
		}
		char ch=up.charAt(0);
		//to be add
	  	 subSequenceRet(p+ch,up.substring(1),list);
		//to be not add
        subSequenceRet(p,up.substring(1),list);
       return list;
	}
	
	public static ArrayList<String> subSeqRetArrayList(String p, String up){
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		
		char ch=up.charAt(0);
		//to be add
		ArrayList<String> list1= subSeqRetArrayList(p+ch,up.substring(1));
		ArrayList<String> list2= subSeqRetArrayList(p,up.substring(1));
		list1.addAll(list2);
		return list1;
	}
}
