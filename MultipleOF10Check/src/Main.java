import java.util.Scanner;
public class Main
{
public static void checkMultipleOfTen(int n)
{
if(n%10 == 0) {
	System.out.println("Multiple of Ten ");
}
else {
	System.out.println("Not A Multiple of Ten ");
}

}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter the nuumber: ");
int n = scan.nextInt();
checkMultipleOfTen(n);

}
}

