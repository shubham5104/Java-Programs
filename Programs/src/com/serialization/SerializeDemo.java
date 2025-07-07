package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		
		Student st=new Student("Rohit", 35, "Mumbai", "rohit@gmail.com");
		
		
		try {
			FileOutputStream fos=new FileOutputStream("E:\\Resume\\Java\\obj.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(st);
			oos.close();
			fos.close();
			
			System.out.println("Serialization Done");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
