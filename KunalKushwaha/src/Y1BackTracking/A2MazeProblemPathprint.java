package Y1BackTracking;
import java.util.ArrayList;
public class A2MazeProblemPathprint {
   //Que. Print the path of maze problem  to reach (1,1) from (3,3)
	public static void main(String[] args) {
		//before solving the problem always draw a problem diagram using pen and paper as drawn by kunal kushwaha
		//By seeing the diagram try to code
         countPathPrint("",3,3); //here "" consider as processed(p) and 3,3 as unprocessed (up) as used in permutations example
         
         //Return ans using ArrayList
         ArrayList<String> list = new ArrayList<>();
         pathReturn("",3,3,list);
         System.out.println("Ans in ArrayList:"+list);//Ans: [DDRR, DRDR, DRRD, RDDR, RDRD, RRDD]
         
         //If allow to move diagonally also means 3 directions right,down,diagonally
         System.out.println("When allow to move Diagonally also :"+pathDiagonally("",3,3));
         //Ans: [DDRR, DRDR, DRRD, DRX, DXR, RDDR, RDRD, RDX, RRDD, RXD, XDR, XRD, XX]
	}
	
	public static void countPathPrint(String p,int row,int col) {
		if(row==1 && col==1) {  //Base condition
			System.out.print(p+ " ");// Ans: DDRR DRDR DRRD RDDR RDRD RRDD
			return;
		}
		//when we move towards down
		if(row!=1) {
			countPathPrint(p+"D",row-1,col);
		}
		 
		
		 //when we move towards right
		if(col!=1) {
			countPathPrint(p+"R",row,col-1);
		}
		 
	}
	
	 //Return ans using ArrayList
	public static ArrayList<String> pathReturn(String p, int row, int col, ArrayList<String> list){ //here we pass list as a argument/parameter
		if(row==1 && col==1) { //here when row and col is 1 means we reach the destination then that path we want
			list.add(p);
			return list;
		}
		if(row>1) {
			pathReturn(p+"D",row-1,col,list); //here D means Downward direction
		}
		
		if(col>1) {
			pathReturn(p+"R",row,col-1,list);  //here R means Right direction
		}
		
		return list;
	}
	
	//if allow to move diagonally also    use pen and paper with diagram for understanding
	
	public static ArrayList<String> pathDiagonally(String p,int row,int col){
		if(row==1 && col==1) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> list2=new ArrayList<>();
		if(row>1) {
			list2.addAll(pathDiagonally(p+"D",row-1,col));//here D means Down
		}
		
		if(col>1) {
		  list2.addAll(pathDiagonally(p+"R",row,col-1));  //here R means Right
		}
		
		if(row>1 && col>1) {
		  list2.addAll(pathDiagonally(p+"X",row-1,col-1));	 //here X means Diagonally
		}
		
		return list2;
	}

}
