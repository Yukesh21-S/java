package model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmp {
	
	
	static public void main(String arr[]) throws IOException
	{
		FileOutputStream f=new FileOutputStream("//home//dell//Desktop//test//sample.txt");
		
		ObjectOutputStream o=new ObjectOutputStream(f);
		
		Employee e=new Employee("yukesh","SoftwareDeveloper",20);
		o.writeObject(e);
		System.out.print("successfully seriablized");
		o.close();
		f.close();
		
	}

}
