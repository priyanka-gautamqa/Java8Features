package predicateInterface;

import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args){
        //Predicate is boolean valued function, check some condition and return boolean value

        Predicate<Integer> p = I-> I>10; //The condition if given integer is greater than 10 or not - Lambda expression for referring to the test method present in Predicate interface
        System.out.println(p.test(100));
        System.out.println(p.test(6));


    }
}
