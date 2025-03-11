package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args){

      /*  PROBLEM 1: Given list fi String names
                    Find out the names where
                        length of the name is greater >= 9*/

        ArrayList<String> names = new ArrayList<String>();
        names.add("Shahrukh");
        names.add("Amitabh");
        names.add("Salman");
        names.add("RanveerSingh");
        names.add("Nagarjuna");
        names.add("Priya");
        System.out.println("NAMES : "+names);

        List<String> l1 = names.stream().filter(s->s.length()>=9).collect(Collectors.toList());
        System.out.println("Names with length >=9 : "+l1);


        /*  PROBLEM 2: Given list of String names
                    Covert the names into uppercase letters
                       */

        List<String> l2 = names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println("Names in Uppercase form : "+l2);

         /*  PROBLEM 3: Given list of String names
                        Count the number of names whose length >=9
                       */

        long countOfNames = names.stream().filter(s->s.length()>=9).count();
        System.out.println("number of names whose length >=9 : "+countOfNames);



    }
}
