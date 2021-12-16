package µÚ9ÕÂ¿ÎºóÁ·Ï°;
import java.util.Scanner;
public class LinearEquation9_11 {
	private double a,b,c,d,e,f;
	LinearEquation9_11(double a,double b,double c,double d,double e,double f){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	public double geta() {
		return this.a;
	}
	public double getb() {
		return this.b;
	}
	public double getc() {
		return this.c;
	}
	public double getd() {
		return this.d;
	}
	public double gete() {
		return this.e;
	}
	public double getf() {
		return this.f;
	}
	public boolean isSolvable() {
		return this.a*this.c-this.b*this.d!=0;
	}
	public double getX() {
		return (this.e*this.d-this.b*this.f)/(this.a*this.d-this.b*this.c);
	}
	public double getY() {
		return (this.a*this.f-this.e*this.c)/(this.a*this.d-this.b*this.c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a,b,c,d,e,f: ");

		LinearEquation9_11 lin=new LinearEquation9_11(input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());
		if(lin.isSolvable()) {
			System.out.format("x is %.1f and y is %.1f",lin.getX(),lin.getY());
		}else {
			System.out.println("The equation has no solution.");
		}
	}

}
