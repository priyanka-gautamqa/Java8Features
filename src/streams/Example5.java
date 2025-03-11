package streams;

import java.util.stream.Stream;

public class Example5 {
    public static void main(String[] args){

        //For any group of values
        Stream<Integer> i = Stream.of(9,99,999,9999,99999);
        i.forEach(System.out::println);

        //For arrays
        Double[] d = {10.0,2.7,3.5,10.9,4.5};
        Stream<Double> s1 = Stream.of(d);
        s1.forEach(System.out::println);

    }
}
