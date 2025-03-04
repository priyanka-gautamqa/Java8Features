package consumerInterface;

import java.util.function.Consumer;

public class Example1 {

    public static void main(String[] args){

        Consumer<String> c = s->System.out.println(s);
        c.accept("Hi this is example 1");
        c.accept("Java 8 feature");



    }
}
