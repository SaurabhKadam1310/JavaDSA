package recursionString;

public class A4ASCIIValueOfChar {

	public static void main(String[] args) {
		String up="abc";
		String p="";
		
		subSeqASCII(p,up);

	}
	
	public static void subSeqASCII(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		
		//to be add
		subSeqASCII(p+ch,up.substring(1));
		//to be not add
		subSeqASCII(p,up.substring(1));
		//to be add ASCII value of char
		subSeqASCII(p+(ch+0),up.substring(1));
	}

}
