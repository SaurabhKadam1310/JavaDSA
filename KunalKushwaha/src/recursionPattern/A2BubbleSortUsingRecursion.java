package recursionPattern;

import java.util.Arrays;

public class A2BubbleSortUsingRecursion {

	public static void main(String[] args) {
		int arr[]= {13,1,37,2,4,8,3};
		
		
		//Bubble Sort -Normal way
        for(int i=0;i<arr.length-1;i++) {//here we write arr.length-1 because when we sorted then last ele is already sort
        	for(int j=0;j<arr.length-1-i;j++) {//here arr.length-1-i in this we use -i because for each iteration of i last 
        		// ele is sorted so we reduce  size of arr      	
        		if(arr[j]>arr[j+1]) {  //here we check the max value and swap them
        			int temp=arr[j+1];
        			arr[j+1]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        for(int k=0;k<arr.length;k++) {
        	System.out.print(arr[k]+" "); //Ans:1 2 3 4 8 13 37 
        }
        
        
      //Recursive way My ans:
        int i=0;
        int j=0;
        System.out.println();
    	bubbleSortArr(arr,i,j);
    	
    	
    	//Recursive way : Kunal kushWaha ans:
    	int r=arr.length-1;
    	int c=0;
    	bubble(arr,c,r);
    	System.out.println(Arrays.toString(arr));//Ans:[1, 2, 3, 4, 8, 13, 37]
	}
	
	
	//Recursive way : My ans:
	public static void bubbleSortArr(int arr[],int i,int j){
		if(i==arr.length-1) { //base condition
			for(int k=0;k<arr.length;k++) {
				System.out.print(arr[k]+" ");//Ans:1 2 3 4 8 13 37
			}
			return;  //return means stop the void type function call
		}
		if(j>arr.length-1-i) {//first iteration here i consider as row and j as column
		   if(arr[j]>arr[j+1]) {
			
			    int temp=arr[j];
			    arr[j]=arr[j+1];
			    arr[j+1]=temp;
			 }
				bubbleSortArr(arr,i,j+1);
			
		}else {//new iteration
			bubbleSortArr(arr,i+1,0);
		}
	}
	
	//Recursive way : Kunal kushwaha ans:
	public static void bubble(int arr[],int r,int c) {
		if(r==0) {
			return;
		}
		if(c<r) {
			if(arr[c]>arr[c+1]) {
				int temp=arr[c];
				arr[c]=arr[c+1];
				arr[c+1]=temp;
			}
			bubble(arr,r,c+1);
		}else {
			bubble(arr,r+1,0);
		}
	}

}
