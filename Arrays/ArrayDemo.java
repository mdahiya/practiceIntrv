import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
public class ArrayDemo{

	public static void main(String[] args){

		dummyArray();
	}

	public static void dummyArray(){
		//initialize empty array

		List<? extends Integer> c = new ArrayList<Integer>();
		String str=new String("Manish");
		//c.add(new Integer(0)); // Compile time error


		int[] intArray=new int [10];
		//intArray={1,2,3,4,5,6,7,8,9,10};
		intArray[0]=1;
		intArray[1]=2;
		printArray(intArray);
		create2DArray();

	}

	public static void create2DArray(){
		String[][] cal={{"MON","TUE","WED","THUR","FRI","SAT","SUN"},{"10","11","12","13","14","15","16"}};
		print2DArray(cal);
	}


	public static void create3DArray(){

	}

	public static void printArray(int[] intArray){

		for (int number:intArray){
				System.out.print("num: \t"+number);
			}
	}


	public static void print2DArray(String[][] _2DArray){
		for(String[] day:_2DArray){
			for (String date: day){
				System.out.println("Date: "+date);

			}
		}
	}

}