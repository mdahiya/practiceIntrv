/**write a function which takes a string as input and provide list of all combinations of characters in the string
	
“ab” -> { “ab”, “ba” }-

“abc”-->{bca,cab,abc,bac,cba
**/
import java.util.*;

public class RF2{

	public static void main(String[] args){
		countAlphabet("aaaasdsdsasdadasdasdas");
	}

	public List<String> makeAnagrams(String inpStr){
		//convert to char Array
		char[] charArr=inpStr.toCharArray();
		List<String> anagrams=new ArrayList<String>();
		//rotate word once iterated over all combinations
		int out=charArr.length;
		do{
		
			//iterate over char array for all possible combinations
			for(int i=0;i<charArr.length;i++){//ab length =3, 
				StringBuilder sb =new StringBuilder();
				sb.append(charArr,i+1,charArr.length-(i+1));//
				//will take first character and position it in all places then second and so
				for(int j=0;j<i;j++){//inner loop for attaching to end 
                                 
					sb.append(charArr[j]);//abc
	
				}
				anagrams.add(sb.toString());
			}
			//rotate()//swap first to the last for next iteration
			out--;
		}while(out>1);
	return anagrams;
	
	}

/***2. “aaaasdsdsasdadasdasdas”
//convert string to char[] array

//getHash Method - based on characters -- range of index 

//create an 2D array of size of 52 size( lower and upper)

//fill it with zeros

//add these characters - check  if alphabet exist then increment count in array
**/

public static void countAlphabet(String inpStr){
	char[] charArr= inpStr.toCharArray();
	int[][] cntArray=new int[52][2];
	for(int i=0;i<charArr.length;i++){
		char chr=charArr[i];//unicode - assume it’s from 0 
		System.out.println((int)chr);
			int index=(int)chr-97;
		int currCnt=cntArray[index][1];
		if(cntArray[index][0]==chr){//already exit
			currCnt++;
			cntArray[index][1]=currCnt;

		}else{//initial
			cntArray[index][0]=chr;
			currCnt=1;

			cntArray[index][1]=currCnt;
		}
	}
	//print output
	for(int i=0;i<52;i++){
		if(cntArray[i][1] !=0)
		System.out.println("Alphabet: "+ (((char)cntArray[i][0]))+"\t count: "+ cntArray[i][1]);	
	}
	
	
}

}


