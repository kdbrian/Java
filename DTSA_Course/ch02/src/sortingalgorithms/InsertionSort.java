/**
 * 
 */
package sortingalgorithms;

/**
 * @author ultimate
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[]= {2,0,4,9,-1};
		print_arry(nums1);
		insertion_sort(nums1, nums1.length);
		print_arry(nums1);

	}

	
	private static void insertion_sort(int nums[],int n) {
		
		for (int i = 1; i < n; i++) {
			int position=i;
			int temp=nums[i];//holds element that needs to be inserted at its appropriate position
			
			while (position > 0 && nums[position-1] > temp) {//does the comparison
				nums[position]=nums[position-1];//swapping until correct position
				position--;
				//print_arry(nums);
			}
			nums[position]=temp;//does the placing of the element
			//print_arry(nums);
		}
	}
	
	public static void print_arry(int nums[]) {
		//System.out.println();
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i]+" ");
		System.out.println();
	}
}
