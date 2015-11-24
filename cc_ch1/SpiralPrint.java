
/*
* Class to Print Array Object in Spiral Pattern
* 
*/

public class SpiralPrint{
	
	public static void main(String[] args){
		int[][] intArray={{1,2,3},{4,5,6},{7,8,9}};
		spriralPrint(intArray,3,3);
	}


	public static void spriralPrint(int[][] arr, int rows,int columns){

		int topRow=0;
		int bottomRow=rows-1;
		int firstCol=0;
		int lastCol=columns-1;
		int dir=0;
		
		while(topRow<=bottomRow & firstCol<=lastCol){

			if(dir==0){
				//Print top row  -- first row -- 0---n [0][0..n]
				for(int i=firstCol;i<=lastCol;i++){
					System.out.println(arr[topRow][i]);
				}
				topRow++;
				dir=1;
			}
			if(dir==1){
				//print last column -- n....n [0....n][n]
				for(int i=topRow;i<=bottomRow;i++){
					System.out.println(arr[i][lastCol]);
				}
				lastCol--;
				dir=2;
			}
			if(dir==2){
				//print last row [n][n...0]
				for(int i=lastCol;i>=firstCol;i--){
					System.out.println(arr[bottomRow][i]);
				}
				bottomRow--;
				dir=3;
			}
			if(dir==3){
					//print first column[n..1][0]
				for(int i=bottomRow;i>=topRow;i--){
					System.out.println(arr[i][firstCol]);
				}
				firstCol++;
				dir=0;
			}


		}
		


	}



}