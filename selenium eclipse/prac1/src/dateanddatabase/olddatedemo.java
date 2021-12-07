package dateanddatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class olddatedemo { 
public static void main(String[] args) {
	Date date=new Date();
	System.out.println(date);
	System.out.println(date.getTime());
	Calendar expdate= new GregorianCalendar(2011,10,11);
	System.out.println(expdate.getTime());
	System.out.println(expdate.getTimeZone());
	String[] timezone=TimeZone.getAvailableIDs();
	ArrayList<String> k=  new ArrayList<>(Arrays.asList(timezone));
	System.out.println(k);
}
}
