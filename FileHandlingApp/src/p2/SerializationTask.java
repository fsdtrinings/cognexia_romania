package p2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTask {
	
	String filePath = "C:\\Users\\Hp\\Desktop\\HCL_Romania\\FileHandlingApp";
	
	public static void main(String[] args) 
	{
		
		SerializationTask app = new SerializationTask();
		
		Employee e = new Employee(101, "Mike", 2000);
		
		Project p = new Project("My Bank App");
		e.setProject(p);
		
		try {
			//app.saveEmployee("EmpSer.txt", e);
			
			app.readObject("EmpSer.txt");
		} catch 
		(Exception e2) {
			System.out.println(e2);
		}
		
		
	}

	public void readObject(String fileName)throws IOException,ClassNotFoundException
	{
		File f = new File(filePath+"\\"+fileName);
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e = (Employee) ois.readObject();
		
		System.out.println(e);
		
		
	}
	
	public void saveEmployee(String fileName,Employee e)throws IOException
	{
		File f = new File(filePath+"\\"+fileName);
		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e);
		
		System.out.println(" Object saved in File ");
		
	}
}
