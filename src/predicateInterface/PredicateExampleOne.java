package predicateInterface;

import java.util.function.Predicate;

public class PredicateExampleOne {

    /*Program to display names
    starts with 'k' by using predicate*/

    public static void m1(String[] names,Predicate<String> p){
        for(String s:names){
            if(p.test(s)){
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args){
        String[] names  = {"Sunny","Kajol","Malaika", "Katrina"};
        Predicate<String> p1 = s->s.charAt(0)=='K';
        System.out.println("Names starting with character k are : ");
        m1(names,p1);




    }




}
