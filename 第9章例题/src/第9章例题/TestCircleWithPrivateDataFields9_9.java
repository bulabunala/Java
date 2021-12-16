package µÚ9ÕÂÀýÌâ;

public class TestCircleWithPrivateDataFields9_9 {
/*Main method*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a circle with radius 5.0
		Circle9_8 myCircle=new Circle9_8(5.0);
		System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		
		//Increase myCircle`s radius by 10%
		myCircle.setRadius(myCircle.getRadius()*1.1);
		System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		System.out.println("The number of objects created is "+Circle9_8.getNumberOfObjects());
	}

}
