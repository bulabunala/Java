package µÚ3_5ÕÂ¿ÎºóÌâ;
import java.util.Scanner;
public class _03_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point's x_ and y_ coordinates: ");
		float x=input.nextFloat();
		float y=input.nextFloat();
		if (x>=0 && x<=200 && y>=0 && y<=100 && y<=-0.5*x+100)
		{
			System.out.print("Point ("+x+" , "+y+") is in the triangle");
		}
		else System.out.print("Point ("+x+" , "+y+") is not in the triangle");

	}

}
