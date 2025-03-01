package predicateExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Test2 {


    public static void main(String[] args){
         /*Find length of the string
    if length is greater than 5 return true*/
        Predicate<String> p = s->s.length()>5;
        System.out.println("is length greater than 5 : "+p.test("abc"));
        System.out.println("is length greater than 5 : "+p.test("abcert"));

         /*check if given collection is empty or not*/
        Predicate<Collection> p1 = c->c.isEmpty();
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        System.out.println("Is array list empty : " +p1.test(l1));

        ArrayList<Integer> l2 = new ArrayList<Integer>();
        System.out.println("Is array list empty : " +p1.test(l2));

    }
}
