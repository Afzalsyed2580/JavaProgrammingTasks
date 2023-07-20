package grade;
import java.util.Scanner;
public class GradeCheck {
public static void main(String [] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the grade of the Student");
	int grade = scan.nextInt();
	Check(grade);
	}
public static void Check(int grade) {
	if(grade<50) {
		System.out.println("FAIL");
		
	}
	else {
		System.out.println("PASS");
	}
}
}
