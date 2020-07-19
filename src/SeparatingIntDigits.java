
	import java.util.InputMismatchException;
	import java.util.Scanner;

public class SeparatingIntDigits {
	
		/*
		 * // private int input = 0; // public int input(int input) { // this.input =
		 * input; // return input; // }
		 * 
		 * // // public int getInputs() { //
		 * System.out.print("Enter a 5 digit integer here: "); // Scanner input = new
		 * Scanner(System.in); // // int userInput = input.nextInt(); // // return
		 * userInput; // }
		 */	
			
			public static void main(String[] args) {
			
		label:
			while(true) {
			
			System.out.println("Enter a 5 digit integer here: ");
	        Scanner input = new Scanner(System.in);		
			//SeparatingDigits digit = new SeparatingDigits();
			
			int number = 0;
		

			while(true) {
				
				
				try {
					number =   input.nextInt();    // this is part of the block of comments above.  input.getInputs();
				}
				catch(Exception e) {
		//			e.printStackTrace();
					System.out.println("its wrong");
					System.out.println();
					
					continue label;
					
				}
				break;
			}

		if(number / 10000 > 0 && number/10000 <= 9) //(number > 9999 && number <= 99999)
			{

			
		    int firstNumber = number / 10000;  //isolates the first among the five digits inputed.
		    int firstNumberr = number % 10000;  //provides the remaining four digits from the user"s input
		    
		    int secondNumber = firstNumberr / 1000;
		    int secondNumberr = firstNumberr % 1000;
		    
		    int thirdNumber = secondNumberr / 100;
		    int thirdNumberr = secondNumberr % 100;
		    
		    int fourthNumber = thirdNumberr /10;
		    int fourthNumberr = thirdNumberr % 10;
		    
//		    int fifthNumber = fourthNumberr / 1;
//		    int fifthNumberr = fourthNumberr % 1; //this value is not used hence the next line of code:
		    
		    int fifthNumber = fourthNumberr;
		 
			
			System.out.printf("%d %3d %3d %3d %3d", firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
			}
		else {
			System.out.println("WRONG");
			System.out.println();

			continue label;}
		System.out.println();
		

			}
		}
		}
		

