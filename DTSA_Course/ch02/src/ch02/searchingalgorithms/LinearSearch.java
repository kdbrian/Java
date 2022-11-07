/**
 * 
 */
package ch02.searchingalgorithms;

/**
 * @author ultimate
 *
 */
public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {23,7,90,33,-1};
		
		System.out.println(search(nums, nums.length, 90));

	}
	
	
	/***
	 * 
	 * @param nums an array of elements
	 * @param n size of the array
	 * @param key the element to find
	 * @return index of element or -1 if element not found
	 */
	private static int search(int []nums,int n,int key) {
		int index=0;
		
		while(index<n) {
			
			if(nums[index] == key)
				return index;
			
			index++;
		}
			
		return -1;
	}

}
