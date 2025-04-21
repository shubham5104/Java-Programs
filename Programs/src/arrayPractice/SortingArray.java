package arrayPractice;

public class SortingArray {

	public static void main(String[] args) {
		int[] arr= {4,3,6,22};
		
		sortDecending(arr);
	}
	
	static void sortDecending(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
