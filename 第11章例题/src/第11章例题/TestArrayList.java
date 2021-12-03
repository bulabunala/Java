package µÚ11ÕÂÀıÌâ;
import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a lost to store cities
		ArrayList<String>cityList=new ArrayList<>();
		
		//add some cities in the list
		cityList.add("London");
		//cityLIst now contains[London]
		cityList.add("Denver");
		//cityLIst now contains[London,Denver]
		cityList.add("Paris");
		//cityLIst now contains[London,Denver,Paris]
		cityList.add("Miami");
		//cityLIst now contains[London,Denver,Paris,Miami]
		cityList.add("Seoul");
		//cityLIst now contains[London,Denver,Paris,Miami,Seoul]
		cityList.add("Tokyo");
		//cityLIst now contains[London,Denver,Paris,Miami,Seoul,Tokyo]
		
		System.out.println("List size? "+cityList.size());
		System.out.println("Is Miami in the list ? "+cityList.contains("Miami"));
		System.out.println("The location of Denver in the list ? "+cityList.indexOf("Denver"));
		System.out.println("Is the list empty? "+cityList.isEmpty());
		
		cityList.add(2,"Xian");
		cityList.remove("Miami");
		cityList.remove(1);
		
		System.out.println(cityList.toString());
		
		for (int i = cityList.size()-1;i>=0;i--)
			System.out.print(cityList.get(i)+" ");
		System.out.println();
		
		ArrayList<Circle> list=new ArrayList<>();
		
		list.add(new Circle(2));
		list.add(new Circle(3));
		
		System.out.println("The area of the circle? "+ list.get(0).getArea());
	}

}
