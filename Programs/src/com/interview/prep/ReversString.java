package com.interview.prep;


//Revers String
public class ReversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		StringBuilder rev=new StringBuilder();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			rev.append(ch);
		}
		System.out.println(str);
		System.out.println(rev);

	}

}
