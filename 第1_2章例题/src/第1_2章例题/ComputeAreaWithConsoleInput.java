package µÚ1_2ÕÂÀıÌâ;
import java.util.Scanner;

public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner object
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		//Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius=input.nextDouble();
		
		//Comeput area
		double area=radius*radius*3.14159;
		
		//Display results
		System.out.println("The area for the circle of radius "+radius+" is "+area);
		

	}

}
