package BiFunctionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args){

        /*Take two input arguments
        Perform some operations
                return nothing - accept method with void return type*/

        BiConsumer<String,String> c = (s1,s2)->System.out.println(s1+s2);

        System.out.println("Concatenation of two strings : ");
        c.accept("Priyanka","Gautam");

    }

}
