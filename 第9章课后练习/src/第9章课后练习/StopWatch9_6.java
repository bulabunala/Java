package µÚ9ÕÂ¿ÎºóÁ·Ï°;

import java.util.Date;
import java.util.Random;
public class StopWatch9_6 {
	Date time=new Date();
	private long startTime=System.currentTimeMillis();
	private long endTime=System.currentTimeMillis();
	public StopWatch9_6() {
		this.startTime=System.currentTimeMillis();
		this.endTime=System.currentTimeMillis();
	}
	public void start() {
		this.startTime=System.currentTimeMillis();
	}
	public void stop() {
		this.endTime=System.currentTimeMillis();
	}
	public long getElapsedTime() {
		return this.endTime-this.startTime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] a =new long[100000];
		long mid;
		StopWatch9_6 t=new StopWatch9_6();
		for(int i=0;i<100000;i++) {
			a[i]=(long)(Math.random()*1000000);
		}
		t.start();
		for(int i=0;i<100000;i++) {
			for(int j=i+1;j<100000;j++) {
				if(a[i]>a[j]) {
					mid=a[i];
					a[i]=a[j];
					a[j]=mid;
				}
			}
		}
		t.stop();
		System.out.println("The time is "+t.getElapsedTime()+"ms");
	}

}

