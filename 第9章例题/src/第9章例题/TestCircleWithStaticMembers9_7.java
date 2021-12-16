package µÚ9ÕÂÀýÌâ;

public class TestCircleWithStaticMembers9_7 {
/*Main method*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Before creating objects");
		System.out.print("The number of Circle objects is "+Circle9_6.numberOfObjects);
		
		//Create c1
		Circle9_6 c1=new Circle9_6();
		
		//Display c1 BEFORE c2 is created
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius ("+c1.radius+") and number of Circle objects ("+c1.numberOfObjects+")");
		
		//Create c2
		Circle9_6 c2=new Circle9_6(5);
		
		//Modify c1
		c1.radius=9;
		
		//Display c1 and c2 AFTER c2 was created
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius ("+c1.radius +") and number of Circle objects ("+c1.numberOfObjects +")");
		System.out.println("c2: radius ("+c2.radius +") and number of Circle objects ("+c2.numberOfObjects +")");
		

	}

}

