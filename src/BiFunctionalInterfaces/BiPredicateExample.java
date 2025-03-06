package BiFunctionalInterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {

    public static void main(String[] args){

        /*Bi-Predicate to check
        if sum of two integers is even or not*/
        BiPredicate<Integer,Integer> p = (a, b)->(a+b)%2==0;
        System.out.println("sum of 2 and 5 is even : "+p.test(2,5));
        System.out.println("sum of 2 and 4 is even : "+p.test(2,6));

    }
}
