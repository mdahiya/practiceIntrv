public class StackClass{
	private int[] stackArray;
	private int top;
	public StackClass(int max){
		stackArray=new int[max];
		top=0;
	}

	public void push(int item){
		stackArray[top]=item;
		top++;
	}

	public int pop(){
		int item=stackArray[top-1];
		top--;
		return item;
	}

	public void printTop(){
		System.out.println(top);
	}

	public void displayStackData(){
		for(int e:stackArray)
				System.out.println(e);
	}


}