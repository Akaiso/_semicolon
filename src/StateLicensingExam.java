import java.util.Scanner;

public class StateLicensingExam {
	public static void main(String...args) {
		
		int counterPass = 0;
		int counterFail = 0;
		int counter = 1;
		int result = 0;
		
		
		//while(counter <= 10) ...while or for loop will work
		for( counter = 1; counter <= 10; counter++){
			System.out.println();
		System.out.println("Enter 1 if passed or 2 if failed here:");
		Scanner input = new Scanner(System.in);
		
		//next line makes sure the input from user is an integer
		if (input.hasNextInt()) {
		result = input.nextInt();
		

		if (result == 1) {
			counterPass = counterPass + 1;
			
		}
		else if(result == 2) {
			counterFail = counterFail + 1;
			
		}
		else if(result != 1 || result != 2) {
			System.out.println("NOT RECORDED:");
			//next line will deduct counter from expected total of 10
			counter--;
		}
		

		}
		else {
			System.out.println("NOT RECORDED");
			//next line will deduct counter from expected total of 10

			counter--;
		}
		}
		
		System.out.println(counterPass + " student(s) passed");
		System.out.println();
		System.out.println(counterFail + " student(s) failed");
		System.out.println();
		if(counterPass > 8) {
		System.out.println("Bonus to Instructor!");	
		}
	}

}
