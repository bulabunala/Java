package µÚ3_5ÕÂ¿ÎºóÌâ;

public class _05_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8;
		int j=0, i=0;
		for(i=0;i<n;i++) {
			int num=1;
			for(j=0;j<(n-i-1);j++) {
				System.out.print("    ");
				}
			for(j=n-i-1;j<n-1;j++) {
				System.out.printf("%4d",num);
				num=num*2;
			    }
			for(j=n-1;j<n+i;j++) {
				System.out.printf("%4d",num);
				num=num/2;	
			    }
			for(j=n+i;j<2*n-1;j++) {
				System.out.print("    ");
				}
			if(j==2*n-1) System.out.print("\n");
			
		}

	}

}
