import java.util.Scanner;
public class AccountTest{
	public static void main(String[] args) {
		Account myAccount = new Account();
		System.out.println("Please enter your name:");
		Scanner input = new Scanner(System.in);
		String theName = input.nextLine();
		myAccount.setName(theName);
		System.out.printf("Your name is: %s" , myAccount.getName());
	}
}

class Account{
private String name;

public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
	
}

}
