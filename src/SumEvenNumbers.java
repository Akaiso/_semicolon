/*
public class SumEvenNumbers {
	public static void main(String...args) {
		int x = 2;
		int sum = 0;
		
		while (x <= 20) 
		{
			sum = sum + x;
					System.out.println(x);
					x = x + 2;		
		}
		
		System.out.printf("the sum of the even numbers is: %d ", sum);
	}
}
*/

public class SumEvenNumbers{
	public static void main(String[] args) {
		int sum = 0;
		int x = 1;
		int counter = 0;
		
		while(x <= 50) {
			if (x % 2 == 0) {
						System.out.println(x);
						sum = sum + x;

				}
			x++;
			counter++;
			if (counter == 20) {
				break;
			}
			
			}
		System.out.println();
		System.out.printf("THE SUM IS %d", sum);
		

			
		}
	}
//}
