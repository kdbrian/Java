/**
 * 
 */
package sortingalgorithms;

/**
 * @author ultimate
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[]= {2,0,4,9,-1};
		System.out.println("Original : ");
		print_arry(nums1);
		selection_sort(nums1, nums1.length);
		System.out.println("Sorted : ");
		print_arry(nums1);
		
	}

	static void print_arry(int nums[]) {
		//System.out.println();
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i]+" ");
		System.out.println();
	}
	/***
	 * An implementation of the Selection sort algorithm
	 * @param nums an list/array of elements
	 * @param n the size of the list/array
	 */
	public static void selection_sort(int nums[],int n) {
		
		for(int i=0;i<n-1;i++) { //the number of rounds till sorting is complete is (n-1)
			int pos=i;
			for(int j=i+1;j<n;j++) {//looping from (i+1) since i element is staged for swapping
				
				if(nums[j]<nums[pos]) {
					//System.out.println("\nSwapping "+nums[j]+" with "+nums[pos]);
					pos=j;
				}
					//swapping
					int temp= nums[i];
					nums[i]=nums[pos];
					nums[pos]=temp;
				
			}
			
		}
		
	}
}
