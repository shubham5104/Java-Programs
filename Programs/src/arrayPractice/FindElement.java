package arrayPractice;


//  Wap enter an array and search any particular element and find the count.
public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {2,4,5,3,11,7,66,55,44};
		int find=66;
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]==find)
			{
				System.out.println(find+" is found on "+i+" index ");
				break;
			}
		}
	}

}
