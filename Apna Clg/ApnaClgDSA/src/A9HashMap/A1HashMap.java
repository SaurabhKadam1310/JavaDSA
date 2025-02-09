package A9HashMap;
import java.util.HashMap; //need to import HashMap
import java.util.Map;
import java.util.Set;
public class A1HashMap {

	public static void main(String[] args) {
		//Creation of HashMap  Syntax similar with HashSet
		//country(key),population(value)
		HashMap<String,Integer> map = new HashMap<>();  //here key is String and value is Integer
		
		//Insertion
		map.put("India", 120);  //put method used for insertion
		map.put("China", 130);
		map.put("US", 70);
		
		System.out.println(map); //{China=130, US=70, India=120}  
		//(map are unordered set. they can print value in any sequence)
		
		map.put("China", 180);    //If key is already present then it update the value of that key
		System.out.println(map);//{China=180, US=70, India=120} here China value becomes 180
        
		
		//Search
		if(map.containsKey("China")) {  //check key is present or not and returns true or false according to that
			System.out.println("Key is present in a map");  //Ans: Key is present in a map
		}else {
			System.out.println("Key is not present in the map");
		}
		
		System.out.println(map.get("China")); //key exists //Ans:180
		System.out.println(map.get("Indonesia")); //key doesn't exist //Ans: null
		
		int arr[]= {12,15,18};
		//regular way to iterate array and  print values
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" "); //Ans:12 15 18
		}
		System.out.println();
		//new way to iterate array and print them
		for(int val: arr) {
			System.out.print(val+" "); //Ans:12 15 18
		}
		System.out.println();
		//for iteration on map
		//similar with for(int val: arr) here int=Map.Entry<String, Integer> and val=e and arr=map.entrySet()
		for(Map.Entry<String, Integer> e: map.entrySet()) { //with help of entrySet
			System.out.print(e.getKey()+" ");
			System.out.println(e.getValue());  /* Ans 
			
			*China 180
             US 70
             India 120
			*/
			
		}
		
		Set<String> keys = map.keySet(); //with the help of keySet()
		for(String key: keys) {
			System.out.println(key+" "+map.get(key));
           /* Ans 			
			 *China 180
              US 70
              India 120
			*/
		}
		
		System.out.println(map);//Ans: {China=180, US=70, India=120}
		//remove
		map.remove("US");
		System.out.println(map);//Ans: {China=180, India=120}
		
		//size of map
		System.out.println("size: "+map.size());
	}

}
