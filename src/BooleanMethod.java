             //BOOLEAN METHOD TO CHECK A USER INPUT

import java.util.Scanner;

public class BooleanMethod{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Whole number here: ");
		
		if(input.hasNextInt()) { //check if the input is an integer
			int number = input.nextInt(); //then assign the value to a variable
			System.out.print(number);
			}
		else
			System.out.print("Error; enter a valid Integer: ");
	}
}