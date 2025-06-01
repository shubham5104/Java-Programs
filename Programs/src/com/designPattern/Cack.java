package com.designPattern;

//LAZY Singleton pattern
public class Cack {

	static Cack cack;
	private Cack()
	{
		
	}
	
	public static Cack getCack() {
		if(cack == null) {
			cack= new Cack();
		}
		return cack;
	}
	

}
