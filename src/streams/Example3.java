package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {

    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(0);
        l.add(25);
        l.add(15);
        l.add(20);

        System.out.println(l);
        //Default natural sorting order - ascending order or alphabetical order
        List<Integer> sortedList1 = l.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedList1 Default natural sorting order: "+sortedList1);

//Customized sorting order - descending order i want
        List<Integer> sortedList2 = l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println("sortedList2 Customized sorting order : "+sortedList2);


        //min() and max()

        //Default natural sorting order - we are specifying our own comparator
        Integer min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("minimum value : "+min);
        Integer max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("maximum value : "+max);

        //Descending sorting order - we are specifying our own comparator
        Integer min1 = l.stream().min((i1,i2)->-i1.compareTo(i2)).get();
        System.out.println("minimum value : "+min1);
        Integer max1 = l.stream().max((i1,i2)->-i1.compareTo(i2)).get();
        System.out.println("maximum value : "+max1);


    }
}
