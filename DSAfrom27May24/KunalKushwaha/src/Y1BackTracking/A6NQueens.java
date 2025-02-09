package Y1BackTracking;
  //N-Queens problem of BackTracking
public class A6NQueens {
  //follow the diagram while solving
	//Time complexity=O(n!);
	//Space complexity:O(n*n);
	public static void main(String[] args) {
		boolean board[][] =new boolean[4][4];
		System.out.println(queens(board,0)); //here 0 is row
	}
	
	public static int queens(boolean[][] board,int row) {
		if(row==board.length) {//base case
			display(board);
			return 1;
			
		}
		
		int count=0;
		//placing the queen and checking for every row and column
		for(int col=0;col<board[0].length;col++) {
			//place the queen if it is safe
			if(isSafe(board,col,row)) {
				board[row][col]=true;
				count+=queens(board,row+1);
				board[row][col]=false; //Backtracking
			}
		}
			
		return count;
	}
	
	 public static boolean isSafe(boolean[][] board,int col,int row) {
		 //check vertically
		 for(int i=0; i<row;i++) {
			 if(board[i][col]) {
				 return false;
				
			 }
		 }
		 
		 //diagonal left
		 for(int i=1;i<=Math.min(row, col);i++) {
			 if(board[row-i][col-i]) {
				 return false;
			 }
		 }
		 
		 //Diagonal right
		 for(int i=1;i<=Math.min(row, board.length-col-1);i++) {
			 if(board[row-i][col+i]) {
				 return false;
			 }
		 }
		 
		 return true;
	 }
	
	public static void display(boolean[][] board) {
		for(boolean row[]: board) {
			for(boolean ele:row) {
				if(ele==true) {
					System.out.print("Q ");
				}else {
					
					System.out.print("X ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
