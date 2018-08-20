package com.trial1;
/*2. Given an array of integers, write a program to perform the following:
	1. Print 0 if the entire array is sorted in ascending order
	2. Print 1 if at least half but not the entire array is sorted in ascending order
	3. Print 2 Otherwise
	Use ceil value of half in case if it is a decimal numbers
=============================================================================================
sample input	|	sample output	|	Explanation											|
===========================================================================================	|
1,2,3,4,5,6		|	0				|	All elements are in sorted order and hence 0		|
--------------------------------------------------------------------------------------------|
11,15,66,75,5	|	1				|	15,66 and 75 are in ascending order which is at 	|
				|					|	least half of the total number of elements			|
--------------------------------------------------------------------------------------------|
11,31,15,66,75,	|					|	number of sorted elements are less than half 		|
5,55,34			|					|	of the total number of elements						|
=============================================================================================*/
import java.util.Arrays;
import java.util.stream.IntStream;

public class CheckAscendingArray {

	public static void main(String[] args) {
		int[] arr = {11,31,15,66,75,5,55,34};
		IntStream whole = Arrays.stream(arr).map(t -> t).sorted();
		int[] sortedArr = whole.toArray();
		
		int[] arr1 = firstHalfArray(arr);
		IntStream first = Arrays.stream(arr1).sorted();
		int[] firstSortedArr = first.toArray();
		
		int[] arr2 = lastHalfArray(arr);
		IntStream last = Arrays.stream(arr).sorted();
		int[] lastSortedArr = last.toArray();
		
		if(Arrays.equals(arr, sortedArr))
			System.out.println("0");
		else if(Arrays.equals(arr1, firstSortedArr))
			System.out.println("1");
		else if(Arrays.equals(arr2, lastSortedArr))
			System.out.println("1");
		else
			System.out.println("not sorted anymore");
		
	}
	
	
	public static int[] firstHalfArray(int[] x)
	{
		int size = x.length;
		System.out.println(size);
		if((x.length%2) != 0)
		{
			size = size+1;
		}
		System.out.println("Size: "+size);
		int[] xx = new int[size/2];
			for(int i=0; i<size/2; i++)
			{
				xx[i] = x[i];
			}
		return xx;
	}
	public static int[] lastHalfArray(int[] x)
	{
		int size = x.length;
		if(((x.length/2)%2) != 0)
		{
			size = size+1;
		}
		int[] xx = new int[size];
			for(int i=size/2; i<size; i++)
			{
				xx[i] = x[i];
			}
		return xx;
	}
}
