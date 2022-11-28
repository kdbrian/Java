/**
 * 
 */
package binarysearchtree;

import node.Node;
import queue.QueueLinkedList;

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
	
	
	/***
	 * a method to print a {@link #BinarySearchTree()} in levelorder traversal
	 * visit and print node within the same level from left to right 
	 * 
	 */
	public void levelorder() {
		
		QueueLinkedList queue = new QueueLinkedList();//to keep track of the visited nodes
		Node troot=this.getRoot();
		System.out.print(troot.getElement()+" ");
		queue.enqueue(troot);
		
		while(! queue.isEmpty()) {
			troot = (Node) queue.dequeue();
			
			//start printing from the left if there is a child
			if (troot.getLeft() != null) {
				System.out.print(troot.getLeft().getElement()+" ");
				queue.enqueue(troot.getLeft());
			}
			
			if(troot.getRight() != null) {
				System.out.print(troot.getRight().getElement()+" ");
				queue.enqueue(troot.getRight());
			}
		}
		
	}
	
	/***
	 * an iterative method to search for an element in a binary search tree
	 * @param key the key to be searched for
	 * @return true if the key is found and false otherwise
	 */
	public boolean search(int key) {
		
		Node temp = this.getRoot();
		
		while(temp != null) {
			
			if(key == temp.getElement())
				return true;
			else if(key<temp.getElement())//search left subtree
				temp = temp.getLeft();
			else if(key>temp.getElement())//search the right subtree
				temp=temp.getRight();
		}
		return false;
	}
	
	
	/***
	 * a recursive method to search for an element in a binary search tree
	 * @param key the key to be searched for
	 * @return true if the key is found and false otherwise
	 */
	public boolean rsearch(Node troot,int key) {
		
		if (troot != null) {
			
			if(troot.getElement() == key)
				return true;
			
			//search left subtree
			else if(key < troot.getElement())
				return rsearch(troot.getLeft(), key);
			
			//search right subtree
			else if(key > troot.getElement())
				return rsearch(troot.getRight(), key);
				
		}
		
		return false;
	}
	
	/***
	 * a method to delete a node from a {@link #BinarySearchTree()}
	 * @param key the element stored in the node to be deleted
	 * @return true if operation was successful and false otherwise
	 */
	public boolean delete(int key) {
		
		//to be used for traversal and searching
		Node currNode = this.getRoot();
		
		/// will be used to point to the parent of the node being deleted
		Node parentNode = null;
		
		//traverse till the node before the one being deleted
		while (currNode != null && currNode.getElement() != key) {
			
			parentNode=currNode;
			
			if(currNode.getElement()>key)
				currNode = currNode.getLeft();
			else if (currNode.getElement()<key)
				currNode=currNode.getRight();
			
		}
		
		if(currNode == null)
			return false;
		
		//checking if the node has left/right subtree
		if(currNode.getLeft() != null && currNode.getRight() != null) {
			
			//to be used for selecting largest element from left subtree
			Node s = currNode.getLeft();
			Node ps = currNode;
			
			while(s.getRight() != null) {
				ps=s;
				s=s.getRight();
			}
			
			//reassigning values
			currNode.setElement(s.getElement());
			currNode=s;
			parentNode = ps;
		}
		
		Node c = null;
		
		if (currNode.getLeft() != null)
			c=currNode.getLeft();
		else
			c=currNode.getRight();
		
		if(currNode == root)
			root=null;
		
		else 
			if(currNode == parentNode.getLeft())
				parentNode.setLeft(c);
			else
				parentNode.setRight(c);
		
		return true;
	}
	
	/***
	 * a method to count the number of nodes in a binary search tree
	 * @param troot the reference to the root of the tree
	 * @return n number of nodes or -1 if there are no nodes in the tree
	 */
	public int count(Node troot) {
		int x,y;
		if(troot!=null) {
			x=count(troot.getLeft());
			y=count(troot.getRight());
			return x+y+1;
		}
		
		return 0;
	}
}
