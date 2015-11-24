
import java.util.*;
import java.io.*;
public class TestPlayersRecord{
private enum Operation{INSERT,SEARCH,DELETE,PRINT,EXIT};


public static void main(String[] args){
processPlayers();
	
	
}

public static void processPlayers(){
	Operation operation=Operation.INSERT;
	PlayersRecord playerRec=new PlayersRecord(10); 
	try{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Options: INSERT \t  SEARCH \t,  DELETE \t, EXIT");

		do{
		try{	
			operation=Operation.valueOf(br.readLine());
		}catch(IllegalArgumentException il){
			System.out.println("Please enter valid arguement.");

		}
		switch(operation){
			case INSERT:acceptUserInput();playerRec.addSortedPlayer(br.readLine());break;
			case SEARCH:acceptUserInput();System.out.println(playerRec.searchSortedArray(br.readLine(),playerRec.getCurrIndex(),0));break;
			case DELETE:acceptUserInput();playerRec.deletePlayer(br.readLine()); break;
			case PRINT:acceptUserInput();playerRec.printArray(); break; 	
			
			default:System.out.println("Unsupported Operation"); break;
			
			}
		}while(operation!=Operation.EXIT);

	}catch (IOException io){
		System.out.println(io);
	}

	
}

public static void acceptUserInput(){
	System.out.print("Enter Player Name:\t");
}

}