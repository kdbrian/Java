/**
 * 
 */
package ch01;

/**
 * @author ultimate
 *
 */
public class IterativeRecursiveDiff {
	
	
	public static void main(String[] args) {
		
		IterativeRecursiveDiff iterativeRecursiveDiff= new IterativeRecursiveDiff();
		
		iterativeRecursiveDiff.calculateIterative(4);
		System.out.println();
		iterativeRecursiveDiff.calculateRecursive(4);
		
	}

	
	/***
	 * Implementation of a iterative function
	 * @param n
	 */
	public void calculateIterative(int n) {
		
										// Time complexity
		while(n>0) {					// execs utmost (n+1) times
			int k=n*n;					// constants 1
			System.out.print(k+" ");	// constants 1
			n--;						// constants 1
		}								// O(n+1)
										// O(n) --> linear
	}
	
	
	/***
	 * Implementation of a iterative function
	 * @param n
	 */
	public void calculateRecursive(int n) {
		
		// Time complexity
		if(n>0) {
			int k=n*n;
			System.out.print(k+" ");
			calculateRecursive(n-1); // recursive call
		}
	}
	
}
