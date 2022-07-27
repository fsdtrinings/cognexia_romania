package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyClass1
{
	
	String filePath = "C:\\Users\\Hp\\Desktop\\HCL_Romania\\FileHandlingApp";

	public static void main(String[] args) {
		
		try {
			
			MyClass1 obj = new MyClass1();
			obj.createFile("MyFile1.txt");
					
		} catch (IOException e) {
			System.out.println(e);
		}
	
	}
	
	public void createFile(String fileName)throws IOException
	{
		File f = new File(filePath+"\\"+fileName);
		
		boolean status = f.exists();
		System.out.println(status);
		
		System.out.println("-------------------------------------");
		
		status = f.createNewFile();
		System.out.println(status);
		
		//writeDataOverFile(f);
		readFile(f);
	}
	
	
	public void writeDataOverFile(File f)throws IOException
	{
		FileWriter fw = new FileWriter(f, true);
		PrintWriter pw = new PrintWriter(fw);
		
		
		pw.write("- HCL");
		pw.close();
		
		System.out.println(" ---- Done ----");
	}
	
	public void readFile(File f)throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String line = "";
		
		line = br.readLine();
		System.out.println("--->> "+line);
	}
	
}//end class























