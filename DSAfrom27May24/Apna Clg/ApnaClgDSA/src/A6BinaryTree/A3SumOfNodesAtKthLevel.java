package A6BinaryTree;
import java.util.*;
//Apna clg Homework question
//Que. Find the some of nodes at  kth level of binary tree
public class A3SumOfNodesAtKthLevel {
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
       static class BinaryTree{
    	   Node root;
    	   static int idx = -1;
    	   public static Node buildTree(int nodes[]) {
    		   idx++;
    		   if(nodes[idx]==-1) {
       			return null;
       		}
    		   Node newNode = new Node(nodes[idx]);
    		     newNode.left = buildTree(nodes);
    		     newNode.right = buildTree(nodes);
    		   
    		   return newNode;  //here we return root of Node
    	   }
    	   
       }
       
       public static int sumofNodesatKthlevel(Node root, int level) {
    	   int sum=0;
    	   int count=1;
    	    Queue<Node> q = new LinkedList<>();
    	    q.add(root);
    	    q.add(null);
    	    
    	    while(!q.isEmpty()) {
    	    	Node currNode = q.remove();
    	    	 if(count==level ) {
    	    		 if(currNode!=null) {
    	    			  sum = sum + currNode.data; 
    	    		 }
    	    		
    	    	 }
    	    	if(currNode == null) {
    	    		if(q.isEmpty()) {
    	    			break;
    	    		}else {
    	    			q.add(null);
        	    		count++;
    	    		}
    	    		
    	    	}else {
    	    		if(root.left!=null) {
    	    			q.add(root.left);
    	    		}
    	    		if(root.right!=null) {
    	    			q.add(root.right);
    	    		}
    	    		
    	    	}
    	    }
    	   return sum;
       }
	
	public static void main(String[] args) {
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         BinaryTree tree = new BinaryTree();
         Node root = tree.buildTree(nodes);
         System.out.println("Root: "+root.data); //Ans:1
          System.out.println("Sum of nodes at kth level :"+sumofNodesatKthlevel(root,2));
	}

}
