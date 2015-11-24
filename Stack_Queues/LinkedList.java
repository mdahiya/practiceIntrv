public class LinkedList{
	private Node head;
	private int size;
	//private Node tail;
	public LinkedList(){
		//this.head=new Node();
		//this.size=0;
	}

	public void insert(int e){
		Node node=new Node();
		node.setData(e);
		node.setNext(new Node());
		Node temp;
		if(isEmpty){
			head=node;

		}else{
			
		}
		if(head==null){//first element
			head=node;
		}else{//get insertion point
			while(temp.next !=null){
				temp=temp.next;
			}
			temp.next=node;


		}
		
		size++;


	}

	public void remove(int e){
		//to remove we need link the chain to previous node and next node
		Node prevNode;
		Node nextNode;
		Node temp=head;
		
		while(temp.next !=null){
			
			if(temp.getData.equals(e)){


			}
		}
		size--;

	}

	public boolean isEmpty(){
		return if(head.next==null);
	}


	public int size(){
		return size;

	}

	public Node search(int e){
		Node node=head;
		while(node.next !=null){
			if(node.getData().equals(e)){
				return node;	
			}

		}
		return null;

	}

	

}