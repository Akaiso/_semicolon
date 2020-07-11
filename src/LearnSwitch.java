import java.util.Scanner;
public class LearnSwitch {
	public static void main(String[] args) {
		
		
		int grade;

		
		System.out.print("PLEASE ENTER YOUR GRADE HERE: ");
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		grade = input.nextInt();
		
		switch(grade) {
		case 80: System.out.println("A");
		break;
		case 70: System.out.print("B");
		break;
		case 60: System.out.println("C");
		break;
		case 50: System.out.println("D");
		case 40: System.out.println("f");
		default: System.out.print("NULL");
		}
		

	}

}
