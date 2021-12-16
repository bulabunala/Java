package µÚ9ÕÂ¿ÎºóÁ·Ï°;

import java.util.Scanner;
public class meetPoint9_12 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.print("Enter x1,y1,x2,y2,x3,y3,x4,y4: ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double x3=input.nextDouble();
		double y3=input.nextDouble();
		double x4=input.nextDouble();
		double y4=input.nextDouble();
		double k1=(y1-y2)/(x1-x2);
		double k2=(y3-y4)/(x3-x4);
		double b1=(y1-k1*x1);
		double b2=(y3-k2*x3);
		
		LinearEquation9_11 lin=new LinearEquation9_11(-1*k1,1,b1,-1*k2,1,b2);
		System.out.format("x is %.1f and y is %.1f", lin.getX(),lin.getY());
	}

}

