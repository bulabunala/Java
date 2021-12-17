package 数组三道题;
import java.util.*;
public class _7_2 {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in) ;
			System.out.println("Enter ten integers: ");
			int[] nums=new int[10];
			for(int i=0;i<10;i++) {
				nums[i]=input.nextInt();
			}
			for(int j=9;j>=0;j--) {
				System.out.print(nums[j]+" ");
			}
		}

	}

