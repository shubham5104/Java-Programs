package com.string;

import java.util.Arrays;



@FunctionalInterface
interface A{
	abstract void methodA();
	
	
}

@FunctionalInterface
interface B extends A{
	
}

public class AanagramString {

	public static void main(String[] args) {
		
		String str1="TAP";
		String str2="PAT";
		String[] sarr= {"tap","pat","student","students","lamp","lens"};
		
		for(int i=0;i<sarr.length;i++)
		{
			char[]ch1=sarr[i].toCharArray();
			Arrays.sort(ch1);
			
			for(int j=0;j<sarr.length;j++)
			{
				if(sarr[i]==sarr[j])
				System.out.println(sarr[j]);
			}
		}
		char[]ch1=str1.toCharArray();
		char[]ch2=str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		str1=new String(ch1);
		str2=new String(ch2);
		
		if(str1.equals(str2))
		{
			System.out.println("String is Anagram");
		}
		else {
			System.out.println("String is Not Anagram");
		}
	}

}
