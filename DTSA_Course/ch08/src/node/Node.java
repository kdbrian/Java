/**
 * 
 */
package node;

/**
 * @author ultimate
 *
 */
public class Node {
	
	private int element;
	private Node left;
	private Node right;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	
	public Node(int e,Node left,Node right) {
		this.element=e;
		this.left=left;
		this.right=right;
	}

	/**
	 * @return the element
	 */
	public int getElement() {
		return element;
	}

	/**
	 * @param element the element to set
	 */
	public void setElement(int element) {
		this.element = element;
	}

	/**
	 * @return the left
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * @param left the node left to set
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * @return the right node
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * @param right the right node to set
	 */
	public void setRight(Node right) {
		this.right = right;
	}
	
	
}
