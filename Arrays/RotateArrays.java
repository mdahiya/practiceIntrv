public class RotateArrays{
	public static void main(String[] args){

		//Call Parity
		System.out.println(checkParity(100));

	}


	public static void rotateArray(int[][] matrix,int n){
		for(int layer=0;layer<n/2;layer++){
			int first=layer;
			int last =n-1-layer;
			for(int i=first;i<last;i++){
				int offset=i-first;
				int top=matrix[first][i];
				matrix[first][i]=matrix[last-offset][first];
			}
		}
	}

 
	public static short checkParity(long x){
		short result=0;

		while(x>0){
			result+=(x & 1);
			x >>=1;
			System.out.println("X: \t"+x+"\t result :"+result);
		}
		return (short) (result%2);
	}
}