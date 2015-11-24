public class TestSort{
	
	public static void main(String[] args){
		int[] intArray={10,2,5,11,3,9};
		//BubbleSort bs=new BubbleSort(intArray);
		//bs.BubbleSort();
		//bs.printArray();

		//SelectionSort ss=new SelectionSort(intArray);
		//ss.SelectionSort();
		//ss.printArray();

		InsertionSort is=new InsertionSort(intArray);
		is.InsertionSort();
		is.printArray();
	}

}