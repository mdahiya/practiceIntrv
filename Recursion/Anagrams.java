public class Anagrams{

static char[] word={'c','a','t','s'};

public static void main(String[] args){
	doAnagrams(word.length);
	

}

public static void doAnagrams(int len){
	if(len==1){
		return;
	}
	//
	for (int i=0;i<len;i++){
		doAnagrams(len-1);
		if(len==2){
			displayWord();
		}
		rotateWord(len);
	}
	

}

public static void displayWord(){
   System.out.println(word);
}

public static void rotateWord(int len){
	//char[] charArray=word.toCharArray();
	int stPos=word.length-len;
	char temp=word[stPos];
	 	
	for(int i=stPos+1;i<word.length;i++){
		word[i-1]=word[i];

	}	
	word[word.length-1]=temp;
	//System.out.println(word);
}
	


}