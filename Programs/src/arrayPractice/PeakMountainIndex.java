package arrayPractice;

public class PeakMountainIndex {

	public static void main(String[] args) {

		int[] arr= {0,2,1,0};

		int start=0;
		int end=arr.length-1;
		
		while(start<end)
		{
			int mid=(start+end)/2;
			
			if(arr[mid]<arr[mid+1])
				start=mid+1;
			else
				end=mid;
			
			
		}
		System.out.println(start);

	}

}
