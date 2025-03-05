package predicateInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExampleTwo {

    /*Example to remove null values and empty string from the given array and return in form of list*/

    public static void m1(String[] names,Predicate<String> p){
        ArrayList<String> al = new ArrayList<String>();
        for(String s:names){
            if(p.test(s)){
                al.add(s);
            }
        }
        System.out.println(al);
    }

    public static void main(String[] args){
        String[] names  = {"Raha","Kajol",null, "","Priyanka","",null};
        Predicate<String> p1 = s->s!=null && s.length()!=0;
        System.out.println("Names starting with character K are : ");
        m1(names,p1);




    }




}
