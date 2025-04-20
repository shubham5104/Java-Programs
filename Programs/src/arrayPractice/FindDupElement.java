package arrayPractice;

public class FindDupElement {

	public static void main(String[] args) {
		
		
		int num[]= {1, 3, 4, 2, 2,3};
		System.out.print("Duplicate Elements are : ");
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					System.out.print(num[i]+" ");
					break;
				}
			}
		}

	}

}
