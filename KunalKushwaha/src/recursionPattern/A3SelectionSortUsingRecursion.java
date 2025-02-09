package recursionPattern;

import java.util.Arrays;

public class A3SelectionSortUsingRecursion {
   //Selection sort using recursion
	public static void main(String[] args) {
		int arr[]= {2,45,5,7,23,3,34};
		//In selection sort we place small element at first and then sort according to that from left to right
		//Normal way using iteration
		for(int i=0;i<arr.length-1;i++) {
			int smallest=i;
			int j;
			for( j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;       //Instead of swap here we just assign index to max
				}
			}
			//Swap
			    int temp=arr[i];  //we swap smallest element at start
			    arr[i]=arr[smallest];
			    arr[smallest]=temp;
		}  
		
		System.out.println(Arrays.toString(arr));//Ans:[2, 3, 5, 7, 23, 34, 45]
		
		//Recursion way : My ans
		int i=0;
		int j=i+1;
		int small=i;
		selectionRecursion(arr,i,j,small);
		System.out.println("Recursion way: "+Arrays.toString(arr));//Ans:[2, 3, 5, 7, 23, 34, 45]
	}
	
	public static void selectionRecursion(int[] arr,int i, int j,int small) {
		if(i==arr.length) {
			return;
		}
		
		if(j<arr.length) {
			if(arr[j]<arr[small]) {
				small=j;
			}
			selectionRecursion(arr,i,j+1,small);
		}else {
			int temp=arr[small];
			arr[small]=arr[i];
			arr[i]=temp;
			selectionRecursion(arr,i+1,i+2,i+1);
		}
	}
	   

}
