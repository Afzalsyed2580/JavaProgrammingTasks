import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Purchase Amount : ");
	double PurchaseAmount = scan.nextDouble();
	CheckDiscount(PurchaseAmount);
}
public static void CheckDiscount(double PurchaseAmount) {
	if(PurchaseAmount >100) {
		System.out.println("Discount Applicable");
	}
	else {
		System.out.println("Discount Not Applicable");
	}
}
}
