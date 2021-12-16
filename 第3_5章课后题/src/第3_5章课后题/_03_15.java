package 第3_5章课后题;
import java.util.Scanner;
public class _03_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=(int)(Math.random()*1000);//生成随机数
		if(num<100) num=(int)(Math.random()*1000);
		int[] a=new int[3];//把随机数放入数组中
		int i;
		for(i=0;i<3;i++) {
			a[i]=num%10;
			num=num/10;
			//System.out.print(a[i]);
		}
		System.out.print("输入你所猜的数字：");
		Scanner input=new Scanner(System.in);
		int guessnum=input.nextInt();
		int[] b=new int[3];
		for(i=2;i>=0;i--) {
			b[i]=guessnum%10;
			guessnum=guessnum/10;
		}
		System.out.print("你所获得的奖金为：");
		if(a[0]==b[0] && a[1]==b[1] && a[2]==b[2]) {
			System.out.println(10000);
		}
		else if((a[0]==b[0]||a[0]==b[1]||a[0]==b[2])&&(a[1]==b[0]||a[1]==b[1]||a[1]==b[2])&&(a[2]==b[0]||a[2]==b[1]||a[2]==b[2])) 
		{
			System.out.println(3000);
		}
		else if(a[0]==b[0]||a[0]==b[1]||a[0]==b[2]||a[1]==b[0]||a[1]==b[1]||a[1]==b[2]||a[2]==b[0]||a[2]==b[1]||a[2]==b[2])
		{
			System.out.println(1000);
		}
		else
			System.out.println(0);

	}

}
