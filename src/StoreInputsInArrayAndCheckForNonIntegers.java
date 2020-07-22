
	import java.util.Scanner;

/*	
	Write an application that accepts input from a user and fills an array of 
	3 elements then prints the elements when its filled. Also check for
	wrong inputs from the testers.*/
	
public class StoreInputsInArrayAndCheckForNonIntegers {
	
		
		
		public static void main(String[] args) {
			
			int[]array = new int [3];
			
			
//			System.out.println("Enter your first number here: ");
			Scanner input = new Scanner(System.in); 
			int counter = 0;
			int number;   // not necessary
			
			while(true) {
				System.out.println("Enter a number here: ");

				try {
					number = input.nextInt();  //can be written as array[counter] = number; and forget the "number"
					array[counter] = number;
					counter++;
				} catch (Exception e) {
					input.nextLine();
					continue;
				}
				
				if (counter == 3) break;

			}
			System.out.printf("%d%5d%5d", array[0],array[1], array[2]);

		}
	}


