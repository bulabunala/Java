package µÚ3_5ÕÂ¿ÎºóÌâ;
import java.util.Scanner;
public class _03_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		float x=Math.abs(input.nextFloat());
		float y=Math.abs(input.nextFloat());
		if ((x*x+y*y)<=100)
		{
			System.out.print("Point ("+x+" , "+y+") is in the circle");
		}
		else System.out.print("Point ("+x+" , "+y+") is not in the circle");

	}

}
