package dateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonalExample {


    public static void main(String[] args){

        //Find out the default time zone of your system

        ZoneId zone = ZoneId.systemDefault();
        System.out.println("Your System zone : "+zone);

        //Find out  the current date and time as per some specifics zone
        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime dt = ZonedDateTime.now(la);
        System.out.println("Date and time in LA is : "+dt);


    }
}
