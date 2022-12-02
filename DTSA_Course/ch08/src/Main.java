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
		
		/**
		 * the root of the tree is set once
		 * Otherwise we can loose reference to the other nodes
		 */
		//tree.setRoot(tree.rinsert(null, 10));
		System.out.println("Inorder");
		/*tree.insert(tree.getRoot(), 20);
		tree.insert(tree.getRoot(), 30);
		tree.insert(tree.getRoot(), -1);
		tree.inorder(tree.getRoot());
		System.out.println();
		tree.rinsert(tree.getRoot(), 90);
		tree.rinsert(tree.getRoot(), 88);
		tree.insert(tree.getRoot(), -2);
		tree.insert(tree.getRoot(), 5);
		tree.insert(tree.getRoot(), 15);
		//tree.insert(tree.getRoot(), 101);
		 */
		tree.insertAll(new int[]{56,45,65,52,60,90,15});
		System.out.println("********Tree 1**********");
		tree.inorder(tree.getRoot());
		System.out.println("\nPreorder");
		tree.preorder(tree.getRoot());
		System.out.println("\nPostorder");
		tree.postorder(tree.getRoot());
		System.out.println("\nLevelorder");
		tree.levelorder();
		System.out.println();
		/*System.out.println("Iterative search");
		System.out.println("search key = 101 :-"+tree.search(101));
		System.out.println("search key = 90 :-"+tree.search(90));
		System.out.println("search key = 9 :-"+tree.search(9));
		System.out.println();
		System.out.println("Recursive search");
		System.out.println("search key = 101 :-"+tree.rsearch(tree.getRoot(),101));
		System.out.println("search key = 90 :-"+tree.rsearch(tree.getRoot(),90));
		System.out.println("search key = 9 :-"+tree.rsearch(tree.getRoot(),9));
		*/
		System.out.println();
		tree.inorder(tree.getRoot());
		System.out.println("\nNumber of nodes are : "+tree.count(tree.getRoot()));
		tree.delete(88);
		System.out.println();
		tree.inorder(tree.getRoot());
		System.out.println();
		System.out.println("Number of nodes are : "+tree.count(tree.getRoot()));
		System.out.println("The height of the tree is : "+(tree.height(tree.getRoot())-1));
		
		tree=null;
		System.out.println("********Tree 2**********");
		tree = new BinarySearchTree();
		tree.insertAll(new int[] {15,65,60,90,52,45,56});
		tree.inorder(tree.getRoot());
		System.out.println("\nPreorder");
		tree.preorder(tree.getRoot());
		System.out.println("\nPostorder");
		tree.postorder(tree.getRoot());
		System.out.println("\nLevelorder");
		tree.levelorder();
		System.out.println();
		System.out.println();
		tree.inorder(tree.getRoot());
		System.out.println("\nNumber of nodes are : "+tree.count(tree.getRoot()));
		tree.delete(88);
		System.out.println();
		tree.inorder(tree.getRoot());
		System.out.println();
		System.out.println("Number of nodes are : "+tree.count(tree.getRoot()));
		System.out.println("The height of the tree is : "+(tree.height(tree.getRoot())-1));
		
	}

}
