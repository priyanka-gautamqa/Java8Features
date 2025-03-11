package dateAndTime;

import java.time.Year;
import java.util.Scanner;

public class YearExample {

    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter year number :");
        int n = sc.nextInt();

        Year y = Year.of(n);
        //Check if given year is leap year or not
        if(y.isLeap()){
            System.out.printf("%d Year is leap year",n);
        }
        else{
            System.out.printf("%d Year is not leap year",n);

        }


    }
}
