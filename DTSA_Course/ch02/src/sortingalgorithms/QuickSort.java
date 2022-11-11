/**
 * 
 */
package sortingalgorithms;

/**
 * @author ultimate
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[]= {2,0,4,9,-1};
		display(nums1);
		sort(nums1, 0,nums1.length-1);
		display(nums1);
	}
	
	public static void display(int A[]) {
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
		System.out.println();
	}
	
	/***
	 * Recursive implementation of the quick sort algorithm
	 * @param nums : array/list
	 * @param low : lowest index
	 * @param high : highest index 
	 */
	public static void sort(int nums[],int low,int high) {
		
		if (low<high) {
			int pi = partition(nums,low,high);
			
			sort(nums, low, pi-1);//left side
			sort(nums, pi+1, high);//right side
		}
	}

	/***
	 * 
	 * @param nums : array/ list
	 * @param low : minimum index
	 * @param high : highest index
	 * @return : partitioning index
	 */
	public static int partition(int[] nums, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = nums[low];
		int i=low+1;
		int j=high;
		
		do {
			while( i<=j && nums[i]<pivot) //traversing frontwards 
				i+=1;
			
			while( i<=j && nums[j]>pivot)//traversing from backwards 
				j-=1;
			
			//swapping elements if all elements are traversed
			if(i<=j) swap(nums,i,j);
			
		}while(i<j);
		
		swap(nums,low,j);
		
		return j;
	}

	/***
	 * A method to swap array elements
	 * @param nums : array or list
	 * @param low element index
	 * @param j index to place item
	 */
	public static void swap(int[] nums, int low, int j) {
		// TODO Auto-generated method stub
		int temp = nums[low];
		nums[low] = nums[j];
		nums[j] = temp;
	}

}
