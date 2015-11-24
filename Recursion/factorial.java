public class factorial{

public static void main(String[] args){
	System.out.println(calcFactorial(5));
}

public static int calcFactorial(int n){
	if(n==0){
		return 1;
	}
	//System.out.println(n*(n-1));
	 System.out.println(n*calcFactorial(n-1));
	return n;

}

	
}