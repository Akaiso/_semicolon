
  import java.util.Scanner;
 
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// 1ST PATTERN
		
		 for(int i = 1; i<=5; i++){
			 
			 for(int j = 1; j<=i; j++){
				 
				 System.out.print("*");
			 }
			
			     System.out.println();
		}
		 
		
		 //2ND PATTERN
		
		for(int i = 5; i>= 1; i--) {
			for(int j = 0; j<i; j++) {
			System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		// 3RD PATTERN
		
		
		int size = 10;
		int round = 1;
		
		for(int i = 1; i<= size; i++) {
			if(i == round) {
				for(int j=0; j<size - i; i++) {
					System.out.print("*");
					
				}
				
				
			} ++round;
			System.out.println();
		}
		
		//4TH PATTERN
		
		for(int i = 1; i<=size; i++) {
			for(int j = 1; j<size; j++) {
				if(j<i) {
					System.out.print(" ");
				}
					else {
						System.out.print(" ");
					}
			}
			System.out.println();
		}
		
		//5TH PATTERN
		
		System.out.println("Enter number of diamond rows");
		int odd = 1;
		int numOfRows = input.nextInt();
		int midWay = numOfRows/2;
		int noOfSpaces = numOfRows/2;
		
		for(int i = 1; i<= numOfRows; i++) {
			for(int j = 1; j<= noOfSpaces; j++) {
				System.out.println(" ");
				
			}
			for(int j = 1; j<= odd; j++) {
				System.out.print("*");
			}
			System.out.println();
				if(i<midWay) {
					odd += 2;
					--noOfSpaces;
					
				}
				else {
					odd -= 2;
					++noOfSpaces;
				}
		}
}

}

