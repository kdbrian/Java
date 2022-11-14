/**
 * 
 */
package ch01.examplesofrecursion;


/**
 * @author ultimate
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial f= new Factorial();
		
		System.out.println("While Loop -> 4! : "+f.iterativeFact(4));
		System.out.println("For Loop -> 4! : "+f.iterativeFact2(4));
		System.out.println("Recursion -> 4! : "+f.recursiveFact(4));
	}

	
	/***
	 * Using iteration
	 * while loop
	 */
	public int iterativeFact(int n) {
		int ans=1;
		
		while(n>0) {
			ans *= n;
			n--;
		}
		return ans;
	}
	
	/***
	 * Using iteration
	 * for loop
	 */
	public int iterativeFact2(int n) {
		int ans=1;
		
		for(int i=1;i<=n;i++)
			ans *= i;
		
		return ans;
	}
	
	/***
	 * Using recursion
	 */
	public int recursiveFact(int n) {
		
		if(n==0)
			return 1;
		else 
			return recursiveFact(n-1) * n;
	}
}
