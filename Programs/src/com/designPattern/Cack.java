package com.designPattern;

//LAZY way of creating Singleton Object
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
