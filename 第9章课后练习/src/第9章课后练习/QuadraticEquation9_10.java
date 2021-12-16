package µÚ9ÕÂ¿ÎºóÁ·Ï°;

import java.util.Scanner;
public class QuadraticEquation9_10 {
	private double a,b,c;
	QuadraticEquation9_10(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
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
	public double getDiacriminant() {
		if(this.b*this.b-4*this.a*this.c>0) {
			return this.b*this.b-4*this.a*this.c;
		}
		else return 0;
	}
	public double getRoot1() {
		return (Math.sqrt(this.getDiacriminant())-this.b)/2.0/this.a;
	}
	public double getRoot2() {
		return (-1*Math.sqrt(this.getDiacriminant())-this.b)/2.0/this.a; 
	}
	public String toString() {
		if(this.getDiacriminant()==0) {
			return "The equation has one root "+this.getRoot1();
		}else if(this.getDiacriminant()>0) {
			return "The equation has two roots "+this.getRoot1()+" and "+this.getRoot2();
		}
		else return "The equation has no real roots";
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a,b,c: ");
		QuadraticEquation9_10 q1=new QuadraticEquation9_10(input.nextDouble(),input.nextDouble(),input.nextDouble());
		System.out.println(q1.toString());
		System.out.print("Enter a,b,c: ");
		QuadraticEquation9_10 q2=new QuadraticEquation9_10(input.nextDouble(),input.nextDouble(),input.nextDouble());
		System.out.println(q2.toString());
		System.out.print("Enter a,b,c: ");
		QuadraticEquation9_10 q3=new QuadraticEquation9_10(input.nextDouble(),input.nextDouble(),input.nextDouble());
		System.out.println(q3.toString());
	}

}

