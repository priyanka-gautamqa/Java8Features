package functionInterface.employeeData;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeDataTest {

    public static void populate(ArrayList<EmployeeData> l){
        l.add(new EmployeeData("Sunny",1000));
        l.add(new EmployeeData("Bunny",2000));
        l.add(new EmployeeData("Chinny",3000));
        l.add(new EmployeeData("Pinny",4000));
        l.add(new EmployeeData("Vinny",5000));
    }
    public static void main(String[] args) {

        ArrayList<EmployeeData> list = new ArrayList<EmployeeData>();
        populate(list);
    System.out.println(" ALL EMPLOYEES : "+list);
        /*Function to find
        Total Monthly Salary of All Employees*/

        Function<ArrayList<EmployeeData>, Double> totalSalary = l -> {
            double total = 0.0;
            for(EmployeeData e : l ){
                total=total+e.salary;
            }
            return total;
        };

        System.out.println("TOTAL SALARY : "+totalSalary.apply(list));

 /*perform Salary Increment
    for Employee by
    using Predicate & Function:
    */
        System.out.println("SALARY BEFORE INCREMENT : ");
        System.out.println(list);

        //Predicate to check if employee salary less than 3500
        Predicate<EmployeeData> p = emp->emp.salary <3500;

        /*Function to increment salary
        Argument type is EmployeeData and  return type is also EmployeeData
                because we will update the salary [by 477] and
    return the updated employee not just updated salary
        */
        Function<EmployeeData,EmployeeData> f1= e-> {
            e.salary = e.salary + 477;
              return e;
        };

        /*Now  we are performing change in employe data

*/

        ArrayList<EmployeeData> updatedEmployeeList = new ArrayList<EmployeeData>();
        for(EmployeeData e:list){
            if(p.test(e)){
                f1.apply(e);
                updatedEmployeeList.add(e);
            }
        }
        System.out.println("==========================EMPLOYEE WHO GOT THE  INCREMENT =======================");
        System.out.println(updatedEmployeeList);

        System.out.println("NEW UPDATED LIST OF ALL EMPLOYEE");
        System.out.println(list);
        }

    }


