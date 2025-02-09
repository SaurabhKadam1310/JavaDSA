package A2Linklist;
import java.util.LinkedList; //need to import LinkedList
public class A2LinklistEx2 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();  //format to create LinkedList
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);//Ans: [is, a]
        list.addLast("list");
        System.out.println(list);//Ans: [is, a, list]
        list.addFirst("this");
        System.out.println(list);//Ans:[this, is, a, list]
        list.add("Saurabh"); //In LinkedList when we write only add then it added to the last node
                             //by default add() means addLast() in LinkedList
        System.out.println(list);//Ans: [this, is, a, list, Saurabh]
        list.add(2,"new");
        System.out.println("list after noe added at specific index: "+list);//Ans: [this, is, new, a, list, Saurabh]
        System.out.println(list.size());//Ans:5
        
        //loop
        for(int i=0; i<list.size();i++) {
        	System.out.print(list.get(i)+"->");  //Ans:this->is->a->list->Saurabh->
        }
        System.out.println("null");  //Ans:this->is->a->list->Saurabh->null
        
        //remove
        list.removeFirst();
        System.out.println(list);//Ans: [is, a, list, Saurabh]
        list.removeLast();
        System.out.println(list);//Ans: [is, a, list]
        list.remove(1);//here 1 is index we can delete the node at specific index
        System.out.println(list);//Ans:[is, list]
        
	}

}
