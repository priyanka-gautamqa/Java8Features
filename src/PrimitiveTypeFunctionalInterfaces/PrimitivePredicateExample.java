package PrimitiveTypeFunctionalInterfaces;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PrimitivePredicateExample {

    public static void main(String[] args){

        System.out.println("IntPredicate");

        int[] x = {1,4,7,9,10,14,15,20};
        IntPredicate ip = i->i%2==0;
        for(int x1:x){
            if(ip.test(x1)){
                System.out.println(x1);
            }
        }

       /* //Because of [internal] autoboxing and unboxing - Performance is higher, hence need of primitive functional interfaces
        Predicate<Integer> p= i->i%2==0;
        for (int x1 : x)
        {
            if(p.test(x1))
            {
                System.out.println(x1);
            }
        }
*/
        /*
        System.out.println("LongPredicate");
        long[] l = {1,4,7,9,10,14,15,20};
        LongPredicate lp = i->i%2==0;
        for(long x1:l){
            if(lp.test(x1)){
                System.out.println(x1);
            }
        }

        System.out.println("DoublePredicate");
        double[] d = {1.3,4,7.345,9,10,14};
        DoublePredicate dp = i->i%2==0;
        for(double x1:d){
            if(dp.test(x1)){
                System.out.println(x1);
            }
        }

*/
    }
}
