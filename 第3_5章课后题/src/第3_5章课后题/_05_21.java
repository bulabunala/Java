package µÚ3_5ÕÂ¿ÎºóÌâ;
import java.util.Scanner;
public class _05_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double money=input.nextDouble();
		System.out.print("Nunber of Years: ");
		int year=input.nextInt();
		System.out.println("Interest Rate    Monthlt Payment    Total Payment");
		for(double i=0.05;i<=0.08125;i=i+0.00125) {
			System.out.printf("%.3f%%",i*100);
			System.out.print("             ");
			System.out.printf("%.2f",(money*i/12)/(1-(1/Math.pow(1+i/12,year*12))));
			System.out.print("             ");
			System.out.printf("%.2f\n",12*year*(money*i/12)/(1-(1/Math.pow(1+i/12,year*12))));
		}

	}

}
