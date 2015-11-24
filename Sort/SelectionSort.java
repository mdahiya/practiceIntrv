public class SelectionSort{
	
private int[] intArray;
public SelectionSort(int... intArray){
	this.intArray= intArray;
	printArray();
}	

public void SelectionSort(){
	int temp;
	int lowValueIdx=0;
	for(int i=0;i<intArray.length;i++){
		temp=intArray[i];//hold swap value in temp variable
		lowValueIdx=i;
		for(int j=i+1;j<intArray.length;j++){
			if(temp>intArray[j]){ //check if current array value is less than temp value
				//replace j with 
				temp=intArray[j];
				lowValueIdx=j;
			}
			

		}
			intArray[lowValueIdx]=intArray[i];
			intArray[i]=temp;
			printArray();

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