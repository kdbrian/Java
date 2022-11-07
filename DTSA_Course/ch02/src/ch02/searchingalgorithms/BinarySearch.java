/**
 * 
 */
package ch02.searchingalgorithms;

/**
 * @author ultimate
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {2,3,4,5,6,10};
		
		int key=10;
		System.out.println("Key : "+key);
		System.out.print("Iteration --> ");
		System.out.println(binSearchIterative(nums,nums.length,key) != -1 ? 
									"Element at index : "+binSearchIterative(nums,nums.length,key):
										"Element not found");
		
		System.out.print("Recursion --> ");
		System.out.println(binSearchIterative(nums,nums.length,key) != -1 ? 
				"Element at index : "+binSearchRecursive(nums, key, 0, nums.length-1):
					"Element not found");
	}
	
	
	
	
	/***
	 * Implementation of binary search using iteration
	 * @param nums an array/list of elements
	 * @param n the size of the array/list elements
	 * @param key the element to be searched
	 * @return index of key or -1 if not found
	 */
	public static int binSearchIterative(int nums[],int n,int key) {
		
		int l=0;
		int r=n-1;
		
		//System.out.println("Key : "+key);
		
		while (l<=r) {
			
			int mid=(l+r)/2;
			/*
			 * System.out.print(" left : "+l);
			 * System.out.print(" right : "+r);
			 * System.out.println(" mid : "+mid+" el : "+nums[mid]);
			*/
			if( nums[mid] == key)
				return mid;
			else if (nums[mid] >key ) {
				r=mid-1;
			}else if (nums[mid] < key) {
				l=mid+1;
			}
			
		}
		
		return -1;
	}

	/***
	 * Implementation of binary search using recursion
	 * @param nums an array/list of elements
	 * @param key the element to be searched
	 * @param l the left index of the array/list
	 * @param r the right index of the array/list
	 * @return index of key or -1 if not found
	 */
	public static int binSearchRecursive(int nums[],int key,int l,int r) {
		
		if(l>r)
			return -1;
		else {
			int mid=(l+r)/2;
			if( nums[mid] == key)
				return mid;
			else if (nums[mid] >key ) {
				return binSearchRecursive(nums, key, l, mid-1);//search the left side
			}else if (nums[mid] < key) {
				return binSearchRecursive(nums, key, mid+1, r);//search the right side
			}
		}
		return -1;
	}

}
