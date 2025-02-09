package recursionSorting;

import java.util.Arrays;

public class A1MergeSort {
   //Kunal Kushwaha ans
	public static void main(String[] args) {
		int arr[]= {4,13,3,76,7,5,8};
		arr=mergeSort(arr);
		System.out.println(Arrays.toString(arr));//Ans:[3, 4, 5, 7, 8, 13, 76]
	}
    public static int[] mergeSort(int[] arr) {
    	if(arr.length==1) {//base case
    		return arr;
    	}
    	int[] left;
    	int[] right;
    	int mid=(arr.length)/2;
    	left=mergeSort(Arrays.copyOfRange(arr, 0, mid));//this gives left part
    	right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));//this gives right part
    	
    	return mix(left,right);
    }
    public static int[] mix(int first[],int second[]) {
    	int i=0; //1st index of first array
    	int j=0; //1st index of second array
    	int k=0; //1st index of new combine array
    	int[] combine=new int[first.length+second.length];
    	
    	while(i<first.length && j<second.length) {
    		if(first[i]<second[j]) {
    			combine[k]=first[i];
    			i++;
    		}else {
    			combine[k]=second[j];
    			j++;
    		}
    		k++;
    	}
    	
    	while(i<first.length) {
    		combine[k]=first[i];
    		i++; k++;
    	}
    	while(j<second.length) {
    		combine[k]=second[j];
    		j++; k++;
    	}
    	
    	
    	return combine;
    }
    
}
