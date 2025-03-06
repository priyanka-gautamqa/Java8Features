package BiFunctionalInterfaces.EmployeeManagementBiFunc;

import java.util.function.BiFunction;

public class Calculate {

    public static void main(String[] args){

       /* Calculate monthly salary of the employee
                on the basis of daily wage and no of working days
        Monthly salary = no of days * daily wage*/

        EmployeeData ed = new EmployeeData(101,"Priya",1500);
        TimeSheetData td = new TimeSheetData(101,25);

        /*Write a bi-function to calcuclate salary
                take two arguments - Employee and timesheet
                return monthly salary*/

        BiFunction<EmployeeData,TimeSheetData,Double> f = (e,t)->e.dailyWage*t.days;

        //We can use above bi-function to calculate monthly salary of any  no of employees
        System.out.println("Monthly salary of "+ed.name+ " is "+f.apply(ed,td));

    }
}
