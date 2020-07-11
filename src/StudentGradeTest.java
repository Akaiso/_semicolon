//import java.util.Scanner;

//STUDENT CLASS THAT STORES STUDENT NAME AND AVERAGE using constructors

public class StudentGradeTest{
	public static void main(String[] args) {
		
		//System.out.println("Enter your name here: ");
		//Scanner input = new Scanner(System.in);
		//String name = input.nextLine();
		
		StudentGrade student1 = new StudentGrade("Ernest",20.00);
		StudentGrade student2 = new StudentGrade("Hannah", 60.00);
		//StudentGrade average = new StudentGrade();
//		student1.setstudentName("Ernest");
		
		System.out.printf("student1 name is %s and Average is %.2f %n",
				student1.getstudentName(),student1.getstudentAverage());
		System.out.printf("student2 name is %s and Average is %.1f %n",
				student2.getstudentName(), student2.getstudentAverage());
		
		System.out.println("student1 your Grade is: " + student1.getstudentGrade());
		System.out.printf("student2 your Grade is: " + student2.getstudentGrade());
		
		
	}
}

class StudentGrade{
	private String studentName;
	private double studentAverage;
	//private String studentGrade;
	
	public StudentGrade(String studentName , double studentAverage) {
		
		this.studentName = studentName;
		
//		if(studentAverage > 0.00)
//	    if(studentAverage <= 100)
	
	this.studentAverage = studentAverage;
	}
	
	public void setstudentName(String studentName) {
	this.studentName = studentName;
	}
	
	public String getstudentName() {
	return studentName;
	}
	public void setstudentAverage(double studentAverage) {
	this.studentAverage = studentAverage;
	}
	public double getstudentAverage() {
		return studentAverage;
	}
	
	public String getstudentGrade() {
		 String studentGrade = " ";
		 
		 if(studentAverage > 100 || studentAverage <0 ) 
			 studentGrade = "GRADE MUST BE > 0.00 OR < 100.00";
		
		 else if (studentAverage >=90 )
			studentGrade ="A";
		 else if(studentAverage >=75 )
				studentGrade ="B";
		 else if(studentAverage >= 50.0 )
				studentGrade ="C";
		 else if(studentAverage >= 40.0)
				studentGrade ="D";
		 else if(studentAverage >= 30.0 )
				studentGrade ="E";

		 else 
				studentGrade ="F";

		 
		 return studentGrade;
	}
	
	
	
	
}