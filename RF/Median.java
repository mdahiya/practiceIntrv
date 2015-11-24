/**
 Q. 

You are given two arrays A and B
Each has exactly N integers (with possible duplicates)
Assume they are in sorted order in each

You need to:
Write a routine/method to find the median of the combined set of 2N numbers.
This needs to be an API that others will call
It needs to be as efficient as possible,
Must not crash or return ambiguous results

Examples: 
 (1,2,3), (4,5,6)  ==> (3+4)/2 = 3.5
 (1,3,5), (2,4,6)  ==> (3+4)/2 3.5
 (1,1,1), (1,1,1)  ==> 1
 (1,2,4), (3,5,6)  ==> (3+4)/2 = 3.5
 (1,7,8), (2,3,4)  ==> (3+4)/2 = 3.5

A ={ 1,2,3, 4,5}
B= { 2,4,6,7,8} == heap (2- root--4, 6 and
< 1, 2, 2, 3, 4, 4, 5,6, 7, 8> 
Median = even middle value and odd - sum of middle/2

**/

public class Median{

public int getMedian(int[] arrA, int[] arrB){
    int[] mergeArray=getMergedArray(arrA, arrB);
    
    if(mergeArray.length mod 2==0){
      //return sum of middle values divide by 2
     return mergeArray[(mergeArraymergeArray.length/2)-1]+mergeArray[(mergeArraymergeArray.length/2)];
    }else{
    //return middle value
     return mergeArray[(mergeArraymergeArray.length/2)];
    }
}

privaterivate int getMergedArray(int[] arrA, int[] arrB){
int[] mergeArray= new int[arrA.length+arrB.length];//initialize array 
int arrACurrIDX=0;//current index for arrA
int arrBCurrIDX=0;//current Index for arrB
for(int i=0;i<mergeArray.length;i++){

   if(arrA.length>i && arrB.length>i){ 
      int tempA=arrA[arrACurrIDX]; //taking temp valuyes
      int tempB=arrB[arrBCurrIDX];//taking temp values from B
      if(tempA>tempB){
          mergeArray[i]=tempB;
          arrBCurrIDX++;
      }else{
          mergeArray[i]=tempA;
          arrACurrIDX++;
      
      }
    }
    else if(arrA.length>i){//Check if Array A index is greater than current I
         while(arrACurrIDX<arrA.length){
             //add to the merge array
             mergeArray[i]=arrA[arrACurrIDX];
             i++;
             arrACurrIDX++;
             
         }
         break;
         
     }
     else if(arrB.length>i){//Check if Array B index is greater than current I
      while(arrBCurrIDX<arrB.length){
             //add to the merge array
             mergeArray[i]=arrB[arrBCurrIDX];
             i++;
             arrBCurrIDX++arrBCurrIDX++
             
             
         }
         break;
     }
     
       
  return mergeArray;
  
}


}

}