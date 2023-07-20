package marks;
import java.util.Scanner;
public class Grades {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = scan.nextInt();
		if (marks<50) {
			System.out.println("D grade - Congratulations");
		}
		else if(marks <60 && marks >=50) {
			System.out.println("C grade - Congratulation");
		}
		else if(marks <70 && marks >=60) {
			System.out.println("B grade - Congratulations");
		}
		else if(marks < 80 && marks >=70) {
			System.out.println("A grade - Cngratulations");
		}
		else {
			System.out.println("A+ grade - Cngratulations");
		}
	}

}