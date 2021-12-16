package µÚ3_5ÕÂ¿ÎºóÌâ;
import java.util.Scanner;
public class _03_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter r1's center x-,-ycoordinates width,and height : ");
		
		float x1=input.nextFloat();
		float y1=input.nextFloat();
		float width1=input.nextFloat();
		float height1=input.nextFloat();
		System.out.print("Enter r2's center x-,-ycoordinates width,and height : ");
		float x2=input.nextFloat();
		float y2=input.nextFloat();
		float width2=input.nextFloat();
		float height2=input.nextFloat();
		
		if (Math.abs(x2-x1)<=width1/2 && Math.abs(y2-y1)<=height1/2 )
		{
			System.out.print("r2 is inside r1");
		}
		else if(Math.abs(x2-x1)<=width1/2+width2/2 && Math.abs(y2-y1)<=height1/2+height2/2)
		{
			System.out.print("r2 overlap r1");		}
		else System.out.print("r2 does not overlap r1");

		

	}

}
