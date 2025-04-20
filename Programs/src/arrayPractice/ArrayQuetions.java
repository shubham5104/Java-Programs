package arrayPractice;

import java.util.Arrays;

public class ArrayQuetions {
//	Write a program to find the maximum element in an array.
	static public int min(int[] arr)
	{
		int min =arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		return min;
	}
//	Write a program to find the minimum element in an array.
	static public int max(int[] arr)
	{
		int max =0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
//	Write a program to calculate the sum of all elements in an array.
	static public int sum(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		return sum;
	}
//	Write a program to find the average of all elements in an array.

	static public double avg(int[] arr)
	{
		double sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		return sum/arr.length;
	}
//	Write a program to reverse the elements in an array.
	static public int[] revers(int[] arr) 
	{
		int left =0;
		int right=arr.length-1;
		while(left<right)
		{
			int temp=arr[left];
			arr[left]= arr[right];
			arr[right]=temp;
			
			left++;
			right--;
		}
		return arr;
	}
//	Write a program to check if an array is sorted in ascending order.
	public static boolean checkasc(int[]arr)
	{
		int[]arr1=Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=arr1[i])
			{
				return false;
			}
		}
		
		return true;
	}
//	Write a program to find the second largest element in an array.
	static public int secmax(int[] arr) 
	{
		Arrays.sort(arr);
		return arr[arr.length-2];
	}
	
//	Write a program to remove duplicates from an array.
	static public void removedup(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]!=arr[j])
				{
					System.out.print(arr[i]+" ");
					break;
				}
			}
		}
		
	}
	
//	Write a program to find the common elements between two arrays.
	
//	Write a program to merge two sorted arrays into a single sorted array.
//	Write a program to find the frequency of each element in an array.
//	Write a program to check if an array contains a specific element.
//	Write a program to rotate the elements in an array to the right by a given number of positions.
//	Write a program to find the missing number in an array of consecutive integers.
//	Write a program to find the largest and smallest elements in an array.
//	Write a program to find the kth smallest element in an unsorted array.
//	Write a program to sort an array of 0s, 1s, and 2s without using any sorting algorithm.
//	Write a program to find the maximum subarray sum in an array.
//	Write a program to find the longest increasing subsequence in an array.
//	Write a program to find the median of two sorted arrays.
	
	public static void main(String[] args) {
		int[] arr= {2,3,4,6,8,2,9};
		
//		System.out.println(secmax(arr));
		removedup(arr);
		
		
		
		
		
//		System.out.println(" Min : "+ArrayQuetions.min(arr));
//		System.out.println(" Max : "+ArrayQuetions.max(arr));
//		System.out.println(" Sum of All Elements : "+ArrayQuetions.sum(arr));
//		System.out.println(" Avg of All Elements : "+ArrayQuetions.avg(arr));
//		System.out.println("Reverse Array : "+Arrays.toString(ArrayQuetions.revers(arr)));
		
//		System.out.println(checkasc(arr));

	}

}
