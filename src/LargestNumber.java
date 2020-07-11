import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {
		
		int num;
		int counter = 1;
		int largestNumb = 0;
		
		while(counter <= 10) {
			System.out.println("Enter number:");
			Scanner input = new Scanner(System.in);
			num = input.nextInt();
			
			if(num > largestNumb) 
				largestNumb = num;
			counter++;
				}
		System.out.printf("The Largest Number is: %d",largestNumb);
		
	}

}
