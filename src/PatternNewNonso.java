
/* The int i is the position of the star or number of positions for the star
 * */

/*public class PatternNewNonso {
	public static void main(String[] args) {
		for(int i = 1; i<=10 ; i++) {
			for(int j = 1; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
*/

//PATTERN TWO A.:

/*public class PatternNewNonso{
	public static void main(String[]args) {
		
		for(int i = 10; i <= 10; i--) {
			for(int j = 1; j < i; j++) {
			System.out.print("*");
			}
			   System.out.println();
			   if(i == 0)
				   break;
		}
		}
	}
	*/


//PATTERN TWO B.

/*
public class PatternNewNonso{
	public static void main(String[]args) {
		for(int i = 10; i<=10; i--) {
			System.out.print("*");
		if(i==5)
			break;
		}
	}
}
*/

//PATTERN THREE

public class PatternNewNonso{
	public static void main(String[] args) {
		for(int i = 5; i<=5; i--) {
			for(int j = 1; j<i; i++ ) {
				if(j < i)
				System.out.print("");
				if (i == 0)
					break;
				else 
					System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
}