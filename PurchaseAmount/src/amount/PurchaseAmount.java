package amount;
import java.util.Scanner;
public class PurchaseAmount {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		double Amount = scan.nextDouble();
		Check(Amount);
	}
	
	public static void Check(double Amount) {
		if(Amount>100) {
			System.out.println("Discount Applicable");
		}
	}

}
