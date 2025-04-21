package arrayPractice;


//	Wap enter an array and find the sum and count of element present at even position.
public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,5,6,7,8,9,16,11};
		
		int sum=0,count=0,eleAteven=0;
		
		for(int i=0;i<arr.length;i++)
		{
			count++;
			sum+=arr[i];
			if(i%2==0)
				eleAteven++;
		}
		System.out.println("Sum  : "+sum+"\nelements : "+count+"\nelement present at even position :"+eleAteven);
	}

}
