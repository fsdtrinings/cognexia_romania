package stream.assignment;

public class Policy {

	int policyNumber;
	String policyName;
	int premiumAmount;
	int sumAssuredAmount;
	LocalDate premiumDate;
	
	public Policy(int policyNumber, String policyName, int premiumAmount, int sumAssuredAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyName = policyName;
		this.premiumAmount = premiumAmount;
		this.sumAssuredAmount = sumAssuredAmount;
	} 
	
	
}
