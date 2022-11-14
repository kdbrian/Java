/**
 * 
 */
package ch06.stacks;

/**
 * @author ultimate
 *
 */
public class StackArrays {
	
	private int data[];
	private int top;
	
	/***
	 * Contructor
	 * @param n the size of the data array
	 */
	public StackArrays(int n) {
		// TODO Auto-generated constructor stub
		data=new int[n];
		top=0;
	}

	
	/**
	 * Method to return number of elements in the array
	 * @return top the top most index of the array
	 */
	public int length() {
		return top;
	}
	
	/**
	 * A method that checks whether the stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		return length() ==0;
	}
	
	/**
	 * Checks whether the array is full
	 * @return
	 */
	public boolean isFull() {
		return length() == data.length;
	}
	
	/***
	 * Inserts an element at the top of the stack
	 * @param e the element to insert
	 */
	public void push(int e) {
		
		if (isFull()) {
			System.err.println("Stack overflow while inserting "+e);
			return;
		}
		
		data[top] = e;
		top+=1;
	}
	
	/***
	 * Removes the last element of the stack
	 * @return
	 */
	public int pop() {
		
		if (isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		}
		
		int el = data[top-1];
		
		top -=1 ;
		return el;
	}
	
	/**
	 * Returns data at the top
	 * @return
	 */
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		}
		
		return data[top-1];
	}
	
	/**
	 * A method to display the contents of the stack
	 */
	public void display() {
		for(int i=0;i<top;i++)
			System.out.print(data[i]+"-");
		
		System.out.println();
	}
}
