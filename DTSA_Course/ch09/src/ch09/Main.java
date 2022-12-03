package ch09;

/***
 * 
 * @author ultimate
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Heap heap = new Heap();
		
		heap.display();
		
		
		System.out.println("Size is "+heap.length());
		heap.insert(10);
		heap.insert(20);
		heap.insert(-1);
		System.out.println("Size is "+heap.length());
		heap.display();
		heap.insert(30);
		heap.insert(-5);
		heap.insert(14);
		System.out.println("Size is "+heap.length());
		heap.display();
		
	}

}
