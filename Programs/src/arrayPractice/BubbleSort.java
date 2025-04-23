package arrayPractice;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,6,4,9,6};

		ascendingSort(arr);
		displayArray(arr);
		System.out.println();
		descendingSort(arr);
		displayArray(arr);
		
	}
	
	static int[] ascendingSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		return arr;
	}
	static int[] descendingSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]<arr[j+1]) 
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		return arr;
	}
	static void displayArray(int[]arr) {
		for(int n:arr)
		{
			System.out.print(n+" ");
		}
	}

}
