package arrayPractice;

//Q2.Wap to find the sum and count of odd element
public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5,6,7,8};
		int sum=0,count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
				sum+=arr[i];
			}
		}
		System.out.println("Sum  : "+sum+"\nOdd elements : "+count);
	}

}
