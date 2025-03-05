package supplierInterface;

import java.util.Date;
import java.util.function.Supplier;

public class ExampleOne {

    public static void main(String[] args)
    {

       /* Supplier returns something,
            so we have to provide return type as parameter
            it doesn't require any argument type

            It takes only one parameter which defines the return type
            */

        //Get System Date - Now we can use s.get() every time we need a date
        Supplier<Date> s = () -> new Date();
        System.out.println("Date 1: "+s.get());
        System.out.println("Date 2: "+s.get());

        //Get Random name
        /*Math.random() --> generates random value between 0 and 1. 0<=x<1
        To generate numbers between 0 and 3 we need to perform two things
        Multiply by 4 and typecasting
        for e.g. to ger random number 3 --> o.99*4 = 3.6.. -> because of type casting it will be 3    */

        Supplier<String> s1 = ()-> {
          String[] names = {"tinny","vinny","chinny","bunny","sunny"};
        int x = (int)(Math.random()*4);
        return names[x];
        };

        System.out.println("Random name 1: "+s1.get());
        System.out.println("Random name 2: "+s1.get());
        System.out.println("Random name 3: "+s1.get());




    }

}
