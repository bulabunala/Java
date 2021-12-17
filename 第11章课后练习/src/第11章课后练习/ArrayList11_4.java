package µÚ11ÕÂ¿ÎºóÁ·Ï°;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList11_4 {

	public static void main(String[] args) {
		System.out.print("Enter numbers (0 finished): ");
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = input.nextInt();
		while (n != 0) {
			list.add(n);
			n = input.nextInt();
		}
		System.out.println("The maximum is " + max(list));
	}
	public static Integer max(ArrayList<Integer> list) {
		if (list == null || list.size() == 0)
			return null;
		else
			return java.util.Collections.max(list);
	}

}


