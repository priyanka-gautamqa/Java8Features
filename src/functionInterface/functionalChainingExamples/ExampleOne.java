package functionInterface.functionalChainingExamples;

import java.util.function.Function;

public class ExampleOne {

    public static void main(String[] args){

        Function<String,String> f1 = s->s.toUpperCase();
        Function<String,String> f2 = s->s.substring(0,10);

        System.out.println("RESULT f1 : "+f1.apply("PriyankaGautam"));
        System.out.println("RESULT f2 : "+f2.apply("PriyankaGautam"));

        System.out.println("RESULT f1 andThen() f2 : "+f1.andThen(f2).apply("PriyankaGautam"));
        System.out.println("RESULT f1 compose() f2 : "+f1.compose(f2).apply("PriyankaGautam"));




    }
}
