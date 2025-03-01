package functionInterface;

import java.util.function.Function;

public class ExampleOne {

    public static void main(String[] args){
        /*Find length of string using functional Interface Function
            Function<T,R> : T is input type and R is return type
            It can return any specified value - boolean,integer,string and so on..
            method name is apply()
            public R apply(T t)
        */

        //Find length of String
        Function<String,Integer> f= str->str.length();
        System.out.println("Length of given string is : "+f.apply("priyanka"));
        System.out.println("Length of given string is : "+f.apply("gautam"));

        //Return square of integer number
        Function<Integer,Integer> f1 = n->n*n;
        System.out.println("Square of 4 : "+f1.apply(4));
        System.out.println("Square of 4 : "+f1.apply(50));

       /* Remove the spaces from the given string
    and return the string*/
        Function<String,String> f2 = str1->str1.replaceAll(" ","");
        System.out.println("New String for  : Java Eight Features : "+f2.apply("Java Eight Features"));

 /* Count number of spaces
  in the given string
  String length with spaces-string length without spaces
  */
        Function<String,Integer> f3 = str1->str1.length()-(str1.replaceAll(" ","").length());
        System.out.println("Number of spaces present : Java Eight Features : "+f3.apply("Java Eight Features"));

    }
}
