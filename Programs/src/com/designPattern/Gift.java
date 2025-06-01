package com.designPattern;

//Eager way to create singleton Object
public class Gift {

	private static Gift gift=new Gift();
	
	public static Gift getGift() {
		return gift;
	}
}
