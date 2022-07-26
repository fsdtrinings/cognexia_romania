package p1;

public class Demo {

	int x;
	
	Demo(int x)
	{
		this.x = x;
	}
	
	public void doThis(int change)
	{
		System.out.println(x++);
		x--;
	}
}
