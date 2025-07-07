package arrayPractice;

public class ZeroPushEnd {

	public static void main(String[] args) 
	{

		int[] arr= {4,5,0,0,0,0,0,1,9,0,5,0};
		int n= arr.length;
		int count=0;
		int arr2[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				arr2[count++]=arr[i];	
			}	
			
		}
		for(int i=count;i<n;i++)
		{
			arr[i]=0;
		}

		for(int i=0;i<n;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}

}
