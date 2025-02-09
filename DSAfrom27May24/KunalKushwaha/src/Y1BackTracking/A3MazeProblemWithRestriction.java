package Y1BackTracking;
import java.util.*;
public class A3MazeProblemWithRestriction {
  //Que. Display possible ways when middle part is restricted 
  //here we move from (0,0) till the (maze.length-1, maze.length-1) here maze is 3 into 3  2-D Array
  //In this example we move from (0,0) of Array here 1st element is (0,0);	and destination is (2,2)
	public static void main(String[] args) {
		
		boolean maze[][] = {{true,true,true},
				            {true,false,true},
				            {true,true,true}};
		ArrayList<String> list=new ArrayList<>();
		list= pathRestrictions("",maze,0,0);
		System.out.println("Ans: "+list);//Ans:[VVHH, HHVV]

	}
	
	public static ArrayList<String> pathRestrictions(String p,boolean maze[][],int row,int col){
		if(row==maze.length-1 && col==maze[0].length-1) { //base case
			ArrayList<String> list2=new ArrayList<>();  //this created for each solution path
			list2.add(p);
			return list2;
		}
		    if(!maze[row][col]) {  //this is for restriction purpose
		    	ArrayList<String> list4=new ArrayList<>();
		    	return list4;  //here we just returning back that is just for syntax purpose we returning list4
		    }
		ArrayList<String> list3=new ArrayList<>();
		if(row<maze.length-1) {
			list3.addAll( pathRestrictions(p+"V",maze,row+1,col)); //here V means Vertical
		}
		if(col<maze[0].length-1) {
			list3.addAll(pathRestrictions(p+"H",maze,row,col+1)); //here H means Horizontal
		}
		
		
		return list3;
	}

}
