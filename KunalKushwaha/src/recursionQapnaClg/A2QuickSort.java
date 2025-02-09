package recursionQapnaClg;

public class A2QuickSort {
     //Quick Sort for sorting the array using pivot and partition
	 //time complexity: O(n^2) when last element is smaller or larger 
	//but good thing is it not take extra space as merge sort for creating new array
	
	public static int partition(int arr[],int low,int high) {
		int pivot=arr[high]; //here we consider as last element as pivot
		int i=low-1; //here index is below the array that is -1
		for(int j=low;j<arr.length;j++) {
			 if(arr[j]<pivot) {
				 i++;
				 //swap
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
		}
		//for swapping the pivot
		i++;
		int temp=arr[i];
		arr[i]=arr[high]; //arr[high] means pivot here we conside last element as pivot
		arr[high]=temp;
		
		return i; //here i is the index of pivot after partition.
		
	}
	
	public static void quickSort(int arr[],int low, int high) {
		if(low<high) {
			int pivot = partition(arr,low,high);
			
			quickSort(arr,low,pivot-1);  //here pivot works as mid
			quickSort(arr,pivot+1,high);
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {6,37,1,8,34,13,24};
		int n=arr.length;
		quickSort(arr,0,n-1);  //low means 0 arr[0]=6   and high means 6 arr[6]=24
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" "); //Ans:1 6 8 13 24 34 37
		}
	}

}
