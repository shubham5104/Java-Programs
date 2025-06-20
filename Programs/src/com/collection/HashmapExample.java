package com.collection;

import java.util.HashMap;

public class HashmapExample {

	public static void main(String[] args) {
		String str="Shubham";
		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
		char[] arr=str.toCharArray();
		 
		for(Character ch : arr)
		{
			if(map.get(ch)!=null)
			{
				map.put(ch, map.get(ch)+1);
			}
			else
				map.put(ch, 1);
		}
		System.out.println(map);
	}
}
