import binarysearchtree.BinarySearchTree;
import node.Node;

/**
 * 
 */

/**
 * @author ultimate
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree tree = new BinarySearchTree();
		
		/**
		 * the root of the tree is set once
		 * Otherwise we can loose reference to the other nodes
		 */
		tree.setRoot(tree.rinsert(null, 10));
		System.out.println("Inorder");
		tree.insert(tree.getRoot(), 20);
		tree.insert(tree.getRoot(), 30);
		tree.insert(tree.getRoot(), -1);
		tree.inorder(tree.getRoot());
		System.out.println();
		tree.rinsert(tree.getRoot(), 90);
		tree.rinsert(tree.getRoot(), 88);
		tree.insert(tree.getRoot(), -2);
		tree.insert(tree.getRoot(), 5);
		tree.insert(tree.getRoot(), 15);
		tree.insert(tree.getRoot(), 101);
		tree.inorder(tree.getRoot());
		System.out.println("\nPreorder");
		tree.preorder(tree.getRoot());
		System.out.println("\nPostorder");
		tree.postorder(tree.getRoot());
		
	}

}
