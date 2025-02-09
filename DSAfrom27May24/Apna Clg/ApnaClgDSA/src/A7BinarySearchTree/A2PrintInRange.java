package A7BinarySearchTree;
import java.util.*;
public class A2PrintInRange {
	
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public static Node insert(Node root,int val) {
		if(root==null) {
			root = new Node(val);
			return root;
		}
		if(val<root.data) {
			root.left=insert(root.left,val);
		}else if(val>root.data) {
			root.right= insert(root.right,val);
		}
		return root;
	}
	
	public static void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}

	//Que. Print the value between given range 6 and 10 (including 6 and 10)
	 public static void printValueGivenRange(Node root,int x,int y) {
		 if(root==null) {
			 return;
		 }
		 if(root.data>=x && root.data<=y) {
			 printValueGivenRange(root.left,x,y);
			 System.out.print(root.data+" ");
			 printValueGivenRange(root.right,x,y);
		 }
		 if(root.data<x) {
			 printValueGivenRange(root.right,x,y);
		 }
		 if(root.data>y) {
			 printValueGivenRange(root.left,x,y);
		 }
		
	 }
	 
	 //Que. Print all the path from root to leaf
	 public static void printRootToLeaf(Node root,ArrayList<Integer> list) {
		   if(root==null) {
			   return;
		   }
		   
		   list.add(root.data);
		   
		 if(root.left==null && root.right==null) { //if leaf node
			 System.out.println("Path:"+list);
			 
		 }else { //if not leaf node
			 printRootToLeaf(root.left,list);
			 printRootToLeaf(root.right,list);
		 }
		 list.remove(list.size()-1);
	 }
	
	public static void main(String[] args) {
		
		int values[]= {8,5,3,1,4,6,10,11,14};
		Node root=null;
		for(int i=0;i<values.length;i++) {
			root = insert(root,values[i]);
		}
		System.out.println("Root: "+root.data);
        inorder(root); //Ans:1 3 4 5 6 8 10 11 14
        System.out.println();
        int x=6;
        int y=10;
        printValueGivenRange(root,x,y); //Ans: 6 8 10
        System.out.println();
        ArrayList<Integer> list = new ArrayList<Integer>();
        printRootToLeaf(root,list);
        /* 
         * Ans 
         * Path:[8, 5, 3, 1]
           Path:[8, 5, 3, 4]
           Path:[8, 5, 6]
           Path:[8, 10, 11, 14]
         */
	}

}
