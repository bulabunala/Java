package ��3_5�¿κ���;
import java.util.Scanner;
public class _03_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("��ֱ����������߳���");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a+b>c&&a+c>b&&b+c>a) 
		{
			System.out.print("�������ܳ�Ϊ��");
			System.out.print(a+b+c);
		}
		
		else System.out.print("���ܹ�������");

	}

}
