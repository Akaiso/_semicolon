import java.util.Scanner;
public class TwoLargestNumbers {
	public static void main(String[] args) {
		
		int num;
		int counter = 1;
		int largestNumb = 0;
		int secondLargestNumb = 0;
		
		while(counter <= 7) {
			System.out.println("Enter number:");
			Scanner input = new Scanner(System.in);
			num = input.nextInt();
			
			if(num > largestNumb) {
				secondLargestNumb = largestNumb;
				largestNumb = num;
			}
			else
				if(num > secondLargestNumb)
					secondLargestNumb = num;
			counter++;
			
				}
		System.out.printf("The Two Largest Numbers are: %d and %d",largestNumb, secondLargestNumb);
		
	}
}