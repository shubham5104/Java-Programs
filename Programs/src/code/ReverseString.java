package code;

public class ReverseString {

	public static void main(String[] args) {
		String str ="abcd";
		for(int i=0;i<str.length();i++)
		{
			for(int j =i+1;j<=str.length();j++)
			{
				System.out.print(str.substring(i, j)+", ");
			}
		}	
	}
}

//input: java is fun

//output:nuf si avaj

//avaj si nuf

//Input: "abc"
//Output: "a", "ab", "abc", "b", "bc", "c"


