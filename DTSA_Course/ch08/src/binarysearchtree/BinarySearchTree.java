/**
 * 
 */
package binarysearchtree;

import node.Node;

/**
 * @author ultimate
 *
 */
public class BinarySearchTree {
	
	/***
	 * The entry point of the tree
	 * represented as a Node
	 */
	private Node root;
	
	/***
	 * default constructor of the binary search tree
	 * initializes the root of the tree to null
	 */
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		root=null;
	}
	
	/***
	 * a method to insert an element to a binary search tree
	 * @implNote the element will be inserted at its sorted position
	 * @param tempRoot pointer to the root of the tree
	 * @param e the element to insert
	 */
	public void insert(Node tempRoot,int e ) {
		Node temp=null;
		
		while(tempRoot != null) {
			
			temp = tempRoot;
			
			if(tempRoot.getElement() == e)
				return;
			else if(e<tempRoot.getElement())
				tempRoot=tempRoot.getLeft();
			else if(e>tempRoot.getElement())
				tempRoot=tempRoot.getRight();
		}
		
		Node newNode = new Node(e,null,null);
		
		if (root != null) {
			
			if(e<temp.getElement())
				temp.setLeft(newNode);
			else
				temp.setRight(newNode);
		}else {
			root=newNode;
		}
		
	}
	
	
	/**
	 * @return the root
	 */
	public Node getRoot() {
		return root;
	}

	/***
	 * Function to traverse the {@link #BinarySearchTree()} using the inorder traversal
	 * using recursion
	 * @param temproot reference to the root of the tree
	 */
	public void inorder(Node temproot) {
		if(temproot != null) {
			inorder(temproot.getLeft());
			System.out.print(temproot.getElement()+" ");
			inorder(temproot.getRight());
		}
		
		//System.out.println();
	}
	
	/**
	 * @param root the root to set
	 */
	public void setRoot(Node root) {
		this.root = root;
	}

	/***
	 * a method to insert an element into the binary tree using recursion
	 * @param temproot the reference to the root of the tree
	 * @param element the element to be inserted into the tree
	 * @return the reference to the node newly inserted
	 */
	public Node rinsert(Node temproot,int element) {
		
		if(temproot != null) {
			
			if(element < temproot.getElement())//placing new node in the left subtree
				temproot.setLeft(rinsert(temproot.getLeft(), element));
			
			else if(element > temproot.getElement())//placing new node in the right subtree
				temproot.setRight(rinsert(temproot.getRight(), element));
		
		}else {
			Node newNode = new Node(element,null,null);
			temproot=newNode;
		}
		
		return temproot;
	}
	
	/***
	 * a method to print a {@link #BinarySearchTree()} in preorder traversal
	 * visit root, visit left subtree,visit right subtree
	 * @param troot
	 */
	public void preorder(Node troot) {
		
		if(troot != null) {
			System.out.print(troot.getElement()+" ");
			preorder(troot.getLeft());//visit left subtree
			preorder(troot.getRight());//visit right subtree
		}
	}
	
	
	/***
	 * a method to print a {@link #BinarySearchTree()} in postorder traversal
	 * visit left subtree,visit right subtree, visit root 
	 * @param troot
	 */
	public void postorder(Node troot) {
		
		if(troot != null) {
			postorder(troot.getLeft());//visit left subtree
			postorder(troot.getRight());//visit right subtree
			System.out.print(troot.getElement()+" ");//print element at root
		}
	}
}
