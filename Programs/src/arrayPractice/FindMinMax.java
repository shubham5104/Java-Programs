package arrayPractice;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr = {1,22,55,44,33,8,56};
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
			else if(max<arr[i])
				max=arr[i];
			
		}
		System.out.println("Minimum element of Array : "+min+"  \nMaximum element of Array : "+max);
		
	}

}
