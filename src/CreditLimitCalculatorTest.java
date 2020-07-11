import java.util.Scanner;
public class CreditLimitCalculatorTest {
	public static void main(String[] args) {
		
		CreditLimitCalculator accountName = new CreditLimitCalculator();
		CreditLimitCalculator creditLimit = new CreditLimitCalculator();
		CreditLimitCalculator AmountSpent = new CreditLimitCalculator();
		CreditLimitCalculator accountBalance = new CreditLimitCalculator();

		
		//Scanner for Account name
		Scanner owner = new Scanner(System.in);
		System.out.print("Enter YOUR NAME HERE: ");
		String theName = owner.nextLine();
		accountName.setName(theName);
		
		//Scanner for credit Limit
		Scanner credit = new Scanner(System.in);
		System.out.print("Enter CREDIT LIMIT HERE: ");
		double theCreditLimit = credit.nextDouble();
		creditLimit.setCreditLimit(theCreditLimit);
		
		//Scanner for Amount spent
		Scanner input  = new Scanner(System.in);
		System.out.print("ENTER AMOUNT SPENT: ");
		double currentAmountSpent = input.nextDouble();
		AmountSpent.setAmountSpent(currentAmountSpent);
		
		//Scanner for accountBalance
		Scanner input2 = new Scanner(System.in);
		System.out.print("ENTER YOUR ACCOUNT BALANCE HERE: ");
		double yourAccountBalance = input2.nextDouble();
		accountBalance.setAccountBalance(yourAccountBalance);
		
		
		
		if(currentAmountSpent > theCreditLimit)
			System.out.print("Your Credit limit has been exceeded");
		else
			System.out.printf("YOUR ACCOUNT BALANCE IS %f",accountBalance.getAccountBalance());
		
		
		

		//System.out.print(accountName.getName());
		
		
		
	}

}

class CreditLimitCalculator{
	private String accountName;
	private int accountNumber;
	private double accountBalance;
	private double creditLimit;
	private double AmountSpent;
	
	//constructor for account Name
	public void setName(String accountName) {
	this.accountName = accountName;
	}
	
	public String getName() {
		return accountName;
	}
	
	//constructor for credit Limit
	
	public void setCreditLimit(double creditLimit) {
	this.creditLimit = creditLimit;
	}
	
	public double getCreditLimit() {
	return creditLimit;
	
	}
	
	public void setAmountSpent(double AmountSpent) {
		this.AmountSpent = AmountSpent;
	}
	
	public double getAmountSpent() {
		return AmountSpent;
	}
	
	public void setAccountBalance(double yourAccountBalance) {
		this.accountBalance = yourAccountBalance;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
}




