package Y1BackTracking;

public class A8KNights {
  //here we have to place 4 horses in chess board of 4*4 size successfully so that each horse not cut to each other
  //Note: Always use diagram or draw diagram using pen and paper while solving the problem	
	public static void main(String[] args) {
		int n=4;
		int row=0;
		int col=0;
		int target=4;
		boolean[][] board=new boolean[n][n];
		kNights(board,row,col,target);

	}
	
	public static void kNights(boolean[][] board,int row,int col,int target) {
		//base condition
		if(target==0) {
			display(board);
			return;
		}
		
		if(row==board.length-1 && col==board.length) {
			return;
		}
		
		if(col==board[0].length) {
			kNights(board,row+1,0,target);
			return;
		}
		
		
			if(isSafe(board,row,col)) {
				    board[row][col]=true;
				    kNights(board,row,col+1,target-1);
				    board[row][col]=false;
			}	
		
		   
			   kNights(board,row,col+1,target);
			   
		  
//			kNights(board,row+1,0,target);
//		    board[row][col]=false;
//		    target+=1;
			
			
			
	}
	
	public static boolean isSafe(boolean[][] board,int row,int col) {
		if(row>=1 && col<board[0].length-2) {
			if(board[row-1][col+2]) {
				  return false;
			  }
		}
		
		if(row>=1 && col>=2) {
			if(board[row-1][col-2]) {
				  return false;
			  }
		}
		if(row>=2 && col<board[0].length-1) {
			  if(board[row-2][col+1]) {
				  return false;
			  }
		}
		
		if(row>=2 && col>=1){
			if(board[row-2][col-1]) {
				  return false;
			  }
		}
		  
		return true;
	}
	
	public static void display(boolean[][] board) {
		for(boolean[] row: board) {
			
			for(boolean ele: row) {
				if(ele) {
					System.out.print("K ");
				}else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
