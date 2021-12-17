package 数组三道题;
import java.util.*;

public class _7_3 {

	public static void main(String[] args) {
		System.out.println("Enter ten integers between 1 and 100: ");
		Scanner input=new Scanner(System.in);
        int[] counts=new int[101];
        for(int i=0;i<101;i++) {
        	counts[i]=0;
        }
        while(true) {
        	int num=input.nextInt();
        	counts[num]++;
        	if(num==0)
        		break;
        }
        for(int i=0;i<=100;i++) {
        	if(counts[i]!=0) {
        		if(counts[i]>1)
        			System.out.println(i+" occurs "+counts[i]+" times");
        		else
        			System.out.println(i+" occurs 1 time");
            }
        }
	}

}
