package binarysearchtree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandFile {

	static final int MAX_VALUE=2147483647; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	List<Integer> nums= new  ArrayList<>();
	 int num [] = {256741038 ,623958417 ,467905213 ,714532089,938071625};

	 for (int i = 0; i < num.length; i++) {
		 nums.add(num[i]);
	 }
	 printList(nums);
	 Collections.sort(nums);
	 printList(nums);
	 
	 System.out.print("Min sum :");
	 int sumMin=0;
	 for(int i=0;i<nums.size()-1;i++)
		 sumMin+=nums.get(i);
	 System.out.println(sumMin);
	 
	 System.out.print("Max sum :");
	 int sumMax=0;
	 for(int i=1;i<nums.size();i++) 
		 sumMax+=nums.get(i);
	 System.out.println(sumMax);
	System.out.println( MAX_VALUE-(sumMax-MAX_VALUE));
	}
	
	static void printList(List  <Integer> list) {
		for (Integer i : list) {
			System.out.print(i+" ");	
		}
		System.out.println();
	}
	
	
	static void printArry(int[] l) {
		for(int i=0;i<l.length;i++)
				System.out.print(l[i]+" ");
		System.out.println();
	}
	
}
