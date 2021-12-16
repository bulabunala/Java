package µÚ9ÕÂ¿ÎºóÁ·Ï°;


public class Fan9_8 {
	public static int SLOW=1,MEDIUM=2;
	public static int FAST=3;
	private int speed=SLOW;
	private boolean on=false;
	private double radius=5;
	private String color="blue";
	public void setSpeed(int m) {
		this.speed=m;
	}
	public void setOn(boolean m) {
		this.on=m;
	}
	public void setRadius(double r) {
		this.radius=r;
	}
	public void setColor(String str) {
		this.color=str;
	}
	public int getSpeed() {
		return this.speed;
	}
	public boolean getOn() {
		return this.on;
	}
	public double getRadius() {
		return this.radius;
	}
	public String getColor() {
		return this.color;
	}
	Fan9_8(){
		speed=SLOW;
		radius=5;
		on=false;
		color="blue";
	}
	public String toString() {
		if(this.on==true) {
			return this.getSpeed()+" "+this.getColor()+" "+this.getRadius();
		}
		else {
			return "fan is off "+this.getColor()+" "+this.getRadius();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan9_8 f1=new Fan9_8();
		f1.setSpeed(FAST);
		f1.setRadius(10);
		f1.setColor("yellow");
		f1.setOn(true);
		Fan9_8 f2=new Fan9_8();
		f2.setSpeed(MEDIUM);
		System.out.println(f1.toString());
		System.out.println(f2.toString());
	}

}
