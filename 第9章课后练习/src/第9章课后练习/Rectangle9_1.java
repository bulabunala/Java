package µÚ9ÕÂ¿ÎºóÁ·Ï°;

public class Rectangle9_1 {
	double width=1;
	double height=1;
	Rectangle9_1(double width,double height){
		this.width=width;
		this.height=height;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getArea() {
		return this.width*this.height;
	}
	public double getPerimeter() {
		return 2*(this.width+this.height);
	}
	public static void main(String[] args) {
		Rectangle9_1 rect1=new Rectangle9_1(4,40);
		System.out.println("The width of the rectangle is "+rect1.width);
		System.out.println("The height of the ractangle is "+rect1.height);
		System.out.println("The area of the rectangle is "+rect1.getArea());
		System.out.println("The perimeter of the rectangle is "+rect1.getPerimeter());
		Rectangle9_1 rect2=new Rectangle9_1(3.5,40);
		System.out.println("The width of the rectangle is "+rect2.width);
		System.out.println("The height of the ractangle is "+rect2.height);
		System.out.println("The area of the rectangle is "+rect2.getArea());
		System.out.println("The perimeter of the rectangle is "+rect2.getPerimeter());
	}
}

