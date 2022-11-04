/**
 * 
 */
package ch01.typeofrecursion;

/**
 * @author ultimate
 *
 */
public class TreeRecursion {
	
	/***
	 * Function call itself more than one time within the base case
	 * @param n
	 */
	public void calculate(int n) {
		
		if (n>0) {
			calculate(n-1);
			
			int k=n*n;
			
			System.out.print(k+" ");
			
			calculate(n-1);
			
		}
	
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeRecursion tr = new TreeRecursion();
		
		tr.calculate(3);

	}

}
