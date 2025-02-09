package Y1BackTracking;

public class A4BackTrackingEx1 {
	//BAckTracking means make a change and reverse that change when that process is finished
   //BackTracking Example
	//Note: Always follow the diagram using pen and paper
   //here we move in all 4 direction that is Down(D), Right(R), Up(U), Left(L)
   //while moving we make cell as False
  //while coming back means when function execute then make that cell as true
	public static void main(String[] args) {
		
		boolean maze[][]= {{true,true,true},
				           {true,true,true},
				           {true,true,true}}; //Initially all the cells are true
		backTrackingEx("",maze,0,0);

	}
	
	public static void backTrackingEx(String p,boolean maze[][],int row,int col) {
		
		if(row==maze.length-1 && col==maze[0].length-1) {
			System.out.print(p+" ");//Ans: DDRR DDRURD DDRUURDD DRDR DRRD DRURDD RDDR RDRD RDLDRR RRDD RRDLDR RRDLLDRR
			return;
		}
		
		
		if(!maze[row][col]) {  //this return when cell of Matrix is false
			return;            //this not allow to move towards the false cell
		}
		
		//while moving we make cell as false
		// i am considering this block in my path
		maze[row][col]=false;
		
		//move towards down
		if(row<maze.length-1) {  //see the matrix diagram it allows till the rows of array which starts from 0
			backTrackingEx(p+"D",maze,row+1,col);
		}
		
		//move towards right
		if(col<maze[0].length-1) {
			backTrackingEx(p+"R",maze,row,col+1);
		}
		
		//move towards Up
		if(row>0) {
			backTrackingEx(p+"U",maze,row-1,col);
		}
		
		//move towards Left
		if(col>0) {
			backTrackingEx(p+"L",maze,row,col-1);
		}
		
		//While returning back we make the cells as true
		// this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
		maze[row][col]=true;  //this is a backtracking
	}

}
