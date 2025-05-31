package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class MethodRefrencing {

	public static void main(String[] args) {
		List<String> snum=Arrays.asList("1","2","3","4","5","6","7");

		System.out.println(snum);
		
		List<Integer>num = snum.stream().map(Integer::parseInt).toList();
		
		for(Integer n :num)
		{
			System.out.println(n);
		}
		
		
		
	}

}
