
 /*public class PatternCH5 {
 

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int size = 10;
		
			
			for(int j = 0; j<size; j++) {
			 
					System.out.print("*");
				
					
			}
			System.out.println();
		
			
		
	}

}
 
	
 

        		//NEW CODE

public class PatternCH5{
	public static void main(String[] args) {
		int i= 1;
		int j=1;
		int space= j+1;
		
		for(i=1; i<=10;i++) {
		
		for(j=1; j<=10; j++) {
			//System.out.print("*");
			
			if(j>=i)
				System.out.print("*");
			else
				System.out.print(" ");
			//space++;
		}
		System.out.println();
			
		}
		
	}
}



				//NEW CODE

public class PatternCH5{
	public static void main(String[] args) {
		int i= 1;
		int j=1;
		int space= j+1;
		
		for(i=1; i<=10;i++) {
		
		for(j=1; j<=10; j++) {
			System.out.print("*");
			
			if(j<=i)
				System.out.print("*");
			else
				System.out.print("");
			//space++;
		}
		System.out.println();
			
		}
		
	}
}
*/

				//NEW CODE

/* public class PatternCH5{
   
 
	public static void main(String[] args) {
		int i= 1;
		//int k=1;
		int j=1;
		int space=10;
		
		for(i=1; i<=10;i++) {
		
		for(j=1; j<=10; j++) {
			//System.out.print("");
			
			
			if(j>=space)
				System.out.print("*");
			    
			else
				System.out.print(" ");
			//space--;
			// i++;
		     //j--;
		}
		System.out.println();
		space--;
			
		}
		
		
	}
}
 */

               //NEW CODE
import java.util.Scanner;

public class PatternDiamondCH5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//System.out.println(""Enter an odd number);
		//
		
		int numOfRows = 30;
		int numOfSpace = numOfRows/2;
		int numOfStars = 1;
		int midPoint = numOfRows/2 + 1;
		
		for(int i = 1; i <= numOfRows; i++) {
			for(int j = 1; j <= numOfSpace; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=numOfStars; k++) {
				System.out.print("*");
			}
			if(i<midPoint) {
				numOfSpace --;
				numOfStars +=2;	
			}
			else {
				numOfSpace ++;
				numOfStars -=2;
			}
			
			System.out.println();
		}
			
	}
	
}

