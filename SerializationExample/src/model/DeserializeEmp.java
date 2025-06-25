package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmp {

	
	public static void main(String... strings) throws IOException, ClassNotFoundException
	{
		ObjectInputStream oi=new ObjectInputStream(new FileInputStream("/home/dell/Desktop/test/sample.txt"));
		
		
		Employee e=(Employee)oi.readObject();
		
		System.out.println(e);
	}
}
