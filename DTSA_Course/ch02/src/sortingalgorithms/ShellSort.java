/**
 * 
 */
package sortingalgorithms;

/**
 * @author ultimate
 *
 */
public class ShellSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]= {2,0,4,9,-1};
		print_arry(nums);
		sort(nums, nums.length);
		print_arry(nums);
	}
	
	/***
	 * An implementation of the shell sort algorithm
	 * @param nums an array/list of integer elements
	 * @param n size of the array/list
	 */
	public static void sort(int nums[],int n) {
		
		int gap = n / 2;
		while (gap > 0) {
			int i = gap;
			while (i < n) {
				int temp = nums[i];
				int j = i - gap;
				while (j >= 0 && nums[j] > temp) {
					nums[j + gap] = nums[j];
					j -= gap;
				}
				nums[j + gap] = temp;
				i += 1;
			}
			gap /= 2;
		}
		
	}
	
	public static void print_arry(int nums[]) {
		//System.out.println();
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i]+" ");
		System.out.println();
	}

}
