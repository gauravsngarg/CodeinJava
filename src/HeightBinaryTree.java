
public class HeightBinaryTree {

	private BinaryTreeNode root;

//	public static void main(String[] args) {
//		int data[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		int N = data.length;
//		HeightBinaryTree ob = new HeightBinaryTree();
//	
//		ob.root = new BinaryTreeNode(data[0]);
//
//		for (int i = 1; i < data.length; i++) {
//			ob.insert(data[i]);
//		}
//
//	}

	private void insert(int data) {
		root = insert(root,data);
		// TODO Auto-generated method stub
		
	}

	public boolean isEmpty(BinaryTreeNode root) {
		return root == null;

	}

	public BinaryTreeNode insert(BinaryTreeNode node, int data) {
		if (node == null) {
			node = new BinaryTreeNode(data);
			return node;
		}  else {

			if (node.getLeft() == null) {
				node = insert(node.left, data);
			} else if (node.right == null) {
				node = insert(node.right, data);
			}

		}
		return node;

	}
	public int HeightofBT(BinaryTreeNode node){
		if(node== null){
			return 0;
		}
		int lefttreelength = HeightofBT(node.left);
		int righttreelength = HeightofBT(node.right);
		
		if(lefttreelength > righttreelength){
			return lefttreelength+1;
		}
		else return righttreelength+1;
			
	}

}
