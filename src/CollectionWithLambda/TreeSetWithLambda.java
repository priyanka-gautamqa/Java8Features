package CollectionWithLambda;

import java.util.TreeSet;

public class TreeSetWithLambda {

    public static void main(String[] args){
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(10);
        t.add(0);
        t.add(20);
        t.add(15);
        t.add(5);
        System.out.println("TREE SET - DEFAULT NATURAL SORTING ORDER : "+t);

        System.out.println("CUSTOMIZED SORTING - WITH LAMBDA EXPRESSIONS");
        TreeSet<Integer> t1 = new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
        t1.add(10);
        t1.add(0);
        t1.add(20);
        t1.add(15);
        t1.add(5);
        System.out.println(t1);


    }
}
