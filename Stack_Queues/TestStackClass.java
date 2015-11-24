public class TestStackClass{
	
	public static void main(String[] args){

		StackClass sc=new StackClass(10);
		for(int i=0;i<10;i++){
			sc.push(i);
		}
		sc.displayStackData();
		sc.printTop();
		for(int i=0;i<10;i++){
			System.out.println(sc.pop());
		}

	}
}