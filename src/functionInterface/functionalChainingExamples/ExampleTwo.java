package functionInterface.functionalChainingExamples;

import java.util.function.Function;

public class ExampleTwo {

    public static void main(String[] args){

        Function<Integer,Integer> f1 = i -> i+i;

        Function<Integer,Integer> f2 = i -> i*i*i;

     /*   f1.andThen(f2).apply(2)
               f1 :  2+2 = 4 is returned
                Than 4 will be the new integer for f2
                from f2 : 4*4*4 = 64
                */
        System.out.println("RESULT f1.andThen(f2) : "+f1.andThen(f2).apply(2));
       // System.out.println("RESULT f2.andThen(f1) : "+f2.andThen(f1).apply(2));

         /*   f1.compose(f2).apply(2)
               f2 will be executed first :  2*2*2 = 8 is returned
                Than 8 will be the new integer for f1
                from f1 : 8+8 = 16
                */

        System.out.println("RESULT f1.compose(f2) : "+f1.compose(f2).apply(2));
       // System.out.println("RESULT f2.compose(f1) : "+f2.compose(f1).apply(2));




    }
}
