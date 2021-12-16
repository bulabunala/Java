package µÚ9ÕÂ¿ÎºóÁ·Ï°;

import java.util.Random;
public class Random9_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Random[] random=new Random[50];
		for(int i=0;i<50;i++) {
			random[i]=new Random(1000);
		}
		for(int i=0;i<50;i++) {
			System.out.println("The random is "+random[i].nextInt(100));
			
		}
		
	}

}

