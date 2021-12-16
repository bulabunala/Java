package µÚ3_5ÕÂ¿ÎºóÌâ;
import java.util.Scanner;
public class _03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first 9 dihits of an ISBN as integer:");
		int num=input.nextInt();
		int d=0,sum=0,i=9,ISBN10=0,ISBN09=num;
		while(num>0) {
			d=num%10;
			sum+=d*i;
			num=num/10;
			if(num>0)
			i--;
		}
		ISBN10=sum%11;
		//System.out.println(sum);
		if(num==0 && i==2) {
			if(ISBN10==10){
				System.out.print("The ISBN-10 number is:");
				System.out.print("0");
				System.out.print(ISBN09);
				System.out.print("X");
			}
			
			else{
				System.out.print("The ISBN-10 number is:");
				System.out.print("0");
				System.out.print(ISBN09);
			    System.out.print(ISBN10);
			}
		}
		else {
			if(ISBN10==10){
				System.out.print("The ISBN-10 number is:");
				System.out.print(ISBN09);
				System.out.print("X");
			}
			
			else{
				System.out.print("The ISBN-10 number is:");
				System.out.print(ISBN09);
				System.out.print(ISBN10);
			}
		}
		

	}

}
