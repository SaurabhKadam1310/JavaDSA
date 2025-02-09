package B1HashMapImplementation;
import java.util.*;
public class A1HashMapImplementation {
	 static class HashMap<K,V>{ //Generics
		  private class Node{
			  K key;           //K and V are datatype
			  V value;
			  public  Node(K key, V value){
				  this.key=key;
				  this.value=value;
			  }
		  }
		  
		  private int n; //total no of nodes
		  private int N; //total no of buckets or array length
		 //private int arr[];
		  private LinkedList<Node> buckets[]; //N=buckets.length
		  
//		  @SuppressWarnings("unchecked")
		  public HashMap() { //constructor of HashMap
			  this.N=4;
			  this.buckets= new LinkedList[4];
			  for(int i=0;i<4;i++) {
				  this.buckets[i] = new LinkedList<>(); //here we create empty LinkedList at each index of array so later we can add node
			  }
		  }
		  
		  private int hashFunction(K key) {
			  int bi = key.hashCode(); //this is buld-in method in java which gives bucket index
			  //but return value may be negative or positive and sometime greater than size of bucket that is >N
			  //we need bi index between 0 to (N-1) so we take remainder of bi
			  return Math.abs(bi)%N; //Math.abs for [positive value and %N for remainder
		  }
		  private int searchInLL(K key,int bi) {
			  LinkedList<Node> ll = buckets[bi]; //here we take LinkedList at that bi
			  for(int i=0;i<ll.size();i++) {
				  if(ll.get(i).key == key) {
					  return i; //here i means di
				  }
			  }
			  return -1; //if key not found then send -1
		  }
		  
		  private void rehash() {
			  LinkedList<Node> OldBuckets[] = buckets;
			  buckets = new LinkedList[N*2];
			  for(int i=0;i<N*2;i++) {
				  buckets[i] = new LinkedList<>(); //here we create empty linkedList at each array index
			  }
			  for(int i=0;i<OldBuckets.length;i++) {
				  LinkedList<Node> ll = OldBuckets[i];
				  for(int j=0;j<ll.size();j++) {
					  Node node = ll.get(i);
					  put(node.key,node.value);
				  }
			  }
		  }
		  public void put(K key, V value) {
			  int bi = hashFunction(key); //here bi means bucket index
			  int di = searchInLL(key,bi); //here di means data index and LL in searchInLL means LinkedList 
			   //if di=-1 means key is not exist and if di>=0 means key is exist
			  if(di == -1) { //key doesn't exist
				  buckets[bi].add(new Node(key,value));
				  n++; //no of node increases
			  }else { //key is exist
				Node node =  buckets[bi].get(di); //we take node of di where node has key and value and we update the value;
				node.value = value;
			  }
			  
			  double lambda = (double)n/N;
			  if(lambda > 2.0) {
				  //reHashing
				  rehash();
			  }
		  }
		  
		  public V get(K key) {
			  int bi = hashFunction(key); //here bi means bucket index
			  int di = searchInLL(key,bi); //here di means data index and LL in searchInLL means LinkedList 
			   //if di=-1 means key is not exist and if di>=0 means key is exist
			  if(di == -1) { //key doesn't exist
				return null;
			  }else { //key is exist
				Node node =  buckets[bi].get(di); //we take node of di where node has key and value and we update the value;
				return node.value;
			  }
		  }
		  
		  
		  public boolean containsKey(K key) {
			  int bi = hashFunction(key); //here bi means bucket index
			  int di = searchInLL(key,bi); //here di means data index and LL in searchInLL means LinkedList 
			   //if di=-1 means key is not exist and if di>=0 means key is exist
			  if(di == -1) { //key doesn't exist
				return false;
			  }else { //key is exist
				return true;
			  }
		  }
		  
		  public V remove(K key) {
			  int bi = hashFunction(key); //here bi means bucket index
			  int di = searchInLL(key,bi); //here di means data index and LL in searchInLL means LinkedList 
			   //if di=-1 means key is not exist and if di>=0 means key is exist
			  if(di == -1) { //key doesn't exist
				  return null;
			  }else { //key is exist
				Node node =  buckets[bi].remove(di); //we take node of di where node has key and value 
				n--;
				return node.value;
			  }
			  
		  }
		  
		  public boolean isEmpty() {
			  return n==0;
		  }
		  
		  public ArrayList<K> keySet(){
			ArrayList<K> keys = new ArrayList<K>();
			for(int i=0;i<buckets.length;i++) {  //i means bucket index
				LinkedList<Node> ll = buckets[i]; 
				for(int j=0;j<ll.size();j++) {
					Node node = ll.get(j);
					keys.add(node.key);
				}
			}
			return keys;
		  }
	 }
	
	

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();  //Here we use the custom HashMap class and not build-in HashMap in Java
		map.put("India", 190);
		map.put("China", 200);
		map.put("US", 50);
 
		ArrayList<String> keys = map.keySet();
		for(int i=0;i<keys.size();i++) {
			System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
		}
		
		System.out.println(map.remove("India"));
	
	}

}
