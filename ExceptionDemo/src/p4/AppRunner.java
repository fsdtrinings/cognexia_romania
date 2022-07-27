package p4;

public class AppRunner {

	public void doThings()throws ExceptionA,ExceptionB , ExceptionC
	{
		throw new ExceptionB();
	}
	
	public void method1() throws ExceptionA
	{
		doThings();
	}
	
	
	public static void main(String[] args) {
		
		
		AppRunner runner = new AppRunner();
		
		try
		{
			runner.method1();
		} 
		
		catch (ExceptionC e) 
		{
			e.printStackTrace();
		
		}
		catch (ExceptionA e) 
		{
			e.printStackTrace();
		} 
		
		
		
		
		
	}
}
