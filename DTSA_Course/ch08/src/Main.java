import binarysearchtree.BinarySearchTree;

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
		tree.insert(null, 10);
		tree.insert(tree.getRoot(), 20);
		tree.insert(tree.getRoot(), 30);
		tree.insert(tree.getRoot(), -1);
		tree.inorder(tree.getRoot());
		System.out.println();
		tree.rinsert(tree.getRoot(), 90);
		tree.rinsert(tree.getRoot(), 88);
		tree.inorder(tree.getRoot());
	}

}
