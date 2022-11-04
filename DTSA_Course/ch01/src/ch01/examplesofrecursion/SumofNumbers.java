/**
 * 
 */
package ch01.examplesofrecursion;

/**
 * @author ultimate
 *
 */
public class SumofNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SumofNumbers s = new SumofNumbers();
		
		System.out.println(s.sumn(3));
		System.out.println(s.sumIteration(3));
		System.out.println(s.sumRecursion(1));
	}

	
	/***
	 * Using formula
	 * @param n
	 * @return
	 */
	public int sumn(int n) {
		return (n*(n+1))/2;
	}
	
	/***
	 * Using iteration
	 * @param n
	 * @return
	 */
	public int sumIteration(int n) {
		int sum=0;
		
		for(int i=1;i<=n;i++)
			sum += i;
		
		return sum;
	}
	
	/***
	 * Using Recursion
	 * @param n
	 * @return
	 */
	public int sumRecursion(int n) {
		
		if (n==0 || n==1)
			return n;
		else 
			return n+sumRecursion(n-1);
	}
}
