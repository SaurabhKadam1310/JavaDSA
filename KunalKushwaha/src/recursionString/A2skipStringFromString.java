package recursionString;

public class A2skipStringFromString {
    //Que. Skip a String(apple) from a String bdapplefg using recursion
	public static void main(String[] args) {
		String str="bdapplelfg";
		String newStr= skipStr(str);
		System.out.println("String after a skip is :"+newStr);//Ans:bdlfg
		
		//Skip app when not apple : means if appjhle then skip app and when apple then don't skip app
		System.out.println("String after skip app when not apple is : "+skipAppNotApple("dfapphfgbdapple"));
	}

	public static String skipStr(String str) {
	  if(str.isEmpty()){
		  return "";
	  }
	  if(str.startsWith("apple")) {
		  return skipStr(str.substring(5));
	  }else {
		  return str.charAt(0) + skipStr(str.substring(1));
	  }
	}
	
	public static String skipAppNotApple(String str) {
		  if(str.isEmpty()){
			  return "";
		  }
		  if(str.startsWith("app") && !str.startsWith("apple")) {  //here when apple then it not skip app
			  return skipAppNotApple(str.substring(3));
		  }else {
			  return str.charAt(0) + skipAppNotApple(str.substring(1));
		  }
		}
}
