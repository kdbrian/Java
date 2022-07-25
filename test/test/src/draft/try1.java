package draft;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class try1 {

    public static void main(String[] args) {

        GregorianCalendar gregorianCalendar=new GregorianCalendar();

        System.out.println(gregorianCalendar.getTime());

        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.getDate());
        System.out.println(date.getYear());


        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getTime());

    }
}
