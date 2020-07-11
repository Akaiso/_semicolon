import java.util.Scanner;
public class BiggestNumber {
	public static void main(String[] args) {
		
		int number = 0;
		int counter = 0;
		int LargestNumber = 0;
		
		while(counter <= 10) {
			System.out.println("Enter number");
			Scanner input = new Scanner(System.in);
			number = input.nextInt();
			
			if(number > LargestNumber) {
				LargestNumber = input.nextInt();
			}
		}
	}
	
}
