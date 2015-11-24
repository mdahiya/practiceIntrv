	
import java.util.*;
import java.io.*;
public class TestPlayersRecordObj{
private enum Operation{INSERT,SEARCH,DELETE,PRINT,EXIT};


public static void main(String[] args){
processPlayers();
	
	
}

public static void processPlayers(){
	Operation operation=Operation.INSERT;
	PlayersRecordObj playerRec=new PlayersRecordObj(10); 

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
			case INSERT:
				playerRec.addSortedPlayer(	());break;
			case SEARCH:acceptUserInput();System.out.println(playerRec.searchSortedArray(getPlayerDetails(),playerRec.getCurrIndex(),0));break;
			case DELETE:acceptUserInput();playerRec.deletePlayer(getPlayerDetails()); break;
			case PRINT:acceptUserInput();playerRec.printArray(); break; 	
			
			default:System.out.println("Unsupported Operation"); break;
			
			}
		}while(operation!=Operation.EXIT);

	}catch (IOException io){
		System.out.println(io);
	}

	
}

public static PlayersRecordObj getPlayerDetails(){
	PlayersRecordObj playerRec=new PlayersRecordObj();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Player Name:\t");
	playerRec.setName(scanner.nextLine());
	System.out.println("ENTERED PLAYER NAME IS:\t"+playerRec.getName());
	//scanner.nextline();
	System.out.println("Enter Player jerseyNo:\t");
	playerRec.setJerseyNo(scanner.nextInt());
	//scanner.nextline();
	System.out.println("Enter Player Age:\t");
	playerRec.setAge(scanner.nextInt());
	//scanner.nextline();
	System.out.println("Enter Player RecruitmentYear:\t");
	playerRec.setRecruitmentYear(scanner.nextInt());
	//scanner.nextline();
}



}