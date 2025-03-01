package functionInterface.employeeData;

public class EmployeeData {

    String name;
    double salary;


    EmployeeData(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }

    @Override
    public String toString() {
        String s = String.format("%s,%.2f", name, salary);
        return s;
    }

}
