package µÚ9ÕÂ¿ÎºóÁ·Ï°;

import java.util.Arrays;
import java.util.Scanner;
public class Location9_13 {
	public int row=0,column=0;
	public double maxValue=0;
	
	Location9_13(){
		this.row=0;
		this.column=0;
		this.maxValue=0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of rows and columns in the array: ");
		Scanner input=new Scanner(System.in);
		int rows=input.nextInt();
		int columns=input.nextInt();
		System.out.print("Enter the array");
		double[][] a=new double[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				a[i][j]=input.nextDouble();
			}
		}
		Location9_13 location=new Location9_13();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(a[i][j]>location.maxValue) {
					location.maxValue=a[i][j];
					location.row=i;
					location.column=j;
				}
			}
		}
		System.out.format("The location of the largest element is %f at (%d, %d)",location.maxValue,location.row,location.column);
	}

}
