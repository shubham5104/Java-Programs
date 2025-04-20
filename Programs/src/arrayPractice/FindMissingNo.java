package arrayPractice;

public class FindMissingNo {

	public static void main(String[] args) {
		int num[]= {3,0,1};
		int n=num.length;
		
		int expsum=(n*(n+1))/2;
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum+=num[i];
		}
		int miss=expsum-sum;
		
		System.out.println("Missing No is = "+miss);

	}

}
