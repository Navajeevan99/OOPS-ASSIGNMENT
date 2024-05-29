package lq;
import java.util.Scanner;

//Define the Circle class implementing the GeometricShape interface
public class ExecuteMain
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Choos a geometric shape:");
		System.out.println("1.Triangle");
		System.out.println("2.Rectangle");
		System.out.println("3.Circle");
		System.out.println("Enter your choice:");
		int n=s.nextFloat();
		
		if (n==1)
		{
			System.out.println("Enter lengths of the three sides of Triangle:");
			GeometricShape i=new Triangle();
			i.area();
			i.perimeter();
			
		}
		else if (n==2)
		{
			System.out.println("Enter length and breadth of Rectangle:");
			GeometricShape i1=new Rectangle();
			i1.area();
			i1.perimeter();
		}
		else if (n==3)
		{
			System.out.println("Enter radius o  Circle:");
			GeometricShape i2=new Circle();
			i2.area();
			i2.perimeter();
		}
		else{
			System.out.println("Invalid choice");
		}
	}
}