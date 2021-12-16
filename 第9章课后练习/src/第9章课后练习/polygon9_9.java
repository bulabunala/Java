package 第9章课后练习;


public class polygon9_9 {
	private int n=3;//定义边数
	private double side=1;//边长
	private double x=0,y=0;//中点的坐标
	polygon9_9(){
		n=3;
		side=1;
		x=0;
		y=0;
	}
	polygon9_9(int n,double side){
		this.n=n;
		this.side=side;
		this.x=0;
		this.y=0;
	}
	polygon9_9(int n,double side,double x,double y){
		this.n=n;
		this.side=side;
		this.x=x;
		this.y=y;
	}
	public void setN(int n) {
		this.n=n;
	}
	public void setSide(double side) {
		this.side=side;
	}
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y) {
		this.y=y;
	}
	public int getN() {
		return this.n;
	}
	public double getSide() {
		return this.side;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public double getPerimeter() {
		return this.n*this.side;
	}
	public double getArea() {
		return this.n*this.side*this.side/4.0/Math.tan(Math.PI/this.n);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polygon9_9 p1=new polygon9_9();
		polygon9_9 p2=new polygon9_9(6,4);
		polygon9_9 p3=new polygon9_9(10,4,5.6,7.8);
		System.out.println("Perimeter: "+p1.getPerimeter()+"\tArea: "+p1.getArea());
		System.out.println("Perimeter: "+p2.getPerimeter()+"\tArea: "+p2.getArea());
		System.out.println("Perimeter: "+p3.getPerimeter()+"\tArea: "+p3.getArea());
	}

}

