package µÚ9ÕÂ¿ÎºóÁ·Ï°;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class GregorianCalendar9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar calendar=new GregorianCalendar();
		System.out.println(calendar.get(GregorianCalendar.YEAR)+"\t"+(calendar.get(GregorianCalendar.MONTH)+1)+"\t"+calendar.get(GregorianCalendar.DAY_OF_MONTH));
		calendar.setTimeInMillis(1234567898765L);
		System.out.println(calendar.get(GregorianCalendar.YEAR)+"\t"+(calendar.get(GregorianCalendar.MONTH)+1)+"\t"+calendar.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
