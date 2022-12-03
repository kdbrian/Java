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
		
		
		heap.insert(10);
		heap.insert(20);
		heap.insert(-1);
		
		heap.display();
	}

}
