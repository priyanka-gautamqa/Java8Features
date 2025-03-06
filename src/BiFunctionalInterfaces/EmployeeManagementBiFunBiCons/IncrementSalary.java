package BiFunctionalInterfaces.EmployeeManagementBiFunBiCons;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class IncrementSalary {

    /*Increment Employee salary by using bifunction and biconsumer*/

    public static void main(String[] args) {

        ArrayList<EmployeeInfo> empList = new ArrayList<EmployeeInfo>();

        /*Bi-function to take two input arguments [property of employee] - name and salary
        and generate employee object or return employee object
        */

        BiFunction<String,Double,EmployeeInfo> empObjFun = (name,salary)->new EmployeeInfo(name,salary);
        empList.add(empObjFun.apply("priya",1000.0));
        empList.add(empObjFun.apply("giya",2000.0));
        empList.add(empObjFun.apply("diya",3000.0));
        empList.add(empObjFun.apply("siya",4000.0));
        empList.add(empObjFun.apply("niya",5000.0));

        System.out.println("==============Before increment==============");
        for(EmployeeInfo e:empList){
            System.out.println("Name : "+e.name);
            System.out.println("Salary : "+e.salary);
            System.out.println("===================");

        }

       /* Bi-Consumer to accept two arguments -employee object and increment value[double for e.g. 500]
                Perfor action - increase salary by incremental value*/

        BiConsumer<EmployeeInfo,Double> c = (e,increment)->e.salary=e.salary+increment;

       /*  for each employee - increase the salary of with some increment value for e.g. 500.0*/

        for(EmployeeInfo e:empList){
            c.accept(e,500.0);
        }

        /*for each employee - print the new salary with name*/
        System.out.println("==============After increment==============");
        for(EmployeeInfo e:empList){
           System.out.println("Name : "+e.name);
            System.out.println("New Salary : "+e.salary);
            System.out.println("===================");

        }

    }

}
