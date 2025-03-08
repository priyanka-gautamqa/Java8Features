package PrimitiveTypeFunctionalInterfaces;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFunctionExample {

    public static void main(String[] args) {

       /* //Performance is higher as autoboxing and auto-unboxing is happening internally
        Function<Integer,Integer> f = i->i*i;
        System.out.println(f.apply(4));

    */

        //IntFunction -> only need to provide return type . The name suggest input type is always "int"
        // hence no need to specify exclusively. Below <Integer> tells about the return type

        IntFunction<Integer> inf = i->i*i;
        System.out.println(inf.apply(4));

       /*
         ================================================
        //finding length of the string - Input type is String type, Return type is Integer . Performance impacted
        Function<String,Integer> f = s->s.length();

        //Now we can also specify that return type is int.
        // Now below example  "<String>" tells about the argument type and name of the function tells that int value will be returned


        */
        ToIntFunction<String> tif = s->s.length();
        System.out.println(tif.applyAsInt("priya"));


        //input type as int and double as return type - no  need to specify
        IntToDoubleFunction f1 = i->Math.sqrt(i);
        System.out.println(f1.applyAsDouble(5));





    }
}
