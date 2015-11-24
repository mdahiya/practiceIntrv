// anagram.java
// creates anagrams
// to run this program: C>java AnagramApp

import java.io.*; 
class AnagramApp
{
static int size;
static int count;
static char[] arrChar = new char[3];

public static void main(String[] args){
String input="cat";
size=input.length();

	System.out.println("size:\t"+size);
	arrChar=input.toCharArray();
	for(int i=0;i<size;i++)
		System.out.print(arrChar[i]);
	doAnagrams(size);
	}

	public static void doAnagrams(int newSize){
		if(newSize==1)
			return;
		for(int i=0;i<newSize;i++){
			doAnagrams(newSize-1);
			
		if(newSize==2)
			displayWord();
		rotate(newSize);
		}	
	}

	public static void rotate(int newSize ){
		int j;
		int pos=size-newSize;
		char temp = arrChar[pos]; 
		for(j=pos+1; j<size; j++)
			arrChar[j-1] = arrChar[j]; 
		arrChar[j-1] = temp;

	}


	public static void displayWord(){
		for(int i=0;i<size;i++)
		System.out.print(arrChar[i]);
	System.out.println();
	}
} // end class AnagramApp
