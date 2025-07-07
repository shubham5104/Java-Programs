package com.java8Feature;

import java.util.Optional;

//class Demo{
//	
//	String str;
//	
//	public Optional display() {
//		String str="Shubham";
//		return Optional.ofNullable(str);
//		
//	}
//}

public class OptionalExample {

	public static void main(String[] args) {
		
		int n1 = 0,n2 = 1,n3;
		System.out.print(n1 + " " + n2);
		for(int i = 0; i < 10;i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);

					}
		
//		Demo d=new Demo();
		
//		d.display();
//		Optional name=d.display();
//		System.out.println(name);

//		int n1=0,n2=1,n3;
//		System.out.print(n1+" "+n2+" ");
//		for(int i=0;i<8;i++)
//		{
//			n3=n1+n2;
//			System.out.print(n3+" ");
//			n1=n2;
//			n2=n3;
//						
//		}
	}

}
