package µÚ3_5ÕÂ¿ÎºóÌâ;

public class _05_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double PI=0,sum=0,a;
		for(double i=1;i<100000000;i++) {
			a=1/(i*2-1)*Math.pow(-1,i+1);
			sum+=a;
			//System.out.print(sum);
		}
		PI=4*(sum);
		System.out.print(PI);


	}

}
