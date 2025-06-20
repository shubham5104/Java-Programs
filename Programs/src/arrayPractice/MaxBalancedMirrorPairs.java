package arrayPractice;

import java.util.Scanner;

public class MaxBalancedMirrorPairs {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);

	        // Input size
	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();

	        // Input array
	        int[] arr = new int[n];
	        System.out.print("Enter array elements: ");
	        for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Function call
	        int result = findMaxBalancedMirrorPairs(n, arr);
	        System.out.println("Output: " + result);
	    }

	
	 public static int findMaxBalancedMirrorPairs(int input1, int[] input2){
	        int n = input1;
	        int[] arr = input2;

	        int targetSum = arr[0] + arr[n - 1];
	        int count = 0;

	        for (int i = 0; i < n / 2; i++) {
	            if (arr[i] + arr[n - 1 - i] == targetSum) {
	                count++;
	            } else {
	                break;
	            }
	        }

	        return count;
	    }

}
