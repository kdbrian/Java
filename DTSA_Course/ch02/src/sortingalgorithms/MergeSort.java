/**
 * 
 */
package sortingalgorithms;

/**
 * @author ultimate
 *
 */
public class MergeSort {

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
	
	/***
	 * a recursive implementation of the merge sort algorithm
	 * @param nums
	 * @param left : the left most index of the array
	 * @param right : the right index of the array
	 */
	public static void sort(int nums[],int left, int right) {
		if(left<right) {
			
			int mid = (left+right)/2;
			
			sort(nums, left, mid);
			sort(nums, mid+1, right);
			
			merge(nums,left,mid,right);
		}
	}
	
	/***
	 * A function to merge the sorted sub arrays
	 * @param nums : the array to be sorted
	 * @param left : the left most index of the array
	 * @param mid : the mid index of the array
	 * @param right : the right index of the array
	 */
	public static void merge(int nums[],int left,int mid,int right) {
		int i=left,k=left;
		int j=mid+1;
		
		//array to merge values
		int numsMerger[] = new int[right+1];
		
		while (i<=mid && j<=right) {
			if(nums[i]<nums[j]) {
				numsMerger[k]=nums[i];
				i+=1;
			}else {
				numsMerger[k]=nums[j];
				j+=1;
			}
			k+=1;
//			System.out.print("Nums : ");
//			display(nums);
//			System.out.print("NumsM : ");
//			display(numsMerger);
		}
		
		// if there are any elements left in the left sub array
		while (i<=mid) {
			numsMerger[k]=nums[i];
			k+=1;
			i+=1;
		}
		
		while(j<=right) {
			numsMerger[k]=nums[j];
			k+=1;
			j+=1;
		}
		
		//copying elements into original array
		for(int x=left;x<right+1;x++)
			nums[x]=numsMerger[x];
		
		numsMerger=null;
	}

	public static void display(int A[]) {
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
		System.out.println();
	}
}
