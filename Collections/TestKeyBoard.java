import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class TestKeyBoard{
	static TestCollections testCollection;

	public TestKeyBoard(){
		testCollection=new  TestCollections();
	}
	public static void main(String[] args){
		Queue<Integer> queue=new LinkedList<Integer>();
			for (int i = 10; i >= 0; i--){
        	    queue.add(i);
        	}
        	heapSort(queue);

		}


		public static void heapSort(Collection c){
			List<Integer> sortedList=new ArrayList<Integer>();
			Queue<Integer> priorityQueue=new PriorityQueue<Integer>(c);
			testCollection.printUsingForLoop(priorityQueue,"Numeric");

			while (!priorityQueue.isEmpty())
    	    sortedList.add(priorityQueue.remove());
    		

    		
    		testCollection.printUsingForLoop(sortedList,"Numeric");
    
		}

}