package ��3_5�¿κ���;

public class _05_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double money=10000;
		double sum=0;
		for(int i=1;i<=10;i++) {
			money=money*1.05;
		}
		System.out.println("ʮ����ѧ��Ϊ��"+money);
		for(int i=1;i<=4;i++) {
			money=money*1.05;
			sum+=money;
		}
		System.out.println("ʮ��������ڵ���ѧ��Ϊ��"+sum);
	}

}
