package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class AgeInvalidException extends Exception{
	
	public AgeInvalidException(String msg)
	{
		super(msg);
	}
	
	
}

class Table implements Runnable{

	private  int num;
	public Table(int num)
	{
		this.num=num;
	}
	@Override
	public void run() {
	
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
	
}

public class Practice {

	public static void main(String[] args) {

//		Runnable r1=new Table(2);
//		Runnable r2=new Table(5);
//		
//		Thread t1=new Thread(r1);
//		Thread t2=new Thread(r2);
//		
//		t1.start();
//		t2.start();
		
		List<String> list=new ArrayList<String>(Arrays.asList("Banana","Apple","Banana","Mango","Kiwi","Apple"));
		Map<String, Integer>map=new HashMap<String, Integer>();
		
		for(String word:list)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
//			if(map.containsKey(word))
//			{
//				map.put(word, map.get(word)+1);
//				
//			}
//			else
//			{
//				map.put(word,1);
//			}
			
		}
		System.out.println(map);
		
	}
	
}
		
//		
//
//		ArrayList<Integer> list= new ArrayList<Integer>();
//
//		list.add(20);
//		list.add(10);
//		System.out.println(list.get(1));
//		
//		try {
//			throw new AgeInvalidException("Age is less than 18");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
