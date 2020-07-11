/*
public class Palindrome {
	public static void main(String[] args) {
		
		int num = 54378;
				int reversedInteger = 0;
				int remainder;
				//int originalInteger;
				int originalInteger = num;
						
						while(num != 0) {
							
							remainder = num % 10;
							reversedInteger = reversedInteger * 10 + remainder;
							num /= 10;
							
						}
				if(originalInteger == reversedInteger)
					System.out.println(originalInteger + " Is a palindrome");
				else
					System.out.println(originalInteger + " Is not a palindrome");
					
	}

}
               //NEW CODE
                * 
                
import java.util.*;
public class Palindrome{
	public static void main(String[] args) {
			
	Scanner input = new Scanner(System.in);
	int numbers = input.nextInt();
	
	int num = 121;
	int reversedInteger = 0;
	int remainder;
	int originalInteger = num;
	
	while(num != 0) {
		
		remainder = num % 10;
		reversedInteger = reversedInteger * 10 + remainder;
		num /= 10;
	}
	if(originalInteger == reversedInteger)
		System.out.println(originalInteger + " Is a palindrome");
	else
		System.out.println(originalInteger + " Is not a palindrome");
	}
}

*/

      				//NEW CODE

import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number here: ");
		
		while(true) {
		int num = input.nextInt();
		int tempNum = num;
		int result = 0;
		
		if(tempNum >10000 && tempNum <100000) {
		 while (tempNum > 0) {
			 int remainder = tempNum % 10;
			 result = result * 10 + remainder;
			 tempNum = tempNum / 10;
			
		}
		 if(num == result) {
			 System.out.println("This is a Palindrome");}
		 else
			 System.out.println("This is not a Palindrome");
		 break;
		}
		else
			System.out.println("Enter a five digit number");
		}
		 
	}
	
}