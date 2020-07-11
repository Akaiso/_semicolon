
/*public class NumbersToTen {
	public static void main(String[] args) {
	
	int counter = 1;
	int x = 0;
	int y = x+counter;
	
	while (x < 10) {
		x+=counter;
		System.out.println(x);	
	}
	counter++;
	}
	
}
*/

public class NumbersToTen {

	public static void main(String...arg) {
		
		
		int x = 0;
		int sum = 0; 
		
		while(x < 10) {
			sum = sum + x;
			x = x + 1;
			System.out.println(x);
		}
	System.out.println();
		System.out.printf("The sum is: %d", sum);
				
	}
	
}

