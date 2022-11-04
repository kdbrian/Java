/**
 * 
 */
package ch01.typeofrecursion;

/**
 * @author ultimate
 *
 */
public class TailRecursion {

	public void calculate(int n) {
		
		if (n>0) {
			int k=n*n;
			
			System.out.print(k+" ");
			
			calculate(n-1);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		TailRecursion t = new TailRecursion();
		
		t.calculate(4);
		
	}
}
