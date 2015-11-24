
import java.util.*;
import java.io.*;

public class PlayersRecordObj{

private Player[] playersRecord;
private int currIndex;
private int max;

	
public PlayersRecordObj(int max){
	this.playersRecord=new Player[max];
	this.max=max;
}


public void addPlayer(Player player){
	System.out.println("Adding Player:\t"+player.getName());
	Player playerObj=new Player(player.getName(),player.getJerseyNo(),player.getAge(),player.getRecruitmentYear());
	playersRecord[currIndex]=playerObj;
	currIndex++;

}

public int searchPlayer(Player player){

	System.out.println("Searching Player:\t"+player.getName());
	int plyrIndex=0;
	for(Player plyr:playersRecord){
		
		if(player.equals(plyr)) {
			System.out.println("Player Found!! at Index:\t"+plyrIndex);
			return plyrIndex;
		}
		plyrIndex++;

	}
	return -(plyrIndex);
}

public boolean deletePlayer(Player playerObj){
	System.out.println("Deleting Player:\t"+playerObj.getName()	);
	//Find Index of Player to be deleted
	int delIdx=searchPlayer(playerObj);
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

public void addSortedPlayer(Player playerObj){
	//iterate through array
	int insertionIndex=0;
	int nextIndex;
	if(currIndex==0){
		playersRecord[0]=playerObj;
		currIndex++;
		return;
	}

	for(Player ply: playersRecord){
		//Compare String and find insertion point
		if(ply.getName().compareTo(playerObj.getName())>0){//NEW PLAYERNAME IS LESS THAN EXISTING
			break;		
		}else if(ply.getName().compareTo(playerObj.getName())==0){
			System.out.println("Duplciate not allowed!!");
			return;
		}
		insertionIndex++;

	}
	
	for(int i=currIndex;i>insertionIndex;i--){
		playersRecord[i]=playersRecord[i-1];


	}
	playersRecord[insertionIndex]=playerObj;
	currIndex++;

	//find insertion position - check if not greater than max.


}

public int searchSortedArray(Player playerObj, int upperBound,int lowerBound){

	if(playerObj.getName().compareTo(playersRecord[(upperBound+lowerBound)/2].getName())==0){
		return  (upperBound+lowerBound)/2;
	}else if(playerObj.getName().compareTo(playersRecord[(upperBound+lowerBound)/2].getName())>0){
		return searchSortedArray(playerObj,upperBound,(upperBound+lowerBound)/2);
	}else{
	return searchSortedArray(playerObj,(upperBound+lowerBound)/2,lowerBound);

	}	

}

public int getCurrIndex(){
	return this.currIndex;

}
public void printArray(){
	System.out.println("======================Player List=====================");
	for(Player player:playersRecord){
		System.out.println("Player Name: \t"+player.getName());
	}
}


private boolean checkEmptyOrNullStr(String str){
	return (str == null) ? true: (str == " ") ? true:false;
}



}