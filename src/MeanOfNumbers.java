import java.util.Scanner;

/*                  ALGORITHM:
  * 
  * Prompt user to enter some numbers(import scanner)
  * Check if user input is valid
  * collect and save all numbers entered
  * as you save , sum up the numbers
  * initiate a counter to increase simultaneously with the set of numbers by the user
  * divide the sum of numbers entered by user by the last number of the counter
  * use the "while" and "do...while" loop to repeat the prompt for numbers from the user
  */

public class MeanOfNumbers{
	public static void main(String[] args) {
		
		int a = 1;
		int sum = 0;
		
		while(a<=10) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a whole number: ");
			
			if(input.hasNextInt()) {
			int number = input.nextInt();
			sum = sum + number;
			a++;
			
				
			}
			else
			{System.out.print("Invalid entry, ");}
			
		}
		
		System.out.println();
		System.out.printf("Total numbers is: %d\n", sum);
		
		
	}
	
}
 
     // NEW CODE USING THE DO...WHILE LOOP

/*
public class MeanOfNumbers {

	public static void main(String[] args) {
		int a = 0;
		int counter = 0;
		int sum = 0;
		
		do {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a whole number here: ");
			if(input.hasNextInt()) {
				int number = input.nextInt();
				sum = sum + number;
				a++;
	
			}
			else {
			System.out.println("Enter a valid Integer: ");
			}
				
			
			
		}
		while(a<=10);
		
		System.out.println();
		System.out.printf("The Sum of numbers entered is: %d\n",sum);
		
	}

}
*/

