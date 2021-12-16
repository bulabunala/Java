package µÚ3_5ÕÂ¿ÎºóÌâ;
import java.util.Scanner;
public class _03_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=(int)(Math.random()*13+1);
		int hua=(int)(Math.random()*4);
		String a="0",b="0";
		if(num==1) a="Ace";
		else if (num==11) a="Jack";
		else if (num==12) a="Queen";
		else if (num==13) a="King";
		else a=String.valueOf(num);
		switch(hua) {
		case 0:b="Clubs";
		    break;
		case 1:b="Diamonds";
		    break;
		case 2:b="Heart";
		    break;
		case 3:b="Spades";
		    break;
		}
		System.out.print("The card you picked is "+a+" of "+b);
		

	}

}
