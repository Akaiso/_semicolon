
import java.util.Scanner;
public class CompoundInterest {
	
	public static void main(String[] args) {
		
		System.out.println("CALCULATE YOUR ANNUAL COUMPOUND INTEREST RATE: ");

		
		
		
		while(true) {
			
			double a = 0;
			double r = 0.05;
			int n = 0;
			int counter = 0;
			double total = 0;
		System.out.println();
		
		System.out.println("Enter your monthly earnings here: " );
		Scanner input1 = new Scanner (System.in);
		
		
		System.out.println("Enter period (in years): ");
		Scanner input2 = new Scanner(System.in);
		
		if(input1.hasNextDouble() && input2.hasNextInt() ){
		//if(input2.hasNextInt())
		
		double monthlyEarnings = input1.nextDouble();
		double period = input2.nextDouble();

		
		for(int i = 0; i < period ; i++) {
			
			
			
			a = monthlyEarnings * Math.pow ((1+r), period );
			
			 total += a;
			
			counter++;
			
			System.out.printf(  "Your balance at the end of year  %d is  %.2f %n", counter ,total);
			
		}
		System.out.printf("%.2f",total);
		
		}else
			System.out.println("Abeg get small sense; ,I fit borrow you only if you ask with no shame");
		}
}
}
