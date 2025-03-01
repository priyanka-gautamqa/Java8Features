package CollectionWithLambda.SortingOurOwnObject;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args){
        ArrayList<Employee> l = new ArrayList<Employee>();
        l.add(new Employee(10,"subha"));
        l.add(new Employee(7,"deepa"));
        l.add(new Employee(15,"preethi"));
        l.add(new Employee(5,"aradhya"));
        System.out.println("BEFORE SORTING : "+l);
        Collections.sort(l,(e1,e2)->(e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?1:0);
        System.out.println("AFTER SORTING : "+l);

    }
}
