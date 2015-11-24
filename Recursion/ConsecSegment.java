public class ConsecSegment{
	static int[] sortedNoList={1,2,3,10,25,26,30,31,32,33};
	public static void main(String[] args){
		int predecessor,successor=0;
		findConsecSeg(sortedNoList[0],sortedNoList[0],0);
		




	}

	public static void findConsecSeg1(){
		int lastNumber = sortedNoList[0];
    Integer rangeStart = lastNumber;
    StringBuilder output = new StringBuilder();

    for(int i = 1; i < sortedNoList.length; i++){
        if(rangeStart == null){
            rangeStart = sortedNoList[i];
        }
        else if(sortedNoList[i] -1 != lastNumber){
            printOutput(rangeStart, lastNumber);
            rangeStart = null;
        }
        lastNumber = sortedNoList[i];
    }
    if(rangeStart != null){
        printOutput(rangeStart, lastNumber);
    }
}

private static void printOutput(Integer rangeStart, int lastNumber){
    if(rangeStart != lastNumber){
        java.lang.System.out.println(rangeStart+" - "+lastNumber);
    }
    else{
        java.lang.System.out.println(rangeStart);
    }

	}

	public static void findConsecSeg(int rangeStart, int lastNumber, int currIndex){
		System.out.println("rangeStart:\t"+rangeStart+"\t lastNumber:\t"+lastNumber+"\t currIndex:\t "+currIndex+"\t Next No. \t"+sortedNoList[currIndex]+"\t sortedNoList.length:\t"+sortedNoList.length);
		// if(currIndex>sortedNoList.length){
		// 	System.out.println("Returning");
		// 	return;
		// }
		if(sortedNoList[currIndex]-1 !=lastNumber){
				if(rangeStart != lastNumber){
					System.out.println(rangeStart+"-"+lastNumber);

				}
				rangeStart=sortedNoList[currIndex];
				//return;
	
		}else if( currIndex==(sortedNoList.length-1)){
			
				System.out.println("For last Element:\t"+rangeStart+"-"+sortedNoList[currIndex]);
			if(rangeStart != lastNumber){
					System.out.println(rangeStart+"-"+sortedNoList[currIndex]);

				}
		}
		lastNumber=sortedNoList[currIndex];
		if(++currIndex<sortedNoList.length)
		findConsecSeg(rangeStart,lastNumber,currIndex);
		// System.out.println("Before Print rangeStart:\t"+rangeStart+"\t lastNumber:\t"+lastNumber+"\t currIndex:\t "+currIndex+"\t current No. \t"+sortedNoList[currIndex]);
		

		// rangeStart=sortedNoList[currIndex];
		// lastNumber=sortedNoList[currIndex];
		// findConsecSeg(rangeStart,lastNumber,++currIndex);

	}



}