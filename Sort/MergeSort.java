public class MergeSort{
	
		static int[] mergeList={64, 21, 33, 70, 12, 85};
		
	public static void main(String[] args){
		int[] noList=new int[6];
			display(noList.length);
		//divide(noList,0,noList.length-1);
		//display(noList.length);
		mergeWoRec();
	}

	public static void divide(int[] noList, int lb, int ub){
		System.out.println("Entry Data in Divide:\t"+lb+"\t"+ub);
		if(lb==ub){
		System.out.println("Return 1");		
			return;
		}else{
		int mid=(lb+ub)/2;
		System.out.println("Lb:\t"+lb+"\t Ub: \t" + ub+ "\t mid:\t"+mid);
		divide(noList,lb,mid);
		System.out.println("After first Divide Lb:\t"+lb+"\t Ub: \t" + ub+"\t mid:\t"+mid );
		divide(noList,mid+1,ub);
		System.out.println("After second Divide Lb:\t"+lb+"\t Ub: \t" + ub+"\t mid:\t"+mid );
		
		merge(noList,lb,mid+1,ub);
		}



	}

	public static void merge(int[] noList, int lb,int highPtr, int ub){
		
		
		//if two items then compare and sort them
		int j = 0;
		int mid=highPtr-1;
		int lowerBound = lb;
		int n = ub-lowerBound+1; // # of items
		String[] comments={"Merge process","lb","lb data","highPtr","highPtr data","mid","#elements","ub","ub data"};

		while(lb <= mid && ub >= highPtr){
			int[] data={j,lb,mergeList[lb],highPtr,mergeList[highPtr],mid,n,ub,mergeList[ub]};
			printData(comments, data);
			//System.out.println("Merger Process:\t"+ j+"\t mergeList[lb] \t"+mergeList[lb]+"\t mergeList[highPtr] \t "+mergeList[highPtr]);
			if(mergeList[lb]<mergeList[highPtr]){
				noList[j++]=mergeList[lb++];
			}else{
				noList[j++]=mergeList[highPtr++];
			}

		}
		while(lb<=mid){
			noList[j++]=mergeList[lb++];
		}
		while (ub>=highPtr){
			noList[j++]=mergeList[highPtr++];
		}

		for(j=0; j<n; j++){

			mergeList[lowerBound+j] = noList[j];
		}
		display(noList.length);
		//if more than two then divide the array into two halves and call for sorting again

		//if sort indexes reaches more than sizes then 


	}
	public static void printData(String[] comments, int... data){

		for (int i=0;i<comments.length;i++)	
			System.out.print(comments[i]+"\t"+data[i]+"\t");
		System.out.println();

	}
	public static void display(int nElems) {
		for(int j=0; j<nElems; j++) // for each element,
		System.out.print(mergeList[j] + " "); // display it System.out.println(“”);
		System.out.println();
	}

	 public static void mergeWoRec(){
	 	int n=mergeList.length;
	 	int lowPtr=0;
	 	int highPtr=n;
	 	int mid=lowPtr+highPtr/2;
	 	int bucketSize=2;
	 	//while(bucketSize<mid){
	 	for (int i=1;i<n;i*=2){	
	 		for(int j=0;j+i<n;j+=i*2){
	 			if(mergeList[i]>mergeList[j]){
	 				//swap();
	 				int temp=mergeList[j];
	 				mergeList[j]=mergeList[i];
	 				mergeList[i]=temp;	
	 				display(n);
	 			}//if

	 		}//inner four
	 	}//outer four
		//bucketSize=bucketSize++;

	 //	System.out.println(bucketSize+" "+mid);
	// }//while

	 }


}