/* /* set and get method which includes using constructors to
 * initialize objects 

import java.util.Scanner;
public class AccountConstructTest {
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account myAccount = new Account("james Ibori");
		Account myAccount1 = new Account("Peter Ezekiel");
		System.out.println("Please enter your name:");
		String theName = input.nextLine();
		//myAccount.setName(theName);
		
		System.out.printf("Your name is: %s%n", myAccount.getName());
		System.out.printf("Your name is: %s", myAccount1.getName());
		

	
		
			
		
		
	}

}

class Account{
	
	private String name;
	
	public Account(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

*/

