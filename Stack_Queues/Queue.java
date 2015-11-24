import java.util.Stack;
import java.util.LinkedList;
import java.util.ArrayList;
/**
* Using two stacks
*/

public class Queue{
 	int rear=0;
 	int front=0;
 	Stack<Integer> stack1=new Stack<Integer>();
 	Stack<Integer> stack2=new Stack<Integer>();
 	
 	public void push(int data){
 		if(stack1.isEmpty()){//Queue is empty

 			stack1.push(data);

 				System.out.println("Pushed first element to Stack1:\t "+stack1.peek());
 		}else{
 			//Push data from stack 1 on to stack2 
 			while(!stack1.isEmpty()){
 				System.out.println("Moving to Stack2:\t "+stack1.peek()+"\t stack1.size():\t "+stack1.size());
 				stack2.push(stack1.pop());
 			}

 			stack1.push(data);
 			System.out.println("New value added to stack1:\t "+stack1.peek()+"\t stack1.size():\t "+stack1.size()+"\t stack2.size():\t "+stack2.size());
 			while(!stack2.isEmpty()){
 				System.out.println("Re- move to Stack1:\t "+stack2.peek()+"\t stack2.size():\t "+stack2.size());
 				stack1.push(stack2.pop());
 			}
 		}
 	}

 	public boolean delete(){
 		return false;

 	}

 	public int peek(){
 		return stack1.peek();
 	}	

 	public boolean isFull(){
 		return false;
 	}

 	public boolean isEmpty(){
 		return true;
 	}
  
  	public int size(){
  		return 0;
  	}

  	public static void main(String[] args){
  		Queue queue=new Queue();
  		queue.push(1);
  		queue.push(2);
  		queue.push(3);
  		while(!queue.stack1.isEmpty()){
 				System.out.println(queue.stack1.size()+" : "+queue.stack1.pop());
 			}
  			
  	}



}