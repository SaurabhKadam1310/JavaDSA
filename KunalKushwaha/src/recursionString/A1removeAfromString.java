package recursionString;

public class A1removeAfromString {
  //Question given a string str=baccad remove a from that means newStr=bccd using recursion
	public static void main(String[] args) {
		String str="abaccada";
		String newStr="";
		String newStr2="";
		
		//Normal way
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				continue;
			}else {
				newStr+=str.charAt(i);
			
			}
		}
		System.out.println("New String are: "+newStr);  //Ans:bccd
		
		//Recursion way
		newStr=removeAlla(str,0,"");
		System.out.println("New String using recursion: "+newStr); //Ans:bccd
		
		//Recursion way passing only one argument in function call
		newStr2=removeAfromStr(str);//here we pass only one argument that is str
         System.out.println("Recursion by passing one argument: "+newStr2);  //Ans:bccd
	}
	
	public static String removeAlla(String str,int index,String newStr) {
		if(str.length()==index) {
			//System.out.println("New string using recursion: "+newStr);
			return newStr;
		  }
		if(str.charAt(index)!='a') {
			newStr+=str.charAt(index);
		}
		return removeAlla(str,index+1,newStr);
	}
	
	public static String removeAfromStr(String str) {
		if(str.isEmpty()) { //str.length()==0
			return "";
		}
		if(str.charAt(0)=='a') {
			return removeAfromStr(str.substring(1));
		}else {
			return str.charAt(0)+ removeAfromStr(str.substring(1));		
		}
	}

}
