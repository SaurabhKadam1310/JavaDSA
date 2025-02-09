package recursionPattern;

public class A1PatternUsingRecursion {
     //Que.Print a pattern using recursion
	public static void main(String[] args) {
		//My ans:
		int row=4;
		int col=4;
		//pattern using recursion
		printPattern(row,col);
		
		//Kunal ans:
		int r=3;
		int c=0;
		priPattern(r,c);
		
		//Kunal's ans for Ascending * pattern
		printPatternAsc(r,c);
	}
	
	//My ans:
	public static void printPattern(int row,int col) {
		if(row==0) {//base case
			return;
		}
		if(col>0) {
			System.out.print("*");
			printPattern(row,col-1); //this is for printing columns
		}else {
			col=row;
			System.out.println();   //new line after row
			printPattern(row-1,col-1); //we change the row and col number
		}
//output:
//		****
//		***
//		**
//		*
	}
	
	//Kunal Kushwaha Ans	:
	public static void priPattern(int r,int c) {
		if(r==0) {
			return;
		}
		if(c<r) {
			System.out.print("*");
			priPattern(r,c+1);
		}else {
			System.out.println();//new line
			priPattern(r-1,0);
		}
		
		
		//output:
        //		***
        //		**
        //		*
	}
	
	//Kunal's ans for Ascending * pattern
	public static void printPatternAsc(int r,int c) {
		if(r==0) {
			return;
		}
		if(c<r) {
			printPatternAsc(r,c+1);
			System.out.print("*");
		}else {
			printPatternAsc(r-1,0);
			System.out.println();
		}
	}
	//output:
    //	*
    //	**
    //	***

}
