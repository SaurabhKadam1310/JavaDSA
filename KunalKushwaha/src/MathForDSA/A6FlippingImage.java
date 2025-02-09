package MathForDSA;

public class A6FlippingImage {
  //leetcode que. This que comes in Google
  //Que. Given n*n binary matrix image containing 0 and 1 i.e 2d array
  // step 1: reverse the each row	
  // step 2: Replace 0 by 1 and 1 by 0
	
	public static void main(String[] args) {
	
     int[][] arr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
     //Ans is : [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     int[][] newArray;
     newArray=flippingImage(arr);
     for(int i=0;i<newArray.length;i++) {
    	 for(int j=0;j<newArray[i].length;j++) {
    		 System.out.print(newArray[i][j]);
    	 }
    	 System.out.println();
     }
	}
	
	//My Ans:
  /*	public static int[][] flippingImage(int arr[][]){
		 int temp;
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0,k=arr[0].length-1;j<arr[0].length/2;j++,k--) {
				 temp=arr[i][j];
				 arr[i][j]=arr[i][k];
				 arr[i][k]=temp;
//				 System.out.println(arr[i][j]);
			 }
		 }
		 
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[i].length;j++) {
				 arr[i][j]^=1;
			 }
		 }
		
		return arr;
	} */
    //Kunal Kushwaha optimized ans
	public static int[][] flippingImage(int arr[][]){
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<(arr[0].length+1)/2;j++) {
				int temp=arr[i][arr[i].length-1-j]^1;
				arr[i][arr[i].length-1-j]=arr[i][j]^1;
				   arr[i][j]=temp;
			}
		}
		
		return arr;
	}
	
	//LeetCode Optimized ans:
	/*  public int[][] flipAndInvertImage(int[][] A) {
        int C = A[0].length;
        for (int[] row: A)
            for (int i = 0; i < (C + 1) / 2; ++i) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }

        return A;
    } */
}
