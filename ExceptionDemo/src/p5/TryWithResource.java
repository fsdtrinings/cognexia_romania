package p5;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResource {

	public static void main(String[] args) {

		
		try(BufferedReader br = new BufferedReader(new FileReader("OneFile.txt")))
		{
		
			
			
		
		}
		catch (Exception e) 
		{
		
			
		}//end of catch
		

	}//end of main
}//end of class
