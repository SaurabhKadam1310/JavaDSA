package Y1BackTracking;
  //Sudoko solver
  //Always draw the diagram using pen and paper then try to solve
public class A9SudokoSolver {

	public static void main(String[] args) {
		
		int[][] board = new int[][] {
			 {3, 0, 6, 5, 0, 8, 4, 0, 0},
             {5, 2, 0, 0, 0, 0, 0, 0, 0},
             {0, 8, 7, 0, 0, 0, 0, 3, 1},
             {0, 0, 3, 0, 1, 0, 0, 8, 0},
             {9, 0, 0, 8, 6, 3, 0, 0, 5},
             {0, 5, 0, 0, 9, 0, 6, 0, 0},
             {1, 3, 0, 0, 0, 0, 2, 5, 0},
             {0, 0, 0, 0, 0, 0, 0, 7, 4},
             {0, 0, 5, 2, 0, 6, 3, 0, 0}
		};
		
		if(sudoko(board)) {
			display(board);
		}
		System.out.println();
		System.out.print("Ans: "+sudoko(board));

	}
	
	public static boolean sudoko(int[][] board) {
		
		int n=board.length;
		int row=-1;
		int col=-1;
		boolean isEmptyLeftSide=true;
		//we travel from each ele of 2D Array
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]==0) {
					row=i;
					col=j;
					isEmptyLeftSide=false;
					break;
				}
			}
			
			if(isEmptyLeftSide==false) {
				break;
			}
		}
		
		if(isEmptyLeftSide==true) {
			return true; //Sudoko is solved
		}
		
		
		//through this we try to place value where we found zero
		for(int num=1;num<=9;num++) {
			if(isSafe(board,row,col,num)) {
				board[row][col]=num;
				if(sudoko(board)) {
					return true;
				}else {
					//BackTracking
					board[row][col]=0;
				}
				
			}
		}
		
		return false;
	}
	
	public static boolean isSafe(int[][] board,int row ,int col, int num) {
		
		//checking row
		for(int i=0;i<board.length;i++) {
			if(board[row][i]==num) {
				return false;
			}
		}
		
		//checking column
		for(int[] rowArr : board) {
			if(rowArr[col]==num) {
				return false;
			}
		}
		
		//checking grid matrix imp 
		int sqrt=(int)Math.sqrt(board.length);
		int startRow= row - row % sqrt;
		int startCol= col- col % sqrt;
		
		for(int i=startRow;i<startRow+sqrt;i++) {
			for(int j=startCol;j<startCol+sqrt;j++) {
				 if(board[i][j]==num) {
					 return false;
				 }
			}
		}
		
		return true;
	}
	
	public static void display(int[][] board) {
		for(int[] rowArr: board) {
			for(int ele:rowArr) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
	}

}
