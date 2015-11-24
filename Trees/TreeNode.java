public class TreeNode{
	private TreeNode parentNode;
	private TreeNode leftNode;
	private TreeNode rightNode;
	private int data;

	public TreeNode(int e){
		this.data=e;
	}
	public void setLeftNode(TreeNode leftNode){
		this.leftNode=leftNode;
	}
	
	public void setRightNode(TreeNode rightNode){
		this.rightNode=rightNode;

	}

	private void setParentNode(TreeNode parentNode){
		this.parentNode=parentNode;
	}

	public void setData(int data){
		this.data=data;
	}

	public TreeNode getLeftNode(){
		return leftNode;
	}

	public TreeNode getRightNode(){
		return rightNode;
	}

	public TreeNode getParentNode(){
		return this.parentNode;
	}

	public int getData(){
		return this.data;
	}



	
}