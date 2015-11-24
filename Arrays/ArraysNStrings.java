import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ArraysNStrings{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String testString;
    try{
			if(args.length > 1){
				testString=args[0];
			}else{
				System.out.println("Please enter input String: ");
				testString=br.readLine();
				System.out.println(testString);
				
				
			}
		}catch(IOException io){
			io.printStackTrace();
			throw(io);
		}
		//Check string for uniqueness
		//for(int i=0;i<testString.length();i++){
			char[] strArray=testString.toCharArray();
			System.out.println(isUnique(strArray[0], 1,strArray));

			//testString.replace(' ','%');
			System.out.println(testString);
			//revString(testString);
			//revInPlace(testString);
			//removeDup(strArray);
			//removeDup2(strArray);
			//replaceSpaceInStr();
		//}
	}

	//Write a recursive function to iterate through string and find if at matches any other character
	public static boolean isUnique(char startChar, int startIndex, char[] testString){
		System.out.println("startChar: \t"+startChar+"\t startIndex \t"+startIndex+"\t length \t"+testString.length);
		if(startIndex>=testString.length-1)
				return true;
		for(int index=startIndex;index<testString.length;index++){
			System.out.print("testString[index]: \t"+testString[index]+"\t");//+startChar.getNumericValue()+"\t"
			if(startChar==testString[index])
				return false;
		}		
			System.out.println("==========================================\r\n");
			
			return isUnique(testString[startIndex],startIndex+1,testString);	

			

	}

	public static boolean isUnique2(String testString){
		boolean[] uniCodeArray=new boolean[256];
		for(int index=0;index<testString.length();index++){
					int val=testString.charAt(index);
						System.out.println("Values: \t"+val+"\t"+testString	.charAt(index));
						if(uniCodeArray[val]) return false;
						uniCodeArray[val] =true;
				}
				return true;

	}

	public static String revString(String orgStr){
		String revStr="";
		for (int index=orgStr.length()-1;index >= 0;index--){
			revStr +=orgStr.charAt(index);

		}
		System.out.println("Reverse:\t"+revStr);
		return null;
	}

	public static String revInPlace(String orgStr){
		char[] orgStrArray = orgStr.toCharArray();
		char currChar;
		for (int i=0,j=orgStrArray.length-1;i< orgStrArray.length/2;i++,j--){
			currChar=orgStrArray[i];
			orgStrArray[i]=orgStrArray[j];
			orgStrArray[j]=currChar;
		}
		System.out.println("Reverse:\t"+String.valueOf(orgStrArray));
		return null;
	}

	public static void removeDup(char[] orgStr){
		int tail=1;
		for (int i=0;i<orgStr.length;i++){//iterate over all charactes
			for (int j=i+1;j<orgStr.length;j++){//check against all other characters
				if(orgStr[i]==orgStr[j]){
					orgStr[j]=0;
				}

			}
		}
		System.out.println("My Duplicate:\t"+String.valueOf(orgStr));

	}
public static void removeDup2(char[] orgStr){
		int tail=1;
		for (int i=1;i<orgStr.length;i++){//iterate over all charactes
			System.out.println("i:\t"+i+"\t tail:"+tail);
			for (int j=0;j<tail;j++){//check against all other characters
				System.out.println("j:\t"+j+"\t orgStr[i]:"+orgStr[i]+"\t orgStr[j]:"+orgStr[j]);
				if(orgStr[i]==orgStr[j]){
					break;
				}
				if(j==tail){//NON -DUPLICATE 

					orgStr[tail]=orgStr[i];
					System.out.println("in Tail if block:\t"+String.valueOf(orgStr));

					++tail;
				}

			}
		}
		System.out.println("Duplicate before tail:\t"+String.valueOf(orgStr));

		orgStr[tail]=0;
		System.out.println("Duplicate:\t"+String.valueOf(orgStr));

	}



}