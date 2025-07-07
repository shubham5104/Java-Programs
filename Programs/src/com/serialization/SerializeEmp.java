package com.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeEmp {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		
		emp1.setId(101);
		emp1.setName("Rohit");
		emp1.setEmail("rohit@gmail.com");
		emp1.setSalary(50000);
		
		System.out.println(emp1);
		
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\shubh\\OneDrive\\Desktop\\file.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(emp1);
			oos.close();
			fos.close();
			System.out.println("Done Serialization");
		} catch (Exception e) {
		
			System.out.println(e);
		
		}
		
		
	}

}
