package recursionString;
import java.util.List;
import java.util.ArrayList;
public class A5SubSet {
  //Que.SubSet of array using iteration
	public static void main(String[] args) {
		int arr[]= {1,2,3};
        subSet(arr);
        System.out.println("SubSet of above array is :"+subSet(arr));
	}
	
	public static List<List<Integer>> subSet(int[] arr){   //here List<List<Integer>> is a datatype
		List<List<Integer>> outer=new ArrayList<>();
		  outer.add(new ArrayList<>()); //one empty list is added in outer array
		  for(int ele:arr) {
			  int n=outer.size();  //first time n is 1 because we added empty list in outer
			  for(int i=0;i<n;i++) {
				  List<Integer> internal = new ArrayList<>(outer.get(i)); //here outer.get(i) gives a copy and store into internal
				  internal.add(ele);
				  outer.add(internal);
			  }
		  }
		 
		return outer;
	}

}
