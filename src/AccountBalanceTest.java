import java.util.*;
public class AccountBalanceTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name here:");
		AccountBalance accName = new AccountBalance();
		AccountBalance accBalance = new AccountBalance();
		String newName = input.nextLine();
		System.out.println("Enter your deposit amount here:");
		double newBalance = input.nextDouble();
		accName.setName(newName);
		accBalance.setBalance(newBalance);
		
		System.out.printf("Your Account name is: %s%n and your new account balance is: %.2f", accName.getName(), accBalance.getBalance());
		
		
		
	}

}

class AccountBalance{
	private String name;
	private double balance;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
		
	}
	
	public double getBalance() {
		return balance;
	}
}