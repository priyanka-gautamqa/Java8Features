package PrimitiveTypeFunctionalInterfaces;

import java.util.function.*;

public class BinaryOperatorInterfaceExample {

    public static void main(String[] args){
        /*
       Function<T,R> : one input type and one return type
                    Function<T,T> : when input type and return type are same then we can use Unary operator
                    UnaryOperator<T>
       Function<T,U,R> : Two input types and one return type
                        Function<T,T,R> : when both input types  and return type are same then we can use Binary operator
                    BinaryOperator<T>

                    More convenient to use. No need to say String String String  three times.

                */

        BiFunction<String,String,String> f=(s1, s2)->s1+s2;
        System.out.println(f.apply("Automation","Testing"));

        BinaryOperator<String> b=(s1, s2)->s1+s2;
        System.out.println(b.apply("Automation","Testing"));

//Primitive version

        BinaryOperator<Integer> b1=(i1,i2)->i1+i2;
        System.out.println(b1.apply(10,20));

        IntBinaryOperator b2 = (i1,i2)->i1+i2;
        System.out.println(b2.applyAsInt(10,20));


    }
}
