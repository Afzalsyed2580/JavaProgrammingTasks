import java.util.Scanner;
public class Main {
public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the sides of the polygon: ");
	int sides = scan.nextInt();
	PolygonCheck(sides);
	
	}
public static void PolygonCheck(int sides) {
	if(sides<0) {
		System.out.println("Please enter positive value");
	}
	else {
		
	
	switch(sides) {
	case 3:
		System.out.println("Traingle");
		break;
	case 4:
		System.out.println("Quadrilateral");
		break;
	case 5:
		System.out.println("Pentagon");
		break;
	case 6:
		System.out.println("Hexagon");
		break;
	case 7:
		System.out.println("Heptagon");
		break;
	case 8:
		System.out.println("octagon");
		break;
	
	default:
		System.out.println("Polygon");
}
}
}
}

