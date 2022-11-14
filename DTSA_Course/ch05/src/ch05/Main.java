/**
 * 
 */
package ch05;

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
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.addlast(10);
		list.addlast(20);
		list.addlast(30);
		list.addlast(40);
		list.display();
		System.out.println("After inserting 33 as 3rd node");
		list.insertAny(33,3);
		list.display();
		
		//deleting first element
		System.out.println("After deleting "+list.deleteFirst());
		list.display();
		
	}

}
