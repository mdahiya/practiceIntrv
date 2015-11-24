import java.util.List;
import java.util.ArrayList;

public class Anagrams{
	
	public boolean searchStrStr(String needle,String hayStack){
		getAnagrams(needle);


		return false;
	}

	public List<List<String>> getAnagrams(String needle){
		List<List<String>> anagramsList=new ArrayList<List<String>>();
		List<String> list=new ArrayList<String>();


		//list.add(needle);
		//create String anagrams
		char[] strArray=needle.toCharArray();
		int n =strArray.length;
		System.out.println("Length of needle: \t"+n);
		for(int outer=0;outer<n;outer++){

			for(int i=0;i<n;i++){
				//String subStr=needle.substring(i+1);
				StringBuilder sb=new StringBuilder();
				System.out.println("Offset : \t"+(i+1)+"\t Length: \t "+(n-(i+1)));
				sb.append(strArray,i+1,n-((i+1)));
				for(int j=0;j<=i;j++){
						sb.append(strArray[j]);
					}

				list.add(sb.toString());	
			}//inner

		}//outer

		System.out.println(list);
		return anagramsList;
	}

	static void makeAnagram(char[] a, int i) {
		System.out.println("MakeAnagram i=" + i); //for debug
		if (i == a.length-1){
			System.out.println("i == a.length-1 i=" + i+"a length"+(a.length-1)); //for debug
			printArray(a);
		}  
		else {
			for (int j=i; j< a.length; j++) {
				//swap a[i] with a[j]
				System.out.println("Swap i=\t" + i+"\t j:"+j+"\t a[i]:\t"+a[i]+"\t a[j]:\t"+a[j]); //for debug
				char c = a[i]; 
				a[i] = a[j]; 
				a[j] = c;
				System.out.println("before recursion");
				printArray(a);
				makeAnagram(a, i+1);
				System.out.println("after recursion");
				printArray(a);
				//swap back
				c = a[i]; 
				a[i] = a[j]; 
				a[j] = c;
				System.out.println("End:");
				printArray(a);
			}
		}
	}//end of makeAnagram
//print an array
	static void printArray(char [] a) {
		for (int i=0; i< a.length; i++) System.out.print(a[i]); 
		System.out.println();
	} //end of printArray

	public static void main(String[] args){
		 StringBuilder str = new StringBuilder("amrood ");
   System.out.println("string = " + str);
    
   // char array
   char[] cArr = new char[]
   {'a','d','m','i','n','i','s','t','r','a','t','o','r'};
	
   /* appends the string representation of char array argument to
   this StringBuilder with offset at index 0 and length as 5 */
   str.append(cArr, 1, 5);
   char[] str1={'c','a','t'};
	makeAnagram(str1,0);
   // print the StringBuilder after appending
   System.out.println("After append = " + str);
		Anagrams anagrams=new Anagrams();
		anagrams.searchStrStr("atc","beecat");
	}




}