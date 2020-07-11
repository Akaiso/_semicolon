import java.util.Scanner;

/*import java.util.Scanner;
public class AccountsTest {

	public static void main(String[] args){
		Accounts newName = new Accounts();
		Accounts newBalance = new Accounts();
		
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER YOUR NAME HERE:");
		String theName = input.nextLine();
		newName.setName(theName);
		
		System.out.println("ENTER DEPOSIT AMOUNT:");
		Scanner input2 = new Scanner(System.in);
		double anbalance = input2.nextDouble();
		newBalance.setBalance(anbalance);
		
		System.out.printf("Your Account name is: %s%n", newName.getName());
		System.out.printf("Your Account balance is: %.2f %n", newBalance.getBalance());
		
		System.out.println("ENTER NEW DEPOSIT AMMOUNT: ");
		Scanner input3 = new Scanner(System.in);
		double recentBalance = input3.nextDouble();
		System.out.printf("your new balance is: %.2f", newBalance.getBalance()+recentBalance);
	}
}

 class Accounts{
	private double balance = 0;
	private String name;
	
	/*public Accounts(String name, double balance) {
		this.name = name;
		this.balance = balance;	
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public double getBalance(){
		return balance;
	}
}
*/

public class AccountsTest{
	public static void main(String[] args) {
		
		Accounts typedName = new Accounts();
		Accounts balance = new Accounts();
		
		System.out.print("ENTER YOUR NAME HERE: ");
		Scanner newName = new Scanner(System.in);
		String theName = newName.nextLine();
		typedName.setName(theName);
		
		System.out.print("ENTER YOUR ACCOUNT BALANCE HERE: ");
		Scanner theBalance = new Scanner(System.in);
		double accBalance = theBalance.nextDouble(); 
		balance.setBalance(accBalance);
		
		System.out.printf("your name is: %s%n", typedName.getName());
		System.out.printf("your account balance is: %f%n", balance.getBalance());
		
		
	}
}

class Accounts{
	private String name;
	private double balance;
	
	public void setName(String typedName) {
		name = typedName;
	}
	/* this setName can also be written in another form if the instance variable and the 
	 * variable created when creating a new object in the main method i.e Accounts name = new Accounts();
	 * 
	 * public void setName(String typedName) {
	 
		this.name = name;
	}
	*/
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	public String getName(){
		return name;
	}
	public double getBalance(){
		return balance;
	}
}