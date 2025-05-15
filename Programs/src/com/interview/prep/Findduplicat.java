package com.interview.prep;

public class Findduplicat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "programming";
		duplicate(str);
		
		
	}
	static void duplicate(String str) {
		String dupl="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(str.indexOf(ch) != i && !dupl.contains(String.valueOf(ch)))
			{
				dupl+=ch;
			}
			
		}
		System.out.println(dupl);
	}
	
	
	
	
	static void findAllDuplicate(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for (int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.print(str.charAt(i));
					break;
				}
					
			}
		}
	}

}
