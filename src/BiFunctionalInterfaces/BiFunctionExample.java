package BiFunctionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args){

       /* Write a function to
        take two input arguments and
        return the product*/
        BiFunction<Integer,Integer,Integer> f = (a,b)-> a*b;

        System.out.println("Product of 50 and 60 is : "+f.apply(50,60));
        System.out.println("Product of 20 and 25 is : "+f.apply(20,25));

    }
}
