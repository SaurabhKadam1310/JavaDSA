package RecursionArray;

import java.util.ArrayList;

public class A2LinearSearchRecursion {
   //Find the given target/value's index in the array using normal and recursive way
	
	public static ArrayList<Integer> list= new ArrayList<>();
	
	public static void main(String[] args) {
	  int arr[]= {23,3,56,4,6,6,17};
	  int target=6;
	  //Normal way
      int indexOfTarget=findTarget(arr,target);
      System.out.println("target is at index: "+indexOfTarget);//Ans:4
      
      //Recursive way
      int ind=findTargetIndex(arr,target,0);
      System.out.println("Using recursion Target at Index:"+ind);//Ans:4
      
      //Recursive way find index from last
      int lastIndex = findIndexLast(arr,target,arr.length-1);
      System.out.println("Using recursion from last index of array, Index: "+lastIndex);//Ans:5
      
      //If more than 1 time target occurs  in array then use ArrayList and print them
        twoTargetinArray(arr,target,0);
        System.out.println(" Array List: "+list);//Ans:[4,5]
        
        //Returning an ArrayList
        ArrayList<Integer> list2=new ArrayList<>();
        list2= indArrayList(arr,target,0,list2);
        System.out.println("Return type ArrayList :"+list2);//Ans:[4,5]
        
        //Arraylist created in each function call
        
        System.out.println("ArrayList with local :"+findIndex2(arr,target,0));//Ans:[4,5]
	}

	//Normal way
	public static int findTarget(int[] arr,int target) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==target) {
				index=i;
			  break;
			}
		}
		return index;
	}
	
	//Recursive way
	public static int findTargetIndex(int[] arr,int target,int index) {
		//base condition
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}
		return findTargetIndex(arr,target,index+1);
	}
	
	//Recursive from last index of array
	public static int findIndexLast(int[]arr,int target,int lastIndex) {
		if(lastIndex<0) {  //base condition
			return -1;
		}
		if(arr[lastIndex]==target) {
			return lastIndex;
		}
		return findIndexLast(arr,target,lastIndex-1);
	}
	
	//Store more than 1 index in ArrayList
	public static void twoTargetinArray(int[]arr,int target,int index) {
		if(index==arr.length) {
			return;
		}
		if(arr[index]==target) {
			list.add(index);
		}
		twoTargetinArray(arr,target,index+1);
	}
	
	//Returning an ArrayList
	public static ArrayList<Integer> indArrayList(int[]arr,int target,int index,ArrayList<Integer> list2) {//return type is ArrayList<Integer>
		if(index==arr.length) {
			return list2;  //we returning list
		}
		if(arr[index]==target) {
			list2.add(index);
		}
		return indArrayList(arr,target,index+1,list2);
		
	}
	
	//Returning an ArrayList without passing the list in function
	//Don't use this approach because object created again and again. Use above ArrayList approach
	public static ArrayList<Integer> findIndex2(int[]arr,int target,int index) {
		ArrayList<Integer> list3=new ArrayList<>();  //Arraylist created in each func call
		if(index==arr.length) {
			return list3;
		}
		
		if(arr[index]==target) {
			list3.add(index); //this will contain answer for that call only
		}
		ArrayList<Integer> ansFromBelowCalls= findIndex2(arr,target,index+1);
		list3.addAll(ansFromBelowCalls);//new type of recursion
		return list3;
		
	}
}
