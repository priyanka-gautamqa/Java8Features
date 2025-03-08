package PrimitiveTypeFunctionalInterfaces;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceExample {

    public static void main(String[] args){
        /*
       Function<T,R> : one input type and one return type
                    Function<T,T> : when input type and return type are same then we can use Unary operator
                    UnaryOperator<T>

                UnaryOperator->IntUnaryOperator : for better performance or to avoid autoboxing and auto-unboxing
                */

        Function<Integer,Integer> f= i->i*i;
        System.out.println(f.apply(5));

        UnaryOperator<Integer> f1= i->i*i;
        System.out.println(f1.apply(6));

        //Primitive version

        IntUnaryOperator f2= i->i*i;
        System.out.println(f2.applyAsInt(6));



    }
}
