package CollectionWithLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionExampleWithLambda{

    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(30);
        l.add(20);
        l.add(15);
        l.add(5);
        System.out.println("OUR LIST");
        //Ascending order
        Collections.sort(l,new MyComparator());
        System.out.println("ASCENDING ORDER WITHOUT LAMBDA");
        System.out.println(l);

        System.out.println("DESCENDING ORDER WITHOUT LAMBDA");
        //WITH LAMBDA EXPRESSION - no need of separate MyComparator class because Comparator is functional interface with only one abstarct methid
        Comparator<Integer> c = (n1,n2)-> (n1>n2)?-1:(n1<n2)?1:0;
        Collections.sort(l,c);
        System.out.println(l);

    }
}
