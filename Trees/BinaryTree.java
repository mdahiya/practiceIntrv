public class BinaryTree{
	TreeNode root;


public void insert(int e){
	
	TreeNode newNode=new TreeNode(e);

	//if rootNode is null set first item as Root Item
	if(root==null){
		root=newNode;
	}else{
		//find the insertion point 
		//if data is greater than root node then it goes to right side else left side
		TreeNode currentNode=root;
		TreeNode parentNode;
		while(true){
			parentNode=currentNode;
			System.out.println("Print Current Node Data:\t"+currentNode.getData());
		if(e < currentNode.getData()){
			//Traverse left
			currentNode=currentNode.getLeftNode();
			if(currentNode==null){
				parentNode.setLeftNode(newNode);
				return;

			}
		
		}else{
			//parentNode=currentNode;
			//Traverse Right
			currentNode=currentNode.getRightNode();
			if(currentNode==null){
				parentNode.setRightNode(newNode);
				return;
			}
		
		}

			
	}

	}


}	

public void delete(int e){
	TreeNode currentNode=root;
	TreeNode parentNode=root;
	boolean isLeftChild = true;
		//parentNode=currentNode;
		while(currentNode.getData() !=e){
			parentNode=currentNode;
			if(e<currentNode.getData()){
				//Traverse left
				isLeftChild=true;
				currentNode=currentNode.getLeftNode();
		
			}else{
				//Traverse Right
				currentNode=currentNode.getRightNode();
				isLeftChild=false;
			}


		}//while loop

		if(currentNode.getLeftNode()==null && currentNode.getRightNode()==null){
			if(currentNode==root)
				root=null;
			//remove node 
			if(isLeftChild)
				parentNode.setLeftNode(null);
			else
				parentNode.setRightNode(null);


		}else if(currentNode.getLeftNode()==null){//left child is null but right child is not null
			if(currentNode==root){
				root=currentNode.getRightNode();
			}else if(isLeftChild){
				parentNode.setLeftNode(currentNode.getRightNode());
			}else{
				parentNode.setRightNode(currentNode.getRightNode());
			}
		}else if(currentNode.getRightNode()==null){//right child is null but left child is not null
			if(currentNode==root){
				root=currentNode.getLeftNode();
			}else if(isLeftChild){
				parentNode.setLeftNode(currentNode.getLeftNode());
			}else{
				parentNode.setRightNode(currentNode.getLeftNode());
			}
		}else{//if both childs are present
			if(currentNode==root){
				root=currentNode.getLeftNode();
			}else{
				parentNode.setLeftNode(currentNode.getLeftNode());
			parentNode.setRightNode(currentNode.getRightNode());	
			}
			
		
		}
 
}

public TreeNode findSucessor(TreeNode currentNode){
	if(currentNode.getLeftNode()==null){
		return currentNode;
	}
	findSucessor(currentNode.getLeftNode());
	return null;
}

public TreeNode find(int e){
	
	TreeNode currentNode=root;
	///iterate left  all data in a tree
	//Traverse all left side nodes ---then traverse back to display all right side node
	while(currentNode.getData() !=e){
		if(e<currentNode.getData()){
			//Traverse left
			currentNode=currentNode.getLeftNode();
		
		}else{
			//Traverse Right
			currentNode=currentNode.getRightNode();
		
		}
		if(currentNode==null)
			return null;

	}
	return currentNode;
	

	//Print left No

}

public void inOrderTraversal(TreeNode startNode){

	if(startNode !=null){
		inOrderTraversal(startNode.getLeftNode());
		System.out.println(startNode.getData());
		inOrderTraversal(startNode.getRightNode());
		
	}
	//Left Leaf Node is reached print


}

public void display(){
	TreeNode currentNode=root;
	//print all data in a tree
	//Traverse all left side nodes ---then traverse back to display all right side node
	while(currentNode.getLeftNode() !=null){
		currentNode=currentNode.getLeftNode();
	}
	//Print left Node



}


	
}