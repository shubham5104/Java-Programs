package arrayPractice;


public class Clockwise90degree {
	public static void main(String args[])
	{
	
	int a[][]=  {{1,2,3},
				 {4,5,6},
				 {7,8,9}
				};
	
	for (int i=0;i<a.length;i++)
	{
			for(int j=0;j<=a[i].length-1;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
//	System.out.println("After Rotation of Anti Clockwise 90D");
//	for (int i=a.length-1;i>=0;i--)
//	{
//		for(int j=0;j<=a[i].length-1;j++)
//		{
//			System.out.print(a[j][i]+" ");
//		}
//		System.out.println();
//	}
//	
//	System.out.println("After Rotation of Anti Clockwise 180D");
//	for (int i=a.length-1;i>=0;i--)
//	{
//		for(int j=a[i].length-1;j>=0;j--)
//		{
//			System.out.print(a[i][j]+" ");
//		}
//		System.out.println();
//	}
//	System.out.println("After Rotation of Anti Clockwise 270D");
//	for (int i=0;i<a.length;i++)
//		{
//			for(int j=a[i].length-1;j>=0;j--)
//			{
//				System.out.print(a[j][i]+" ");
//			}
//			System.out.println();
//		}
	
	

}
}
