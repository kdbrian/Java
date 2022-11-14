/**
 * 
 */
package ch06.stacks;

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
		
		// initializes a stack(arrays) of 5 elements
		/*
		StackArrays stack = new StackArrays(5);
		System.out.println("Isempty : "+stack.isEmpty());
		System.out.println("Isfull : "+stack.isFull());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();
		System.out.println("Top : "+stack.peek());
		System.out.println("Length : "+stack.length());
		System.out.println("Popped : "+stack.pop());
		stack.push(88);
		stack.push(34);
		stack.push(33);
		stack.push(43);
		stack.display();
		System.out.println("Isempty : "+stack.isEmpty());
		System.out.println("Isfull : "+stack.isFull());
		stack.display();
		*/
		// initializes a stack(linkedlist) of 5 elements
		StackLinkedList list = new StackLinkedList();
		System.out.println("Popped : "+list.pop());
		System.out.println("isEmpty() : "+list.isEmpty());
		System.out.println("Length : "+list.length());
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(50);
		list.display();
		System.out.println("Peek : "+list.peek());
		System.out.println("isEmpty() : "+list.isEmpty());
		System.out.println("Length : "+list.length());
		list.display();
		System.out.println("Deleted : "+list.pop());
		list.display();
		
	}

}
