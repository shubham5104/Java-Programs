package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeEmp {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\shubh\\OneDrive\\Desktop\\file.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Employee emp= (Employee) ois.readObject();
			
			System.out.println(emp);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
