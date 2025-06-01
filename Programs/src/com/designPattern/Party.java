package com.designPattern;

public class Party {

	public static void main(String[] args) {
		
		Cack cack= Cack.getCack();
		Cack cack1=Cack.getCack();
		
		System.out.println(Gift.getGift().hashCode());
		System.out.println(Gift.getGift().hashCode());
		
		System.out.println(cack.hashCode());
		System.out.println(cack1.hashCode());
		
	}

}
