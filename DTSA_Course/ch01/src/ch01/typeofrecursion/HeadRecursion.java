/**
 * 
 */
package ch01.typeofrecursion;

/**
 * @author ultimate
 *
 */
public class HeadRecursion {

	public void calculate(int n) {
			
			if (n>0) {
				calculate(n-1);
				
				int k=n*n;
				
				System.out.print(k+" ");
			}
		
	}
	
	
	public static void main(String[] args) {
		
		HeadRecursion t = new HeadRecursion();
		
		t.calculate(4);
		
	}
}
