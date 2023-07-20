import java.util.Scanner;
public class DiffOfNumbers {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter the secnd Number: ");
		int num2 = scan.nextInt();
		if (num1 > num2) {
			System.out.println(num1-num2);
		}
		else {
			System.out.println(num2-num1);
		}
	}
}
