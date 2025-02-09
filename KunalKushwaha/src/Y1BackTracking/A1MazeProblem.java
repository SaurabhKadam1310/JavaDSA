package Y1BackTracking;

public class A1MazeProblem {
	//Note: Always follow the diagram given by the Kunal kushwaha before solving the problem or draw the diagram using pen and paper
    //Que. Print the possible ways to reach towards the destination(1,1) from (3,3). we can move only right and down direction
	public static void main(String[] args) {
	  int ans = count(3,3); //here first 3 means row and second three means column
      System.out.println("Total no of ways from (3,3) to (1,1) is "+ans);
	}
	
	public static int count(int row, int col) {
		
		if(row==1 || col==1) {  //base condition when col or row become 1 then only path to return is 1
			return 1;
		}
		
		int left=count(row-1,col);  //when we move towards downward direction
		int right=count(row,col-1); //when we move towards right direction
		
		return left+right;
	}

}
