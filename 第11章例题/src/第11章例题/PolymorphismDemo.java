package µÚ11ÕÂÀýÌâ;

public class PolymorphismDemo {

	public static void main(String[] args) {
		//display circle and rectangle properties
		displayObject(new Circle(1,"red",false));
		displayObject(new Rectangle(1,1,"black",true));

	}
	
	//display geometric object properties
	public static void displayObject(GeometricObject object) {
		System.out.println("Created on "+object.getDateCreated()+" Color is "+object.getColor());
	}

}
