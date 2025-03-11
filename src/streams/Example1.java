package streams;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args){

        /*PROBLEM 1 :Given array list of integer
            filter the even numbers from the list
                Add to another list
                    Print the list
                        Ways to do -
                            1. using collection concept and methods [without stream until 1.7 version]
                            2. Using Streams concept and methods [with stream 1.8 version]
                */

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(0);
        al.add(30);
        al.add(35);
        al.add(15);
        al.add(5);
        al.add(10);
        al.add(20);
        al.add(25);

        System.out.println("Given list : "+al);

        //using collection concept and methods

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(Integer i : al){
            if(i%2==0){
                list1.add(i);
            }
        }
        System.out.println("using collection concept and methods even integers: "+list1);

        //  Using Streams concept and methods

        List<Integer> list2 = al.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Using Streams concept and methods even integers: "+list2);


         /*PROBLEM 2 :Given array list of integer
                double each integer present in the list
                    Add to another list
                        Print the list
                            Ways to do -
                            1. using collection concept and methods [without stream until 1.7 version]
                            2. Using Streams concept and methods [with stream 1.8 version]
                */

        //Without stream

        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for(Integer i : al){

                list3.add(i*2);
        }
        System.out.println("using collection concept and methods - double of each integer: "+list3);

        //With stream

        List<Integer> list4 = al.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println("Using Streams concept and methods -double of each integer : "+list4);



    }
}
