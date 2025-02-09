package A5GreedyAlgorithm;
import java.util.ArrayList;
 class A3Main {

	public static void main(String[] args) {
		//here we create custom class that is A1ActivitySelectionProblem
		ArrayList<A1ActivitySelectionProblem> activitylist = new ArrayList<A1ActivitySelectionProblem>();
		activitylist.add(new A1ActivitySelectionProblem("A1",0,6));
		activitylist.add(new A1ActivitySelectionProblem("A2",3,4));
		activitylist.add(new A1ActivitySelectionProblem("A3",1,2));
		activitylist.add(new A1ActivitySelectionProblem("A4",5,8));
		activitylist.add(new A1ActivitySelectionProblem("A5",5,7));
		activitylist.add(new A1ActivitySelectionProblem("A6",8,9));
		
		A2ActivitySolution.activitySelection(activitylist);
	}
}
