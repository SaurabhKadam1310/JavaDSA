package A5GreedyAlgorithm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;   //Need to import
public class A2ActivitySolution {

	//time complexity: O(nlogn) and space complexity:O(1);
	static void activitySelection(ArrayList<A1ActivitySelectionProblem> ActivityList) {
		Comparator<A1ActivitySelectionProblem> finishTimeComparator = new Comparator<A1ActivitySelectionProblem>() {
			@Override
			public int compare(A1ActivitySelectionProblem o1, A1ActivitySelectionProblem o2) {
				return o1.getFinishTime() - o2.getFinishTime();
			}
		
	    };
		Collections.sort(ActivityList,finishTimeComparator);
		A1ActivitySelectionProblem previousActivity= ActivityList.get(0);
		
		System.out.println("\n\nRecommended Schedule: \n"+ActivityList.get(0));
		
		for(int i=1; i<ActivityList.size();i++) {
			if(ActivityList.get(i).getStartTime() >= previousActivity.getFinishTime()) {
				System.out.println(" "+ActivityList.get(i));
				previousActivity=ActivityList.get(i);
			}
		}
	}
	
	/*output:
	 *   Recommended Schedule: 
           Activity: A3, startime= 1, finishTime= 2
           Activity: A2, startime= 3, finishTime= 4
           Activity: A5, startime= 5, finishTime= 7
           Activity: A6, startime= 8, finishTime= 9
	 */

}
