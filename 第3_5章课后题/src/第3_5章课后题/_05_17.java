package µÚ3_5ÕÂ¿ÎºóÌâ;
import java.util.Scanner;
public class _05_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n=input.nextInt();
		int j=0, i=0;
		for(i=0;i<n;i++) {
			int num=i+1;
			for(j=0;j<(n-i-1);j++) {
				System.out.print("  ");
				}
			for(j=n-i-1;j<n-1;j++) {
				System.out.print(num+" ");
				num--;
			    }
			for(j=n-1;j<n+i;j++) {
				if(j==n+i-1) System.out.print(num);
				else System.out.print(num+" ");
				num++;	
			    }
			for(j=n+i;j<2*n-1;j++) {
				System.out.print("  ");
				}
			if(j==2*n-1) System.out.print("\n");
			
		}

	}

}
