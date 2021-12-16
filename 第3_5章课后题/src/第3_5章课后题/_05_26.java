package 第3_5章课后题;

public class _05_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum,e=1;
		for(int i=10000;i>0;i--) {
			sum=1;
			for(int j=i;j>0;j--) {
				sum=sum*j;
			}
		    e+=1/sum;
		}
		System.out.print("i=10000时 e="+e);
	}

}
