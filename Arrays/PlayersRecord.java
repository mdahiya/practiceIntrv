
import java.util.*;
import java.io.*;

public class PlayersRecord{

private String[] playersRecord;
private int currIndex;
private int max;

	
public PlayersRecord(int max){
	this.playersRecord=new String[max];
	this.max=max;
}


public void addPlayer(String playerName){
	System.out.println("Adding Player:\t"+playerName);
	playersRecord[currIndex]=playerName;
	currIndex++;

}

public int searchPlayer(String playerName){

	System.out.println("Searching Player:\t"+playerName);
	int plyrIndex=0;
	for(String pName:playersRecord){
		
		if(playerName.equals(pName)) {
			System.out.println("Player Found!! at Index:\t"+plyrIndex);
			return plyrIndex;
		}
		plyrIndex++;

	}
	return -(plyrIndex);
}

public boolean deletePlayer(String playerName){
	System.out.println("Deleting Player:\t"+playerName);
	//Find Index of Player to be deleted
	int delIdx=searchPlayer(playerName);
	//if index is -ve return player not found
	if(delIdx<0){
		System.out.println("Player not found!!");return false;
	}else{//else iterate and replace all items higher than returned index

		for(int i=delIdx;i<currIndex;i++){
			playersRecord[i]=playersRecord[i+1];
			if(i==currIndex) {
				playersRecord[i]=null;
				break;
			}
		}
		currIndex--;
	}
	printArray();
	return true;



}

public void addSortedPlayer(String playerName){
	//iterate through array
	int insertionIndex=0;
	int nextIndex;
	if(currIndex==0){
		playersRecord[0]=playerName;
		currIndex++;
		return;
	}

	for(String plyrName: playersRecord){
		//Compare String and find insertion point
		if(plyrName.compareTo(playerName)>0){//NEW PLAYERNAME IS LESS THAN EXISTING
			break;		
		}else if(plyrName.compareTo(playerName)==0){
			System.out.println("Duplciate not allowed!!");
			return;
		}
		insertionIndex++;

	}
	
	for(int i=currIndex;i>insertionIndex;i--){
		playersRecord[i]=playersRecord[i-1];


	}
	playersRecord[insertionIndex]=playerName;
	currIndex++;

	//find insertion position - check if not greater than max.


}

public int searchSortedArray(String playerName, int upperBound,int lowerBound){

	if(playerName.compareTo(playersRecord[(upperBound+lowerBound)/2])==0){
		return  (upperBound+lowerBound)/2;
	}else if(playerName.compareTo(playersRecord[(upperBound+lowerBound)/2])>0){
		return searchSortedArray(playerName,upperBound,(upperBound+lowerBound)/2);
	}else{
	return searchSortedArray(playerName,(upperBound+lowerBound)/2,lowerBound);

	}	

}

public int getCurrIndex(){
	return this.currIndex;

}
public void printArray(){
	System.out.println("======================Player List=====================");
	for(String pName:playersRecord){
		System.out.println("Player Name: \t"+pName);
	}
}


private boolean checkEmptyOrNullStr(String str){
	return (str == null) ? true: (str == " ") ? true:false;
}



}