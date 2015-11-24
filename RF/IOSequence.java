 
import java.io.*;
import java.util.*;

public class IOSequence{
	
	public static void main(String[] args){
		//scan input data	
		List<Info> infoList=scanInputData();
		//sort infoList by diff
		Collections.sort(infoList,new Comparator<Info>(){
			public int compare(Info a, Info b){
				if(a.diff==b.diff){
					return (int) (a.racerID-b.racerID);

				}else{
					return (int) (a.diff-b.diff);
				}
			}
		});

		System.out.println(infoList);

	}

	private void readDataIO(){
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String s;
		try{
		while((s=in.readLine())!=null && s.length() !=0){
			System.out.println(s);
			}
		}catch(IOException io){
		io.printStackTrace();
		}
	}

	private void readDataConsole(){
		 Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }

        String login = c.readLine("Enter your login: ");

	}

	private static List<Info> scanInputData(){
		Scanner scan =new Scanner(System.in);
		int count=scan.nextInt();
		List<Info> infoList=new ArrayList<Info>();

		while(count>0){
			infoList.add(new Info(scan.nextInt(),scan.nextInt(),scan.nextInt()));
	
			count--;
		}

		return infoList;

	}



}

class Info{
	int racerID;
	int startTime;
	int endTime;
	int diff;


	public Info(int racerID, int startTime, int endTime){
		this.racerID=racerID;
		this.startTime=startTime;
		this.endTime=endTime;
		this.diff=this.endTime-this.startTime;//assumption startime is less than end time
	}

	public int getRacerID(){
		return this.racerID;
	}

	public int getStartTime(){
		return this.startTime;
	}

	public int getEndTime(){
		return this.endTime;
	}

	public int getDiff(){
		return this.diff;
	}

	public String toString(){
		return this.racerID+" - "+this.startTime+" - "+this.endTime+" - "+this.diff;
	}

}