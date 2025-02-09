//package A5GreedyAlgorithm;
//import java.util.*;
//public class A6FractionalKnapsack {
//	
//	static void knapSack(ArrayList<A5KnapSackItem> items, int capacity) {
//		Comparator<A5KnapSackItem> comparator = new Comparator<A5KnapSackItem>() {
//			@Override
//			public int compare(A5KnapSackItem a1, A5KnapSackItem a2) {
//			if( a1.getRatio()<a2.getRatio()) {
//					return 1;
//				}
//			return -1;
//			}
//		};
//		
//		Collections.sort(items,comparator);
//		int usedCapcity=0;
//		double totalValue=0.0;
//		
//		for(A5KnapSackItem item:items) {
//			if(item.getWeight()+usedCapcity<=capacity) {
//				totalValue+=item.getValue();
//				usedCapcity+=item.getWeight();
//				System.out.println("Taken Item "+item);
//			}else {
//				int usedWeight = capacity-usedCapcity;
//				double value = item.getRatio()*usedWeight;
//				totalValue+=value;
//				usedCapcity +=usedWeight;
//				System.out.println("Item index: "+item.getIndex()+ "Obtained value: "+value+ " used weight: "+usedWeight+" ratio: "+item.getRatio());
//			}
//			if(usedCapcity==capacity) {
//				break;
//			}
//		}
//		System.out.println("Total Value: "+totalValue);
//	}
//
//	public static void main(String[] args) {
//	     ArrayList<A5KnapSackItem> items=new  ArrayList<A5KnapSackItem>();
//	     int[] value= {100,120,60};
//	     int[] weight= {20,30,10};
//
//	}
//
//}
