public class BubbleSort{
	
private int[] intArray;
public BubbleSort(int... intArray){
	this.intArray= intArray;
	printArray();
}	

public void BubbleSort(){
	int temp;
	for(int i=0;i<intArray.length;i++){
		for(int j=0;j<(intArray.length-i-1);j++){
			if(intArray[j]>intArray[j+1]){
				temp=intArray[j];
				intArray[j]=intArray[j+1];
				intArray[j+1]=temp;
			}
			printArray();


		}
	}
}

public void printArray(){
	System.out.print("Elements in Array are:\t");
	for(int e:intArray){
		System.out.print(e+"\t");

	}

	System.out.println("=======================================");

}


}