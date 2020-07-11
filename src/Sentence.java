/**
 * 
 */

/**
 * @author DELL
 *
 */
import java.util.Scanner;
public class Sentence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("what is your secret question:?");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		System.out.printf("Your secret question is:%s", sentence);
		
	}
	

}
