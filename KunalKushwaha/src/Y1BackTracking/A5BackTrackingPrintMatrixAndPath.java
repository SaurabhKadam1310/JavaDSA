package Y1BackTracking;

import java.util.Arrays;

public class A5BackTrackingPrintMatrixAndPath {
   //Print the Matrix of path from 1 to that number to achieve goal and also print path
	public static void main(String[] args) {

		boolean maze[][] = {{true,true,true},
				            {true,true,true},
				            {true,true,true}};
		
		int[][] path=new int[maze.length][maze[0].length];
		
		printPathAll("",maze,0,0,path,1);

	}
	
	public static void printPathAll(String p,boolean[][]maze, int row, int col, int[][]path,int step) {
		if(row==maze.length-1 && col==maze.length-1) { //base case
			path[row][col]=step;//last cell of matrix also required for printing the last element
			for(int[]arr:path) {
				System.out.println(Arrays.toString(arr));//to printing the row of 2D Array
			}
			System.out.println(p+" ");
			return;
		}
		
		if(!maze[row][col]) {
			return;
		}
		
		maze[row][col]=false;
		path[row][col]=step;
		
		if(row<maze.length-1) {
			printPathAll(p+"D",maze,row+1,col,path,step+1);
		}
		
		if(col<maze[0].length-1) {
			printPathAll(p+"R",maze,row,col+1,path,step+1);
		}
		
		if(row>0) {
			printPathAll(p+"U",maze,row-1,col,path,step+1);
		}
		
		if(col>0) {
			printPathAll(p+"L",maze,row,col-1,path,step+1);
		}
		
		//here while moving towards back we removes the assigned value
		maze[row][col]=true;
		path[row][col]=0;
		
	}

}
