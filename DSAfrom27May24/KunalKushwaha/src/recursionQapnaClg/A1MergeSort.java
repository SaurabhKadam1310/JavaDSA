package recursionQapnaClg;

import java.util.Arrays;

public class A1MergeSort {
    //Merge Sort
	//time complexity: O(nlogn);
	public static void main(String[] args) {
     int arr[]= {3,4,67,8,1,9};
     int startIndex=0;
     int endIndex=arr.length-1;
     divide(arr,startIndex,endIndex);
     
     System.out.println(Arrays.toString(arr));//[1, 3, 4, 8, 9, 67]
     for(int i=0;i<arr.length;i++) {
    	 System.out.print(arr[i]+" "); //Ans:1 3 4 8 9 67
     }
	}

	public static void divide(int arr[],int si,int ei) {
		if(si>=ei) {//base case
			return;
		}
		int mid=si + (ei-si)/2;
		divide(arr,si,mid);
		divide(arr,mid+1,ei);  //divide is for divide the array into single element
		conquer(arr,si,mid,ei); //conquer is for combine the array
	}
	
	public static void conquer(int[] arr,int si,int mid,int ei) {
		int[] merge = new int[ei-si+1];
		
		int idx1=si;  //first index of first array
		int idx2=mid+1; //first index of second array
		int x=0;  //first index of merge array
		
		//O(n) complexity for conquer part and O(logn) for divide part so combine =O(nlogn)
		while(idx1<=mid && idx2<=ei) {
			if(arr[idx1]<arr[idx2]) {
				merge[x++]=arr[idx1++];  //here ++ is used for going towards next index
			}else {
				merge[x++]=arr[idx2++];
			}
		}
		//this is for remainig/extra element of an array
		while(idx1<=mid) {
			merge[x++]=arr[idx1++];
		}
		while(idx2<=ei) {
			merge[x++]=arr[idx2++];
		}
		
		for(int i=0,j=si;i<merge.length;i++,j++) {  //here j=si is important
			arr[j]=merge[i];
		}
	}
}
