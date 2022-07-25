package p1;

public class Account {
	
	private long accountNumber;
	private String username;
	private int balance;
	
	
	// constructor 
	public Account(long accountNumber, String username, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.username = username;
		this.balance = balance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// getter & setters
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	// other business method
	
	public int deposite(int amount)
	{
		this.balance+=amount;
		return this.balance;
	}
	
	public int withdrawal(int amount)
	{                  // 700   7
		double cashBack = (amount * 0.01);
		this.balance -= amount;
		this.balance += cashBack;
		return this.balance;
	}

}
