package streams;

import java.util.ArrayList;

public class Example4 {

    public static void main(String[] args){

        ArrayList<String> l = new ArrayList<String>();
        l.add("java");
        l.add("learning");
        l.add("2025");

//Lambda Expression
        l.stream().forEach(s->System.out.println(s));

        //Method reference
        l.stream().forEach(System.out::println);
/*
toArray() method
            */
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(0);
        list.add(25);
        list.add(15);
        list.add(20);

        System.out.println(list);

        Integer[] array = list.stream().toArray(Integer[]::new);
        for(Integer x:array){
            System.out.println(x);
        }
    }
}
