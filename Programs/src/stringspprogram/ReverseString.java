package stringspprogram;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Shubham";
		String find="S";
		reverse(str);
		System.out.println();
		System.out.println(countcharecter(str, find));

	}

	static void reverse(String str) {
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	static int countcharecter(String str,String f)
	{
		int count=0;
		int index=str.indexOf(f);
		for(int i=0;i<str.length();i++)
		{
			while(index!=-1)
			{
				count++;
				index =str.indexOf(f,index+1);
			}
		}
		
		return count;
	}
}
