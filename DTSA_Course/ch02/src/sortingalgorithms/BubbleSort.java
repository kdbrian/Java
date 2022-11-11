/**
 * 
 */
package sortingalgorithms;

/**
 * @author ultimate
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums1[]= {2,0,4,9,-1};
		print_arry(nums1);
		sort(nums1, nums1.length);
		print_arry(nums1);
	}

	
	public static void sort(int nums[],int n) {
		
		//passes or round
		for(int passes=n-1;passes>=0;passes--) {
			
			//traversing over the array
			//using passes since the elements to the right will be sorted after every pass
			for (int i = 0; i < passes; i++) {
				//swapping --> if left element > right element
				if(nums[i]>nums[i+1]) {
					int temp=nums[i];
					nums[i]=nums[i+1];
					nums[i+1]=temp;
				}
				print_arry(nums);
			}
			
		}
		
	}
	
	public static void print_arry(int nums[]) {
		//System.out.println();
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i]+" ");
		System.out.println();
	}
}
