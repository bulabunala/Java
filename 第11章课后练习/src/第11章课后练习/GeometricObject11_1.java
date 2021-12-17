package µÚ11ÕÂ¿ÎºóÁ·Ï°;

import java.util.Date;
import java.util.Scanner;
class GeometricObject11_1 {
	private String color="white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/*Construct a default geometric object*/
	public GeometricObject11_1() {
		dateCreated=new java.util.Date();
	}
	/*Construct a geometric object with the specified color,and filled value*/
	public GeometricObject11_1(String color,boolean filled) {
		dateCreated=new java.util.Date();
		this.color=color;
		this.filled=filled;
	}
	/*Return color*/
	public String getColor() {
		return color;
	}
	
	/*Set a new color*/
	public void setColor(String color) {
		this.color=color;
	}
	
	/*Return filled,Since filled is boolean, its getter method is named isFilled*/
	public boolean isFilled() {
		return this.filled;
	}
	/*Set a new filled*/
	public void setFilled(boolean filled) {
		this.filled=filled;
	}
	/*Get dateCreated*/
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	/*Return a string representation of this object*/
	public String toString() {
		return "created on "+dateCreated+"\ncolor: "+color+"and filled: "+filled;
	}
	
	
}
class Triangle11_1 extends GeometricObject11_1{
	double side1=1.0;
	double side2=1.0;
	double side3=1.0;
	private String isFilled;
//	String color="black";
//	boolean isFilled=false;
	Triangle11_1(){
		super();
		this.side1=1.0;
		this.side2=1.0;
		this.side3=1.0;
	}
	Triangle11_1(double side1,double side2,double side3){
		super();
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public double get_side1() {
		return this.side1;
	}
	public double get_side2() {
		return this.side2;
	}
	public double get_side3() {
		return this.side3;
	}
	public double getArea() {
		double p=(this.side1+this.side2+this.side3)/2;
		return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
	}
	public double getPerimeter() {
		return this.side1+this.side2+this.side3;
	}
	public String toString() {
		return "Triangle: side1= "+this.side1+
				" side2= "+this.side2+" side3= "+this.side3+
				"\nArea: "+this.getArea()+" Perimeter: "+this.getPerimeter()+
				"\nColor: "+this.getColor()+" and filled: "+this.isFilled;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the three sides for triangle: ");
		Triangle11_1 tri=new Triangle11_1(input.nextDouble(),input.nextDouble(),input.nextDouble());
		System.out.print("Enter a color for the triangle: ");
		tri.setColor(input.next());
		System.out.print("Enter a boolean for isFilled: ");
		tri.setFilled(input.nextBoolean());
		System.out.println(tri.toString());
	}

}


