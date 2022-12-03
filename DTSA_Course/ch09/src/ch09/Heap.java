/**
 * 
 */
package ch09;

/**
 * @author ultimate
 * a representation of the heap data structure
 * using array based implementation of binary trees
 */
public class Heap {
	
	
	private int maxSize;//the maximum size the heap can accumulate
	private int Data[];//the data to be stored in the heap
	private int csize;//represents the current size of the array

	
	public Heap() {
		// TODO Auto-generated constructor stub
		maxSize=10;
		Data = new int[maxSize];
		csize=0;
		
		for(int i=0;i<Data.length;i++)//initializing the elements of the heap
			Data[i]=-1;
	}
	
	/***
	 * 
	 * @param e the element being inserted
	 */
	public void insert(int e) {
		if(csize == maxSize) {
			System.out.println("No space");
			return;
		}
		csize+=1;//increment the current size of the array
		int hi=csize;//the heap index
		
		//performing up-heap bubbling
		while (hi>1 && e> Data[hi/2]) {
			Data[hi] = Data[hi/2];
			hi=hi/2;
		}
		
		Data[hi]=e;
	}
	
	
	/***
	 * A method to return the number of elements currently stored in the heap
	 * @return csize the  number of elements/ the last index to insert an element
	 */
	public int length() {
		return csize;
	}
	
	/***
	 * A method to check if the heap is empty
	 * @return true if heap does not contain any elements and false otherwise
	 */
	public boolean isEmpty() {
		return csize==0;
	}
	
	/***
	 * Method to return the element at the top/root of the heap
	 * @return
	 */
	public int  max() {
		
		if(isEmpty()) {
			System.out.println("Heap is empty");
			return -1;
		}
		
		return Data[1];//considering data is store from index 1
	}

	/***
	 * Method to display the contents of the heap
	 */
	public void display() {
		for (int i = 0; i < Data.length; i++) {
			System.out.println(Data[i]+" ");
		}
		
		System.out.println();
	}
}
