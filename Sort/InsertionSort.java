public class InsertionSort{
	
private int[] intArray;
public InsertionSort(int... intArray){
	this.intArray= intArray;
	printArray();
}	

public void InsertionSort(){
	int temp,i,j,mp;
	int lowValueIdx=0;
	for(i=1;i<intArray.length;i++){
			temp=intArray[i];
			mp=i;
		for( j=i;j>0;j--){
			if(intArray[j-1] >= temp){ //check if current array value is less than temp value
			//replace j with 
				System.out.println("swapping:\t"+j+"\t: "+intArray[j]+"\t :"+intArray[j-1]);
				intArray[j]=intArray[j-1];
				mp--;
				//break;
				//swap(j,--j);
				//System.out.println("swapping:\t"+j+"\t: "+intArray[j]+"\t :"+intArray[j-1]);
			}

			
		}//inner for loop
			intArray[mp]=temp;
			//intArray[lowValueIdx]=intArray[i];
			//intArray[i]=temp;
			printArray();

	}//outer for loop
}

public void InsertionSortRec(int out,int in int n){
	if(out==n-1 || out==0){
		return;
	}

	int temp=intArray[out];


}

public void InsertionSort2(){
	int in,out;
	for (out=1;out<intArray.length;out++){
		int temp=intArray[out];
		in=out;
		while(in>0 && intArray[in-1]>=temp){
			System.out.println("swapping:\t"+in+"\t: "+intArray[in]+"\t :"+intArray[in-1]);
				
			intArray[in]=intArray[in-1];
			in--;
		printArray();
		}
		intArray[in]=temp;
		printArray();
	}

}

public void swap(int one, int two){
	int temp=intArray[one];
	intArray[one]=intArray[two];
	intArray[two]=temp;

}

public void printArray(){
	System.out.print("Elements in Array are:\t");
	for(int e:intArray){
		System.out.print(e+"\t");

	}

	System.out.println("=======================================");

}


}