package arrayPractice;

import java.util.Arrays;

public class TwoArraySortAndMerge {

	public static void main(String[] args) {
		int[] arr1= {5,2,6,3};
		int[] arr2= {1,4,7,2};
		int[] arr3=new int[arr1.length+arr2.length];
		
		
		for(int i=0;i<arr3.length;i++)
		{
			if(i<arr1.length)
			{
				arr3[i]=arr1[i];
			}
			else
			{
				arr3[i]=arr2[i-arr1.length];
			}
		}
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
	}
	
	
	

}
