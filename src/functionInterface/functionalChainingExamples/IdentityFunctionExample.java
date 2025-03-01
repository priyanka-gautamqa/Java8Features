package functionInterface.functionalChainingExamples;

import java.util.function.Function;

public class IdentityFunctionExample {

    //static function - identity
    //Returns a function that always returns its input argument

    public static void main(String[] args){
        Function<String,String> f1 = Function.identity();
        String s2 = f1.apply("durga");
        System.out.println(s2);
    }
}
