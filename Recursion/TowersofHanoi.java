public class TowersofHanoi{
	
	public static void main(String[] args){
		doTowers(3,'A', 'B', 'C');
	}

	public static void doTowers(int topN,char from, char inter, char to)
	{ 
		 System.out.println("# Disks " + topN +" from " + from+" inter " + inter  + " to "+ to);	
		if(topN==1){
			System.out.println(" Disk 1 from "  + from + " to "+ to); 	
		}else{
			doTowers(topN-1, from, to, inter); // from-->inter
			 System.out.println("Disk " + topN +" from " + from + " to "+ to);
			doTowers(topN-1, inter, from, to); // inter-->to
		}
	}

}