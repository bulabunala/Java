package 第3_5章课后题;
import java.util.Scanner;
public class _03_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请分别输入三条边长：");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a+b>c&&a+c>b&&b+c>a) 
		{
			System.out.print("三角形周长为：");
			System.out.print(a+b+c);
		}
		
		else System.out.print("不能构成三角");

	}

}
