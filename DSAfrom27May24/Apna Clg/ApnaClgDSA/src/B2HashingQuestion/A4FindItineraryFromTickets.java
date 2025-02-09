package B2HashingQuestion;
import java.util.*;
//Que. Find Itinerary from tickets here itinerary means journey/path  //refer diagram for more understanding
//Condition: No loop will create and Not from two location to one destination
// So Keys array/set is unique and value's array/set also unique
public class A4FindItineraryFromTickets {
    
	public static void itinerary(HashMap<String,String> tickets) {
		String start="";
		HashMap<String, String> revMap = new HashMap<>(); //here revMap used just for finding the start
		for(String key: tickets.keySet()) {
			revMap.put(tickets.get(key), key);
		}
		for(String key:tickets.keySet()) {
			if(revMap.containsKey(key)==false) {
				start= key;
				break;
			}
		}
		while(tickets.containsKey(start)) {
			System.out.print(start+"-> "); //Ans : Mumbai-> Delhi-> Goa-> Chennai->
			start = tickets.get(start);
		}
		System.out.println(start); //this is for last destination Ans:  Bengaluru
	}
	
	public static void main(String[] args) {
		HashMap<String,String> tickets = new HashMap<>();
		tickets.put("Chennai", "Bengaluru");
		tickets.put("Mumbai", "Delhi");
		tickets.put("Goa", "Chennai");
		tickets.put("Delhi", "Goa");

		itinerary(tickets);  //Ans: Mumbai-> Delhi-> Goa-> Chennai-> Bengaluru
	}

}
