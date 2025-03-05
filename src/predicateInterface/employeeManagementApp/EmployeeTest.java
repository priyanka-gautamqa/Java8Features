package predicateInterface.employeeManagementApp;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeTest {

    public static void populate(ArrayList<Employee> list){
        list.add(new Employee("Durga","CEO",30000,"Hyderabad"));
        list.add(new Employee("Sunny","Manager",20000,"Hyderabad"));
        list.add(new Employee("Mallika","Manager",20000,"Bangalore"));
        list.add(new Employee("Kareena","Lead",15000,"Hyderabad"));
        list.add(new Employee("Katrina","Lead",15000,"Bangalore"));
        list.add(new Employee("Anushka","Developer",10000,"Hyderabad"));
        list.add(new Employee("Kanushka","Developer",10000,"Hyderabad"));
        list.add(new Employee("Sowmya","Developer",10000,"Bangalore"));
        list.add(new Employee("Ramya","Developer",10000,"Bangalore"));
    }

    /*we use display method to iterate each element of list
    and call test method of Predicate interface
    and then print accordingly*/
    public static void display(Predicate<Employee> p , ArrayList<Employee> list){
        for(Employee e: list){
            if(p.test(e)){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args){

    ArrayList<Employee> list = new ArrayList<Employee>();


/*    Employee e1= new Employee("Durga","CEO", 30000,"Hyderabad");
        Employee e2= new Employee("Priya","Manager", 20000,"Hyderabad");

        list.add(e1);
        list.add(e2);
    System.out.println(list);

    ---- we will use populate method to add multiple employees
    */
        populate(list);
//        System.out.println(list);


      /*  Predicate to print all managers
                from the list of employees*/
        System.out.println(" --------------------------");
        System.out.println("Print all managers from the list of employees : ");
        Predicate<Employee> p1 = emp -> emp.designation.equals("Manager");
        display(p1,list);

        System.out.println(" --------------------------");
        System.out.println(" Print all employees from Bangalore location : ");
        Predicate<Employee> p2 = emp -> emp.city.equals("Bangalore");
        display(p2,list);

        System.out.println(" --------------------------");
        System.out.println(" Print all employees with salary less than 20000 : ");
        Predicate<Employee> p3 = emp -> emp.salary<20000;
        display(p3,list);

        System.out.println(" --------------------------");
        System.out.println(" Print all managers from bangalore : ");
        display(p1.and(p2),list);

        System.out.println(" --------------------------");
        System.out.println(" Print all employees who are either manager or salary less than 20000: ");
        display(p1.or(p3),list);

        System.out.println(" --------------------------");
        System.out.println("Print all employees who are not managers : ");
        display(p1.negate(),list);


        /*there is default static methiod in predicate functional interface
            isEqual method.
        We can define the predicate to check the equality or predicates
                */
        System.out.println(" --------------------------");
        System.out.println("Check if Employee is CEO or not ? ");
        Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Durga","CEO",30000,"Hyderabad"));

        //Add two new employees and check if any of them is CEO
        Employee e1=new Employee("Durga","CEO",30000,"Hyderabad");
        Employee e2=new Employee("Sunny","Manager",20000,"Hyderabad");
        System.out.println(isCEO.test(e1));//true
        System.out.println(isCEO.test(e2));//false

    }

}
