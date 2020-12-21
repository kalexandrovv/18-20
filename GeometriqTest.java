package temi18do20;
import java.util.Scanner;

public class GeometriqTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		String colour;
		Boolean filled;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter triangle's sides : ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter triangle's colour : ");
		colour=sc.nextLine();
		System.out.println("Is the triangle filled ? ");
		filled=sc.nextBoolean();
		
		Triangle triangle = new Triangle(a,b,c);
		triangle.setColour(colour);
		triangle.setFilled(true);
		System.out.println(triangle.printTriangle());
		
		System.out.println("Area = " + triangle.getArea() 
				+ ", Perimeter = " + triangle.getPerimeter()
				+ ", Colour = " + triangle.getColour()
				+ ", Filled : " + triangle.getFilled());
	}

}
