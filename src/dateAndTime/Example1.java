package dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Example1 {

    public static void main(String[] args){
        //current/system date
        LocalDate date = LocalDate.now();
        System.out.println("system date : "+date);

        //current/system time
        LocalTime time = LocalTime.now();
        System.out.println("system time : " +time);


       /* Get day value, month value, year value
        Print in my own format*/

int day = date.getDayOfMonth();
int month = date.getMonthValue();
int year = date.getYear();
        System.out.println("=====================");
System.out.println("MY format is dd-mm-yyyy : ");
System.out.printf("%d-%d-%d",day,month,year);
        System.out.println();


      /*  Get hour value, minute value, second value
        Print in my own format*/


int hour = time.getHour();
int minutes = time.getMinute();
int seconds = time.getSecond();
int nano = time.getNano();
        System.out.println("========================");
        System.out.println("MY format is hh:mm:ss:nn : ");
        System.out.printf("%d:%d:%d:%d",hour,minutes,seconds,nano);
        System.out.println();

        /*
        Local date time
                */
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("============================");
        System.out.println("Local date time : "+localDateTime);
        int day1 = localDateTime.getDayOfMonth();
        int month1 = localDateTime.getMonthValue();
        int year1 = localDateTime.getYear();
        int hour1 = localDateTime.getHour();
        int minutes1 = localDateTime.getMinute();
        int seconds1 = localDateTime.getSecond();
        int nano1 = localDateTime.getNano();
        System.out.println("============================");
        System.out.println("LOCAL DATE AND TIME IN OUR FORMAT");
        System.out.printf("%d-%d-%d  %d:%d:%d:%d",day1,month1,year1,hour1,minutes1,seconds1,nano1);

       /*
       We can also present a particular date as well
        other than the current date and time
        */
        System.out.println("============================");
        LocalDateTime dt = LocalDateTime.of(1993, Month.MAY,19,06,30,29,7896);
        System.out.println("Provided time and date is the date of birth: "+dt);

/*

        We can also get future date from some date as well

*/
        System.out.println("============================");
        System.out.println("After 6 months from above date of birth : "+dt.plusMonths(6));

        System.out.println("============================");
        System.out.println("Before 6 months from above date of birth : "+dt.minusMonths(2));

    }
}
