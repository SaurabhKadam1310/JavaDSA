package RecursionArray;

public class A3RotatedBinarySearch {

	public static void main(String[] args) {
		//This works only for Rotated Array.
      int arr[]= {5,6,7,8,9,1,2,3};
      int target=2;
      int start=0;
      int end=arr.length-1;
      System.out.println(findTargetIndex(arr,target,start,end));//Ans:6
	}
  public static int findTargetIndex(int arr[],int target,int start,int end) {
//	   int index=-1;
	   if(start>end) {//base case
		   return -1;
	   }
	   //
	   int mid=(start+end)/2;
	   if(arr[mid]==target) {
		   return mid;
	   }
	   if(arr[start]<arr[mid]) {
		   if(target>arr[start] && target<arr[mid]) {
			   return findTargetIndex(arr,target,start,mid-1);
		   }else {
			   return findTargetIndex(arr,target,mid+1,end);
		   }
	   }
	 
	   
	   if(target>arr[mid]&&target<arr[end]) {
		   return findTargetIndex(arr,target,mid+1,end);
	   }
	   else {
		   return findTargetIndex(arr,target,start,mid-1);
	   }
	  
  }
}
