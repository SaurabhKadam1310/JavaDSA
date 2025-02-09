package A5GreedyAlgorithm;
//Note: This Greedy Algorithm questions from "E-Learning Education" You-tube channel
public class A1ActivitySelectionProblem {
       private String  name;
       private int startTime;
       private int finishTime;
       
       public A1ActivitySelectionProblem(String name, int startTime, int finishTime) {  //constructor of class
    	   this.name=name;
    	   this.startTime=startTime;
    	   this.finishTime= finishTime;
       }
	
	//As name, startTime and finishTime are private so we use getter setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(int finishTime) {
		this.finishTime = finishTime;
	}
	
	@Override
	public String toString() {
		return "Activity: " +name+ ", startime= " +startTime+ ", finishTime= "+finishTime;
	}


	

}

