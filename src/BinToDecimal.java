/*
 * import java.util.Scanner;
 

public class BinToDecimal {
	public static void main(String[] args) {
		
		int decimalNumber = 0;
		int power = 0;
		
		//This was the former code and it still works but after a while it was modified with the code above
		outerloop: // this outer loop labels the while loop. It stands as a reference. you can name it anything so long as the word comes before the colon , followed by a while statement
		while(true) {
			System.out.println("Enter binary number to convert to decimal");
			Scanner input = new Scanner(System.in);
			int binaryNumber = input.nextInt();
			if(binaryNumber >= 0 && binaryNumber <= 1) {
				
				while(binaryNumber !=0) {
					int modulus = binaryNumber % 10;
					decimalNumber = decimalNumber + modulus * (int)Math.pow(2,power);
					binaryNumber = binaryNumber/10;
					power++;
				}
				break;
			}
			else {
				continue outerloop;//this will continue from line 9 instead of line 16
			}
		}
		System.out.println(decimalNumber);
	}

}
*/

import java.util.Scanner;
public class BinToDecimal{
	
	public static void main(String[] args) {
		
		int decimalNumber = 0; // stores the final value of the decimal number.
		int power = 0;         // the power to which base two is raised.
		
		outerloop:             //label for outer while loop. allows break or continue statement to reference this loop.
			while(true) {
				System.out.println("Enter binary number to convert to decimal");
				Scanner input = new Scanner(System.in);
				int binaryNumber = input.nextInt();
				int binaryCheck = binaryNumber;
				int binaryA = 0;
				int binaryB = 0;
				
				while(binaryCheck > 0) {
					System.out.println("check passed");
					if((binaryCheck%10 == 0 || binaryCheck%10 == 1)) {
						binaryA++;
						binaryB++;
						binaryCheck = binaryCheck/10;
						System.out.println("modulus check passed");
						System.out.println(binaryA);
						System.out.println(binaryB);
						
					}
					else {
						System.out.println("check not passed");
						continue outerloop;
					}
				}
				if(binaryA == binaryB) {
					while(binaryNumber !=0) {
						int modulus = binaryNumber % 10;
						decimalNumber = decimalNumber + modulus * (int)Math.pow(2,power);
						binaryNumber = binaryNumber/10;
						power++;
						
					}
					break;
				}
				else {
					continue;
				}
			}
		System.out.println(decimalNumber);
	}
}
