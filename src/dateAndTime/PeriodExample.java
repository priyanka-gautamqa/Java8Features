package dateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

    public static void main(String[] args){

        LocalDate birthday = LocalDate.of(1929,05,19);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthday,today);
        System.out.println("AGE : "+p);

        System.out.printf("Age is %d years %d months and %d days.",p.getYears(),p.getMonths(),p.getDays());

        LocalDate deathDay = LocalDate.of(1929+70,05,19);
        Period p1 = Period.between(today,deathDay);
        int d = p1.getYears()*365 + p1.getMonths()*30 + p1.getDays();
        System.out.println();
        System.out.printf("Days left on earth - %d , Focus on important things.",d);

    }
}
