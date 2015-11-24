public class SingleLinkedList{
	Node head;
	int length;

	public SingleLinkedList(){
		length=0;
	}

	public void insert(int value){
		//if head is null then add new node to head
		//else check next node in list and add Node to the next empty link.
		System.out.println("value:\t"+value);
		Node node=new Node(value);

		if(head==null){
			head=node;
			System.out.println("setting head:\t"+value);
		}else{
			Node currentNode=head;
			System.out.println("else head:\t"+currentNode.data +"\t :\t "+currentNode.next);
			while(currentNode.next != null){
				currentNode=currentNode.next;
				System.out.println("Next Node:\t"+currentNode.data);
			}
			currentNode.next=node;

		}
	}

	public void removeNode(int data){
		//remove node and join successor and predecessor of deleted node
		Node currentNode=head;
		Node parentNode=head;
		if(head.data==data){
			head=head.next;

		}else{
			while(currentNode.data != data){
				//System.out.print(currentNode.data+" , ");
				parentNode=currentNode;
				currentNode=currentNode.next;

			}
			parentNode.next=currentNode.next;
		}

	}

	public Node searchNode(int data){
		Node currentNode=head;
		while(currentNode.data != data){
				System.out.print(currentNode.data+" , ");
				currentNode=currentNode.next;

			}
			return currentNode;
	}

	//return linked List length

	public Node getHead(){
		return head;

	}

	public void removeDup(){
		if(head==null) return;
		Node currentNode=head;
		Node prevNode=head;
		currentNode=currentNode.next; 

		while(currentNode != null){
				Node runner=head;
				while (runner != currentNode){
					System.out.println(runner.data+":"+ currentNode.data);
					if(runner.data==currentNode.data){
						Node tmp=currentNode.next;
						prevNode.next=tmp;
						currentNode=tmp;
						break;
					}//if
					runner=runner.next;

				}//inner while
				if(runner==currentNode){
					prevNode=currentNode;
					currentNode=currentNode.next;
				}
			}//outer while 
	}

	public void printLinkedList(){
		Node currentNode=head;
		while(currentNode != null){
				System.out.print(currentNode.data+" , ");
				currentNode=currentNode.next;

			}
			System.out.println();

	}

	public SingleLinkedList addLLDigits(SingleLinkedList ll1, SingleLinkedList ll2){
		SingleLinkedList sumList= new SingleLinkedList();
		return sumList;
	}

	public static void main(String[] args){
		SingleLinkedList singleLinkedList=new SingleLinkedList();
		singleLinkedList.insert(1);
		singleLinkedList.insert(2);
		singleLinkedList.insert(1);
		singleLinkedList.insert(4);
		
		singleLinkedList.printLinkedList();
		//singleLinkedList.removeNode(1);

		//singleLinkedList.printLinkedList();
		singleLinkedList.removeDup();

		singleLinkedList.printLinkedList();
		
	}


}

class Node{
	Node next;
	int data;

	public Node(int data){
		this.data=data;
		this.next=null;
	}

}