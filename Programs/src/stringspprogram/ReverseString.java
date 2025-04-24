package stringspprogram;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Shubham";
		reverse(str);

	}

	static void reverse(String str) {
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}
