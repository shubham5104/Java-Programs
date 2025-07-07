package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fis=new FileInputStream("E:\\Resume\\Java\\obj.txt");
			
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Student st=(Student)ois.readObject();
		
			System.out.println("Name: " + st.getName());
			System.out.println("Age: " + st.getAge());
			System.out.println("Address: " + st.getAddress());
			System.out.println("Email: " + st.getEmail());
			System.out.println("Deserialization Done");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
