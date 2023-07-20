import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int num= scan.nextInt();
	int sum=0;
	for (int i = 0;i<=num;i++) {
		sum = sum+i;
		
	}
	System.out.println("The Sum of "+num+"Natural numbers are :"+sum);
}
}
