public class TestTree{
	public static void main(String[] args){
		BinaryTree bt=new BinaryTree();
		bt.insert(20);
		bt.insert(15);
		bt.insert(10);
		bt.insert(17);
		bt.insert(40);
		bt.insert(30);
		bt.insert(28);
		bt.insert(45);
		bt.insert(50);

		bt.inOrderTraversal(bt.find(20));

		//cutTree(17,28);
	}

	private static void cutTree(int min, int max){
		
	}

}