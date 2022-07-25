package p1;

public class MainApp {

	public static void main(String[] args) {
		
		Account a = new Account(101, "Mike", 2000);
		
		System.out.println(a.getBalance());//2000
		
		a.deposite(500);
		System.out.println(a.getBalance());//2000
		
		
		a.withdrawal(800);
		System.out.println(a.getBalance());//2000
		
	}
}
