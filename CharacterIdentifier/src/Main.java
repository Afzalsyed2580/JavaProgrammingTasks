import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a character to check whether it is a digit or vowel or consonant or special character: ");
	char ch = scan.next().charAt(0);
	identifyCharacter(ch);
}
public static void identifyCharacter(char ch)
{
if(Character.isDigit(ch)){
	System.out.println("Entered Character "+ch+" is Digit");
}
else if(!Character.isLetter(ch)) {
	System.out.println("Entered character "+ch+" is a Special Character");
}
else {
	switch(Character.toLowerCase(ch)) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		if(Character.isLowerCase(ch)) {
			System.out.println("Entered character "+ch+" is lowercase vowel");
		}
		else {
			System.out.println("Entered character "+ch+" is uppercase vwel");
		}
		break;
		default:
			if(Character.isLowerCase(ch)) {
				System.out.println("Entered character "+ch+" is lower case consonant");
			}
			else {
				System.out.println("Entered character "+ch+" is upper case consonant");
			}
	}
}
}
}