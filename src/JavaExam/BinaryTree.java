package JavaExam;

public class BinaryTree {

	Node root;

	public void insert(int data) {
		root = insertRec(this.root, data);
	}
	
	private Node insertRec(Node root, int data) {
		if(root==null) {
			root = new Node(data);
		}else if(root.data>data) {	
			root.left = insertRec(root.left,data);
		}else if(root.data<data) {
			root.right = insertRec(root.right,data);
		}
		
		return root;
	}
	
	public void inorder() {
		//System.out.println(this.root);
		inOrderRec(this.root);
	}
	private void inOrderRec(Node root) {
		//System.out.println("Node "+root);
		if(root!=null) {
			//preOrder
//			System.out.print(root.data+" ");
			inOrderRec(root.left);
			//InOrder
			System.out.print(root.data+" ");
			inOrderRec(root.right);
			//postOrder
		//	System.out.print(root.data+" ");
		}
		
	}

}
