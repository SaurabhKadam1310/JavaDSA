package Y1BackTracking;

public class A7NQueensPractice {
   //N-Queens practice
	public static void main(String[] args) {
		
		boolean[][] board = new boolean[5][5];
		int row=0;
		
		int ans = nQueens(board,row);
		System.out.println("No of Count: "+ans);
	}
   
	public static int nQueens(boolean[][] board, int row) {
		if(row==board.length) {
			display(board);  //this fun we call for just printing the matrix
			return 1; //return 1 is for calculating the no of ans that is count
		}
		
		int count=0;
		for(int col=0;col<board[0].length;col++) {
			
			if(isSafe(board,row,col)) {
				board[row][col]=true;
			  count +=	nQueens(board,row+1);
				board[row][col]=false;
			}
		}
		return count;
	}
	
	public static void display(boolean[][] board) {
		for(boolean[] row:board) {
			for(boolean ele:row) {
				if(ele==true) {
					System.out.print("Q ");
				}else {
					System.out.print("x ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public  static boolean isSafe(boolean[][] board,int row,int col) {
		
		//check vertically that is there any Queen is present or not
		for(int i=0;i<row;i++) {
			if(board[i][col]) {
				return false;
			}
		}
		
		//check upper left diagonally
		for(int i=1;i<=Math.min(row, col);i++) {
			if(board[row-i][col-i]) {
				return false;
			}
		}
		
		//check upper right diagonally
		for(int i=1;i<=Math.min(row, board[0].length-col-1);i++) {
			if(board[row-i][col+i]) {
				return false;
			}
		}
		
		
		return true;
	}
}
