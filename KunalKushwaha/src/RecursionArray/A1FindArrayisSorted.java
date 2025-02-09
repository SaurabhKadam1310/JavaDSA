package RecursionArray;

public class A1FindArrayisSorted {
  //Que. Find the Array is sorted or not using normal and recursive way
	public static void main(String[] args) {
		int arr[]= {1,2,6,9,45,55};
		
		//Normal way
		boolean issorted= isSortedArr(arr);
        System.out.println("Is array sorted: "+issorted);//true
        
        //Recursive way
        boolean sort= isArraySorted(arr,0);
        System.out.println("Using recursion Is array sorted: "+sort);//true
	}

	//Normal/Iteration way  
	public static boolean isSortedArr(int[] arr) {
		int flag=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				flag++;
				break;
			}
		}
		if(flag==0) {
			return true;
		}
		return false;
	}
	
	//Using Recursion
	public static boolean isArraySorted(int[] arr,int Index) {
		if(Index==arr.length-1) { //base case
			return true;
		}
		if(arr[Index]<arr[Index+1]) { //condition
			return isArraySorted(arr,Index+1); //recursive call
		}else {
			return false;	
		}
	}
	
	
}
