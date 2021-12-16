package 第3_5章课后题;

public class _05_27 {
	public static void main(String[] args) {
		int count=0;
		for(int i=101;i<=2101;i++) {
			if((i%4==0 && i%100!=0)||(i%400==0)) {
				count++;
				if(count%10==0) {
					System.out.printf("%4d",i);
					System.out.println();
				}
				else 
					System.out.printf("%4d ",i);
				
			}
		}
		System.out.println();
		System.out.print("共有"+count+"个闰年");
	}

}
