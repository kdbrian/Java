/**
 * 
 */
package ch07.queue;

/**
 * @author ultimate
 * an implementation of the Queue data type using arrays
 */
public class QueueArrays {

	// holds the data of the queue
	private int data[];
	
	// holds reference to the front of the queue
	private int front;

	// holds reference to the back of the queue
	private int rear;
	private int size;
	
	/***
	 * creates a new queue
	 * @param n
	 */
	public QueueArrays(int n) {
		// TODO Auto-generated constructor stub
		data = new int[n];
		front=0;
		rear=0;
		size=0;
	}
	
	/***
	 * 
	 * @return the number of elements in the queue
	 */
	public int length() {
		return size;
	}
	
	/***
	 * checks if the list is empty
	 * @return
	 */
	public boolean isEmpty() {
		return size==0;
	}
	
	/***
	 * checks if the list is full
	 * @return
	 */
	public boolean isFull() {
		return size == data.length;
	}
	
	/***
	 * Adds an element to a queue
	 * @param e the element to be inserted
	 */
	public void enqueue(int e) {
		
		if(isFull()) {
			System.err.println("Queue full");
			return;
		}
		
		data[rear] = e;
		rear++;
		size++;
	}
	
	/***
	 * removes element at the front of the queue and returns it
	 * @return e the element that has been removed
	 */
	public int dequeue() {
		
		if(isEmpty()) {
			System.err.println("Queue empty");
			return -1;
		}
		
		int el = data[front];
		
		front ++; 
		
		return el;
	}
	
	/***
	 * Function to retrieve first element of the queue
	 * @return 
	 */
	public int front() {
		return data[front];
	}
	
	/***
	 * Function to retrieve last element of the queue
	 * @return 
	 */
	public int rear() {
		return data[rear];
	}
	
	public void display() {
		for (int i = front; i < rear; i++) {
			System.out.print(data[i]+"-");
		}
		System.out.println();
	}
}
